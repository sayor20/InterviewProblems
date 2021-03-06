import java.util.Arrays;
import java.util.HashMap;
import java.lang.StringBuilder;

public class Roman {

	public static void main(String args[]){
		System.out.println(new Test101().solution(1666));
	}
  
    public String solution(int n) {
    	StringBuilder sb;
        int[] symArr;
        HashMap<Integer, Character> symTable;
    	sb = new StringBuilder();
    	symArr = new int[]{1, 1, 5, 10, 50, 100, 500, 1000, 5000};
    	symTable = new HashMap<Integer, Character>();
        symTable.put(1, 'I');
        symTable.put(5, 'V');
        symTable.put(10, 'X');
        symTable.put(50, 'L');
        symTable.put(100, 'C');
        symTable.put(500, 'D');
        symTable.put(1000, 'M');	
        symTable.put(5000, 'M');

      int oneth = n%10;
      int tenth = (n%100)/10;
      int hundth = (n%1000)/100;
      int thousth = (n%10000)/1000;      
      if(thousth!=0)
        sb.append(computeRoman(thousth*1000, symArr, symTable));  
      if(hundth!=0)
        sb.append(computeRoman(hundth*100, symArr, symTable));
      if(tenth!=0)
        sb.append(computeRoman(tenth*10, symArr, symTable));  
      if(oneth!=0)
        sb.append(computeRoman(oneth, symArr, symTable));
      return sb.toString();
    }

    public char[] computeRoman(int n, int[] symArr, HashMap<Integer, Character> symTable){
      int i=0;
      for(;i<=7 && n>=symArr[i];i++){
    	  int temp = symArr[i];
    	  if(n==temp)
    		  return new char[]{symTable.get(temp)};
      }
      int x = symArr[i-2];
      int y = symArr[i-1];
      int z = symArr[i];
      if(n==(z-y))
          return new char[]{symTable.get(y), symTable.get(z)};
      else if(n==(z-x))
          return new char[]{symTable.get(x), symTable.get(z)};
      else if(n==(y+y))
	  	  return new char[]{symTable.get(y), symTable.get(y)};
      else if(n==(y+y+y))
		  return new char[]{symTable.get(y), symTable.get(y), symTable.get(y)};      
      else if(n==(y+x))  
          return new char[]{symTable.get(y), symTable.get(x)};
      else if(n==(y+x+x))  
          return new char[]{symTable.get(y), symTable.get(x), symTable.get(x)};
      else if(n==(y+x+x+x))
          return new char[]{symTable.get(y), symTable.get(x), symTable.get(x), symTable.get(x)};
      else
          return new char[]{};
    }
}