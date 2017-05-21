import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Imdb {

	public static void main(String[] args) {
		List input = new ArrayList<>();
		input.add("Matt Mekowski");
		input.add("Larry Jacobson");
		input.add("Larry Jacobson");
		input.add("Stephan Branschyk");
		input.add("Larry Jacobson");
		duplicateNames(input);
	}

	private static void duplicateNames(List<String> input) {
		Collections.sort(input);
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		
		for(int j=0;j<input.size();j++){
			countMap.put(input.get(j), 1);
		}
		
		ListIterator<String> iter = input.listIterator();
		
		while(iter.hasNext()){
			String temp = iter.next();
			if(Collections.binarySearch(input, temp)!=-1){
				iter.remove();
				iter.add(temp+" ("+countMap.get(temp)+")");
				countMap.put(temp, countMap.get(temp)+1);
			}
		}
		
		System.out.println(input);
		
	}

}
