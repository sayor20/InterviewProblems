class MeetingPlanner {
   public static void main(String[] args) {
      int dur = 100;
      // 1000 1200 = 200
      // 1100 1300 = 200
      
     // 1100   1200 
         
      int timesA[][] = new int[3][2]  {
         [1000, 1200]
         [1500, 1700]
         [1700, 1950]
      };
      int timesB[][] = new int[3][2]  {
         [1100, 1300]
         [1400, 1500]
         [1900, 2000]
      };
      
      meetingPlanner(dur, timesA, timesB);
      
   }   
   
   public static int[] meetingPlanner(int dur, int timesA[], int timesB[]){
      for(int i=0; i<timesB[0].length;i++){
         start = Math.max(timesA[0][0], timesB[i][0]);
         end = Math.min(timesA[0][1], timesB[i][1]);
         if(end - start >= dur)
         {
                return new int[]{start, end};              
         }
      }
      return int[];        
      
   }
}
