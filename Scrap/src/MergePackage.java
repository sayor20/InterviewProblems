import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class MergePackage {

	public static void main(String[] args) {
		/*
		int[] test = {4,3,6,10,2,7,9,5,8,1};
		PriorityQueue<Integer> h = new PriorityQueue<Integer>();
		for(int i=0; i<test.length;i++)
			h.add(test[i]);
		System.out.println(h);
		Iterator<Integer> iter = h.iterator();
		if(iter.hasNext()){
			System.out.println(h.poll());
			iter.next();
		} */
		String s = "bBaA";
		char [] sArray = s.toCharArray();
		Arrays.sort(sArray);
		System.out.println(sArray);
	}
	class Pramp {
		   public static void main(String[] args) {
		      int[] arr = {10,12,32,54,32};// 10 12 32 32 54
		      Arrays.sort(arr);
		      /*SortedSet<Integer> packageSet = new TreeSet<Integer>();
		      Set<Integer> packSet = new HashSet<Integer>();
		      for(int i=0; i <arr.length;i++){
		         packSet.add(arr[i]);
		      }
		      */
		      mergePackage(arr);
		   }
		   
		   public static int[] mergePackage(int arr[]){
		      int weightlimit = 65;
		      int start=0, temp =1;
		      int i1=0,i2=0, result=0;
		      int end=arr.length-1;
		      while(start<end){
		         temp = arr[start]+arr[end];
		         if(temp <= weightlimit){
		            if(temp > result){
		               result = temp;
		               i1 = start;
		               i2 = end;
		            }
		         }
		         start++;
		         end--;
		      }
		      if(result==0)
		         return new int[]{-1, -1};
		      return new int[]{i1,i2};
		   }
		   [11,12,13,14,15]
		   limit = 40;
		   {1,2}
		   3
		   return [1, 3]
		}
}
