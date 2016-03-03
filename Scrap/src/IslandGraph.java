import java.util.ArrayList;
import java.util.List;

class Pramp {
   public static void main(String[] args) {
      String pramp = "Practice Makes Perfect";
      System.out.println(pramp);
      
   }
   System.out.println(countIslands(input));
}

   public static int countIslands(int[][] input) {
      int count=0;
   
      for(int i=0; i<input.length;i++){
         for(int j=0; j<input[0].length;j++){
            if(input[i][j]==1){
               count++;
               exploreIsland(input, i ,j);
            }
         }
      }
      return count;
   }

   public static exploreIsland(input, i , j){
      Queue<int[]> adjQueue = new LinkedList<int[]>();
      adjQueue.add(new int[]{i,j});
      while(!adjQueue.isEmpty()){  
         
      int[] temp = (adjQueue.remove());
      int i = temp[0];
      int j = temp[1];
         
      if(input[i+1][j]==1){
         adjQueue.add(new int[]{i+1,j});
         input[i+1][j]=2;
      }
      if(input[i][j+1]==1){
         adjQueue.add(new int[]{i,j+1});
         input[i+1][j]=2;
      }
      if(input[i][j-1]==1){
         adjQueue.add(new int[]{i,j-1}); 
         input[i][j-1]=2;
      }
      if(input[i-1][j]==1){
         adjQueue.add(new int[]{i-1,j});
         input[i-1][j]=2;
      }
      }
   }


