import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class LongestSequence {
	public static void main(String args[]){
		int[] test = {100, 4, 200, 1, 3, 2};
		List<Integer> output = longestSeq(test);
		System.out.print(output);
	}

	public static List<Integer> longestSeq(int[] test){
		int count = 0;
		List<Integer> temp = new ArrayList<Integer>();
		List<Integer> output = new ArrayList<Integer>();
		SortedSet<Integer> testSet= new TreeSet<Integer>();
		for(int i=0;i<test.length;i++){
			testSet.add(test[i]);
		}
		while(testSet.size()!= 0){
			count = testSet.first();
			temp.add(count);
			while(testSet.contains(++count))
				temp.add(count);
			if(temp.size()>output.size())
				output = new ArrayList<Integer>(temp);
			temp.clear();
			testSet.remove(testSet.first());
		}
		return output;
	}
}
