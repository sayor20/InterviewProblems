
public class NumberTest {
	
	
	    public int[] plusOne(int[] digits) {
	        String numberInArray = "";
	        int numberAdded = 0;
	        for(int i = 0; i < digits.length; i++){
	            numberInArray += digits[i]; 
	        }
	        //int foo = Integer.parseInt("1234");
	        
	        long realNumber = Long.parseLong(numberInArray);
	        long numberAdded1 = realNumber + 1;
	        int len = String.valueOf(numberAdded1).length();
	        int[] finalNumber = new int[len];
	        do{
	            finalNumber[--len]=(int) (numberAdded1%10);
	            numberAdded1= numberAdded1/10;
	        }while(numberAdded1 %10!=0);
	    return finalNumber;
	    }
	

	
	public static void main(String[] args) {
		NumberTest test = new NumberTest();
		int numberArray[] = {9,8,7,6,5,4,3,2,1,0};
		test.plusOne(numberArray);
	}

}
