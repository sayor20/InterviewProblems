import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println(generate(5));
	}

	private static ArrayList<ArrayList<Integer>> generate(int n) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(1);
		while(n>0){
			
			result.add(temp);
			temp.clear();
			n--;
		}
		return result;
	}

}
