import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class InArrayProb {
	
	 static class LexiComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
		if(o1.length() > o2.length())
				return 1;
			else if(o1.length() < o2.length())
				return -1;
			else
				return o1.compareTo(o2);
		}
	}

	public static void main(String[] args) {
		String[] a11= {"arp", "live", "rp", "live", "strong"};
		String[] a12 = {"lively", "alive", "harp", "sharp", "armstrong"};
		String[] a21 = {"tarp", "mice", "bull"};
		String[] a22 = {"lively", "alive", "harp", "sharp", "armstrong"};
		String[] a31 = {"1295", "code", "1346", "1028", "ar"};
		String[] a32 = {"12951295", "ode", "46", "10281066", "par"};
		String[] result = inArray(a31, a32);
		for(String s:result)
			System.out.print(s+ " ");
	}

		 public static String[] inArray(String[] array1, String[] array2) {
			  
		  ArrayList<String> a1List = new ArrayList<String>();
			Arrays.sort(array1); 
			test:
		     for(int i=0; i<array1.length; i++){
		       for(int j=1; j<array1.length; j++){
		         if(array1[j].indexOf(array1[i])==array1[j].length())
		           continue test;
		        }
		       for(String s:array2){
		    	   if(s.indexOf(array1[i])!=-1){
		    		   a1List.add(array1[i]);   
		    		   break;
		    	   }
		       }
		     }
	       if(a1List.isEmpty())
	         return new String[]{};
	         else
		       return a1List.toArray(new String[a1List.size()]);    
			}
}


