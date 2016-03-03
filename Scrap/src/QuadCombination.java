import java.util.ArrayList;
import java.util.List;

class QuadCombinations {
   public static void main(String[] args) {
      String pramp = "Practice Makes Perfect";
      System.out.println(pramp);
      
       int arr[] = {4,1,-6,-2,3,0};
       int s=-8;
       System.out.println(quadComb(arr, s));
      
      
   }
   
   private static List<Integer> quadComb(int arr[], int s){
      int result=0;
      int count=0;
      List<Integer> testList = new ArrayList<Integer>();
      for(int i=0;i<arr.length;i++){
         result += arr[i];
         testList.add(arr[i]);
         if(result>s || arr[i]<0){
            result-=arr[i];
            testList.remove(testList.size()-1);
         }
         count++;
         if(count>=4){
            return testList;
         }
      }
      return null;
   }
 
}