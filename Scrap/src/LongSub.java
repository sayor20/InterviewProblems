import java.util.HashMap;
import java.util.Map;

public class LongSub {

	public static void main(String[] args) {
		System.out.println(longSub("abcbbbbcccbdddadadc", 3));
	}

	private static String longSub(String str, int k) {
		if(k > str.length())
			return str;
		
		int min = 1;
		int max = k+1;
		String result = "";
		StringBuilder sb = new StringBuilder();
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		
		for(int i=1;i<=k;i++)
			map.put(i, str.charAt(i));

		for(int i=0;i<str.length();i++){
			if(map.containsValue(str.charAt(i)))
				sb.append(str.charAt(i));
			else{
				if(sb.length() > result.length())
					result = sb.toString();
				sb.setLength(0);
				map.remove(min++);
				map.put(max++, str.charAt(i));	
				System.out.println(map);
				for(char c : map.values())
					sb.append(c);
			}
		}
		
		return result;
	}
	
}