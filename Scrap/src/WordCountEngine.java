import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordCountEngine {

	public static void main(String[] args) {
		
		String testString = "practice makes perfect. get perfect by practice. just practice!";
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		ar.add(2);
		ar.add(3);
		Set<Integer> test = new LinkedHashSet<Integer>(ar);
		System.out.println(test);
	}
	
}