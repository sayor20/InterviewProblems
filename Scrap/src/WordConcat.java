import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class WordConcat {

	public static void main(String[] args) {
		String test="barfoothefoobarman";
		String[] words = {"foo", "bar"};
		List<Integer> result = new ArrayList<Integer>();
		SortedSet<Integer> tempSet = new TreeSet<Integer>();
		System.out.println(wordConcat(test, words, result, tempSet, 0));

	}

	private static List<Integer> wordConcat(String test,String[] words, List<Integer> result, SortedSet<Integer> tempSet,int start) {
		int length = words[0].length();
		if(start >= test.length() || test.indexOf(words[0], start)==-1)
			return result;	
		for(int i=0;i<words.length;i++){
			tempSet.add(test.indexOf(words[i], start));
		}
		Iterator<Integer> iter = tempSet.iterator();
		int lastVal = iter.next();
		boolean add = true;
		while(iter.hasNext()){
			int tempVal = iter.next();
			if(lastVal+length  != tempVal){
				add = false;
				break;
			}
			lastVal = tempVal;		
		}
		if(add)
			result.add(tempSet.first());
		start = tempSet.last()+length;
		tempSet.clear();
		wordConcat(test, words, result, tempSet, start);
		return result;
	}
}
