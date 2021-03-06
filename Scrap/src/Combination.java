import java.util.ArrayList;
import java.util.HashSet;

public class Combination {

	public static void main(String[] args) {
		HashSet<ArrayList<Integer>> out = new HashSet<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		comb(new int[]{2,3,6,7} ,7, 0, temp, out);	
	}

	private static void comb(int[] inp, int t, int tempNum, ArrayList<Integer> tempList, HashSet<ArrayList<Integer>> out) {
		if(t==0){
			ArrayList<Integer> temp = new ArrayList<Integer>(tempList);
			out.add(temp);
			return;
		}
		for(int i=tempNum; i<inp.length; i++){	
			if(inp[i]>t)
				return;
			tempList.add(inp[i]);
			comb(inp, t-inp[i] ,i, tempList, out);
			tempList.remove(tempList.size()-1);
		}
		System.out.println(out);
	}

}
