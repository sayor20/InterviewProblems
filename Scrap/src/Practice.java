
public class Practice {
	
	@SuppressWarnings("unused")
	public static void main(String args[]){
		int wordStart=0;
		char[] testArr = {'p','e','r','f','e','c','t',' ','m','a','k','e','s',' ','p','r','a','c','t','i','c','e'};
		
		if(testArr == null){
			System.out.print("Empty input. Nothing to reverse.");
			return;
		}
		
		mirrorReverse(testArr, 0, testArr.length-1);
		
		for(int i=0;i<testArr.length-1;i++){
			if(testArr[i]==' '){
				mirrorReverse(testArr, wordStart, i-1);
				wordStart = i+1;
			}
		}
		
		mirrorReverse(testArr, wordStart, testArr.length-1);
		System.out.print(testArr);
	}
	
	public static void mirrorReverse(char[] arr, int start, int end){
	char temp;
		while(start<end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
