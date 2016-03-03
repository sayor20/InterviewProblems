import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Election {

	public static void main(String[] args) {
		ArrayList<String> listOfBallots =new ArrayList<String>();
		listOfBallots.add("A");
		listOfBallots.add("A");
		listOfBallots.add("A");
		listOfBallots.add("B");
		listOfBallots.add("B");
		System.out.println(getWinner(listOfBallots));
	}

	 public static String getWinner(final List<String> listOfBallots) {
	      HashMap<String, Integer> countMap = new HashMap<String, Integer>();
	      String tempString = null;;
	      int tempCount=0;
	      
	      for(int i=0, size = listOfBallots.size(); i< size;i++){
	      tempString = listOfBallots.get(i);
	      if(countMap.get(tempString) != null)
	    	  tempCount = countMap.get(tempString);
	      else
	    	  tempCount = 0;
	        if(tempCount>0){
	          countMap.put(tempString, ++tempCount);
	          if(tempCount>size/2)
	        	  return tempString;
	        }
	        else{
	          countMap.put(tempString, 1);
	        }
	      }
	    return null;
	    }
	 
}
