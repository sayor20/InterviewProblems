import java.util.Stack;

// program for infix to postfix expression

public class IntoPre {

	public static void main(String[] args) {
		
		String inputString = "(A*B)+(C/D)";
		char[] inputArray = inputString.toCharArray();
		Stack<Character> buffer= new Stack<Character>();
		char[] outputArray = new char[inputArray.length];
		int index=0;
		
		for(int i=0;i<inputArray.length;i++){
			if(isOperator(inputArray[i])){
				if(buffer.empty()){
					buffer.push(inputArray[i]);
				}else{
							if(!buffer.empty() && operatorPrecedence(buffer.peek()) <= operatorPrecedence(inputArray[i])){
								outputArray[index] = buffer.pop();
								index++;
							}
					buffer.push(inputArray[i]);
				}
			}else{
				outputArray[index] = inputArray[i];
				index++;
			}
		}
		while(!buffer.empty()){
			outputArray[index] = buffer.pop();
			index++;
		}
		for(int i=0;i<outputArray.length;i++)
			System.out.print(outputArray[i]+" ");	// expected output = ( (A B *) (C D /) +)
	}
	
	private static boolean isOperator(char c){
		if(c== '(' || c== ')' || c== '+' || c== '-' || c== '*' || c== '/')
			return true;
		else
			return false;
	}
	
	private static int operatorPrecedence(char c){
		switch(c){
		case '(':
		case ')':
			return 1;
		case '+':
		case '-':
			return 2;
		case '*':
		case '/':
			return 3;
		default:
			return 10;//insert error handling 
		}
	}
}
