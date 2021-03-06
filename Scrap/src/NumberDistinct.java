
public class NumberDistinct {

	public static void main(String[] args) {
		System.out.println(numDistincts("raabbbbit", "rabbit"));

	}

	public static int numDistincts(String S, String T) {
		int[][] table = new int[S.length() + 1][T.length() + 1];
	 
		for (int i = 0; i < S.length(); i++)
			table[i][0] = 1;
	 
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j < T.length(); j++) {
				if (S.charAt(i) == T.charAt(j)) {
					table[i+1][j+1] += table[i][j] + table[i][j+1];
				} else {
					table[i+1][j+1] += table[i][j+1];
				}
			}
		}
		
		for(int  i =0;i<=S.length();i++){
			for(int j=0;j<=T.length();j++){
				System.out.print(table[i][j]+" ");
			}
		System.out.println();
		}
	 
		return table[S.length()][T.length()];
	}
}
