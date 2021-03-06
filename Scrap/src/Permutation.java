import java.util.SortedSet;
import java.util.TreeSet;

public class Permutation {

	public static void main(String[] args) {
		String test= "ABCD";
		char[] testArr = test.toCharArray();
		SortedSet<String> res = new TreeSet<String>();
		System.out.print(permutate(res, testArr, 0, testArr.length-1));
	}

	private static SortedSet<String> permutate(SortedSet<String> res, char[] str, int i, int j) {
		if(i==j){
			res.add(String.valueOf(str));
		}
		else
		{
			for(int k=0;k<=j;k++){
				swap(str, 1, k);
				permutate(res, str, i+1, j);
				swap(str, 1, k);
			}
		}
		return res;
	}

	private static void swap(char[] str, int a, int b) {
		char temp;
		temp = str[a];
		str[a] = str[b];
		str[b] = temp;
	}

}
