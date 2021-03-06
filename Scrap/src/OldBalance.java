

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;

public class OldBalance {
        // property of the balance
        public boolean balanced = false;// balance is balanced or not
        public int nodeID;//balance id
        public Balance[] leftChild = null;// array of balances in left side of this balance
        public Balance[] rightChild = null;// array of balances in right side of this balance
        public int balanceWeight = 10;// self weight
        public int leftWeight = 0;// total weight of left side of this balance
        public int rightWeight = 0;// total weight of right side of this balance
        public int adding = 0;// how many additional weights should be added in order to balance this balance

        // recursive balancing method
        public static int balancing(Balance node) {
                // check whether it has left children or right children
                if (node.leftChild != null) {
                        for (int i = 0; i < node.leftChild.length; i++)
                                node.leftWeight += balancing(node.leftChild[i]);
                }  
                if (node.rightChild != null) {
                        for (int i = 0; i < node.rightChild.length; i++) {
                                node.rightWeight += balancing(node.rightChild[i]);
                        }
                }
                // left children and right children is balanced, now balance itself 
                node.adding = Math.abs(node.leftWeight - node.rightWeight);
                //mark balanced for this balance
                node.balanced = true;
                return node.balanceWeight + node.leftWeight + node.rightWeight
                                + node.adding;
        }

        public static void main(String[] args) {
                int N = 0;
                Balance[] Balances;
                BufferedReader br;
                try {
                        // load file
                        br = new BufferedReader(new FileReader("input00.txt"));
                        // first line
                        String string = br.readLine();
                        N = Integer.parseInt(string);
                        // init balances array
                        Balances = new Balance[N];
                        int i = 0;
                        for (int k = 0; k < N; k++) {
                                Balances[k] = new Balance();
                                Balances[k].nodeID = k;
                        }
                        /*
                         * read data per line. Two lines is a loop
                         */
                        while ((string = br.readLine()) != null) {
                                // init left side
                                String[] strs = string.split(" ");
                                Balances[i].leftWeight = Integer.parseInt(strs[0]);
                                /*
                                 * if length > 1, it has balances in the left
                                 * 
                                 */
                                if (strs.length != 1)
                                        Balances[i].leftChild = new Balance[strs.length - 1];
                                for (int j = 1; j < strs.length; j++) {
                                        Balances[i].leftChild[j - 1] = Balances[Integer
                                                        .parseInt(strs[j])];
                                }
                                // init right side
                                string = br.readLine();
                                String[] strs1 = string.split(" ");
                                Balances[i].rightWeight = Integer.parseInt(strs1[0]);
                                // the same as left side
                                if (strs1.length != 1)
                                        Balances[i].rightChild = new Balance[strs1.length - 1];
                                for (int j = 1; j < strs1.length; j++) {
                                        Balances[i].rightChild[j - 1] = Balances[Integer
                                                        .parseInt(strs1[j])];
                                }
                                i++;
                        }

                        // start balancing
                        for (i = 0; i < Balances.length; i++) {
                                if (!Balances[i].balanced)
                                        Balance.balancing(Balances[i]);
                        }

                        //output
                        for (int m = 0; m < Balances.length; m++) {
                                if (Balances[m].leftWeight < Balances[m].rightWeight)
                                        System.out.println(m + ": " + Balances[m].adding + " 0");
                                else if (Balances[m].leftWeight >= Balances[m].rightWeight)
                                        System.out.println(m + ": 0 " + Balances[m].adding);
                        }
                } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }

        }

} 