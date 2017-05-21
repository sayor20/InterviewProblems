import java.util.HashMap;
import java.util.PriorityQueue;


public class Graph {
	
	HashMap<Node, Integer> distList = new HashMap<Node, Integer>();

	public void addEdgeWeight(Node from, Node to, int weight){
		adjNode adj = new adjNode();
		adj.setNeighNode(to);
		adj.setWeight(weight);
		from.addNeighbour(adj);
		distList.put(from, -1);
	}
	
	public void printGraph(){
		System.out.println(distList.keySet());
	}
}
