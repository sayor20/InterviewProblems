import java.util.HashMap;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		lengthOfLongestSubstring("abba");

	}
	
    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        char[] sArr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0, j=0;i<sArr.length;i++){
            if(map.containsKey(sArr[i])){
                j=map.get(sArr[i])+1;
                //map = new HashMap<Character, Integer>();
            }
            map.put(sArr[i],i);
            max = Math.max(max, i-j+1);
        }
        return max;  
    }

}
