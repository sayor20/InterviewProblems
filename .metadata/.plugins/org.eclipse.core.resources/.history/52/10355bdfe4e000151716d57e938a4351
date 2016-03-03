import java.lang.StringBuilder;

public class CarMileage {

  public static int isInteresting(int number, int[] awesomePhrases) {
	  
  	int num0 = number;
  	int num1 = number + 1;
  	int num2 = number + 2;
    String numStr0 = Integer.toString(num0);
    String numStr1 = Integer.toString(num1);
    String numStr2 = Integer.toString(num2);
    String revNumStr0 = new StringBuilder(numStr0).reverse().toString();
    String revNumStr1 = new StringBuilder(numStr1).reverse().toString();
    String revNumStr2 = new StringBuilder(numStr2).reverse().toString();
  	char[] numArr0 = numStr0.toCharArray();    
    char[] numArr1 = numStr1.toCharArray();
    char[] numArr2 = numStr2.toCharArray();
    
    // less 100 check
  	if(num2<100)
    	return 0;
    if(num0%100==0)
			return 2;
    if(num0==99)
    	return 1;
    // interesting number palindrome check
    if(numStr0.equals(revNumStr0))
    	return 2;
    if((num1%100==0) || (num2%100==0))
    	return 1;
    // awesomephrases check
    for(int x:awesomePhrases){
    	if(x==num0)
      	return 2;
      if(x==num1 || x == num2)
      	return 1;
    }  
    // increasing seq or dec seq check
		if(checkSeq(numArr0))
    	return 2;
    if(checkSeq(numArr1) || checkSeq(numArr2) || numStr1.equals(revNumStr1) || numStr2.equals(revNumStr2))
    	return 1;
    return 0;
	}
  
  public static boolean checkSeq(char []numArr){
    int prev = (int) numArr[0];
    int add = 0;
    if(numArr[0] < numArr[1])
    	add = -1;
    else
    	add = 1;
    for(int i=1;i<numArr.length;i++){
    	int curr = (int)numArr[i];
    	if(curr == 48 && add == -1)
      	curr = curr + 10;
    	if(prev == (int)curr + add)
				prev = (int)curr;
      else
      	return false;
    }
  	return true;
  }
}