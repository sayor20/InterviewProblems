import java.util.HashMap;

public class FindWord {

	static int count =0;
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Character, Integer> alt = new HashMap<Character, Integer>();
		HashMap<Character, Boolean> bool = new HashMap<Character, Boolean>();
		map.put(0, "abc");
		map.put(1, "def");
		map.put(2, "ghi");
		
		alt.put('a', 0);
		alt.put('b', 0);
		alt.put('c', 0);
		alt.put('d', 1);
		alt.put('e', 1);
		alt.put('f', 1);
		alt.put('g', 2);
		alt.put('h', 2);
		alt.put('i', 2);
		findWords(map, bool, alt, 'a');
		System.out.println(count);
	}

	private static void findWords(HashMap<Integer,String> map, HashMap<Character, Boolean> bool, HashMap<Character, Integer> alt, char val) {	
		count++;
		bool.put(val, true);
			for(int j=0, i=alt.get(val)+1;map.get(i)!=null && j<map.get(i).length();j++){
				char temp = map.get(i).charAt(j);
				if(bool.get(temp)==null){
					System.out.print(temp);	
					findWords(map, bool, alt, temp);
				}
			}	
			System.out.println();
	}
	
}
