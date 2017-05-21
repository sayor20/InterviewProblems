public class CountNonZero {

	public static int countNonZero(int[] arr){
		int i=0, zIndex = 0;
		int len = arr.length;
		
		if(arr==null || arr.length<0)
			return 0;
		
		while(i<len && zIndex<len){
			while(i<len && arr[i]==0)
				i++;
			while(zIndex<len && arr[zIndex]!=0)
				zIndex++;
			if(i<len && i>zIndex)
				swap(arr, i, zIndex);
			else
				i=i+1;
		}
		
		return zIndex;
	}
	
	private static void swap(int[] input, int i, int j) {
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
		
	}
	public static void main(String[] args) {
		System.out.println(countNonZero(new int[]{0,0,4,0,0,0}));
	}

}
