import java.util.HashMap;
import java.util.Map;

public class MapSubString {
	static int arrCount = 0;
	public static void main(String[] args) {		
	char[] arr= new char[]{'x', 'y', 'z'};
	arrCount = arr.length;
	Map<Character, Integer> countMap = new HashMap<Character, Integer>();
	for(int i=0;i<arr.length;i++)
		countMap.put(arr[i], 1);
	String str = "xyyzyzyx";
	SmallestSubString(countMap, str);
	
	}
	private static void SmallestSubString(Map arrMap, String str){
		Map<Character, Integer> localMap;
	    for(int i=0; i<str.length()- arrCount + 1;i++){
	        localMap = new HashMap<Character, Integer>(arrMap);
	        try{
	        if(localMap.containsKey((str.charAt(i)))){
	            localMap.remove(str.charAt(i));
	            if(localMap.containsKey((str.charAt(i+1)))){
	            	localMap.remove(str.charAt(i+1));  
	                if(localMap.containsKey((str.charAt(i+2)))){
	                	localMap.remove(str.charAt(i+2));  
	                   System.out.println(str.charAt(i)+""+str.charAt(i+1)+str.charAt(i+2));
	                   return;
	                }
	            }
	        }
	        }
	        catch(Exception e){
	        	  System.out.println("error");
	        	  continue;
	        }
	    }
	}
}


=======

class Pramp {
	   public static void main(String[] args) {
	      int grant[] = {10, 30, 20, 50}; //110 10 20 30 50
	      int budget = 100;
	      Arrays.sort(grant);
	      for(int i=grant.length-1;i>=0;i--){
	         if(calculateBudget(grant[i], grant, budget)){
	            System.out.println("New cap = "+ grant[i]);
	            return;
	         }
	      }
	      
	   }
	   
	   private static boolean calculateBudget(int testCap, int testGrant[],int testBudget){
	         int est= 0;
	         for(int i=0;i<grant.length;i++)
	         {
	            if (testGrant[i]>testCap){
	               testGrant[i]=testCap;
	            }
	            est += testGrant[i];
	         }
	         if(est>budget){
	            return false;
	         }else{
	           return true; 
	         }
	      }
	}
