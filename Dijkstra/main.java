import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class prob1 {
	
	public static void main(String args[]){
		Graph g;
		Node A,B,C,D,E;
		
		g = new Graph();
		A = new Node("A");
		B = new Node("B");
		C = new Node("C");
		D = new Node("D");
		E = new Node("E");
		
		//input: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7

	    g.addEdgeWeight(A, B, 5);
		g.addEdgeWeight(B, C, 4);
	    g.addEdgeWeight(C, D, 8);
	    g.addEdgeWeight(D, C, 8);
		g.addEdgeWeight(D, E, 6);
	    g.addEdgeWeight(A, D, 5);
	    g.addEdgeWeight(C, E, 2);
		g.addEdgeWeight(E, B, 3);
	    g.addEdgeWeight(A, E, 7);
	
	    // checking whether the graph is created properly
	    g.printGraph();
	    
	    // the output would be return a minimum dist table from source point 
	    // to all other nodes. We can pick the dest node we want from that table.   
	    System.out.println(shortestPath(g, A));
	    
	    HashMap<Character, Integer> count = new HashMap<Character, Integer>();
	    count.put('c', 0);
	    
	    // testing with one case. It is the same for remaining casse with hot swapping values and conditions.
	    System.out.println(tripCalculator(C, C, 0, 0, count));
	}
	
	// using Dijkstra's algorithm for finding shortest path

	private static HashMap<Node, Integer> shortestPath(Graph g, Node source) {
		int currWeight = 0;
		for(Node n : g.distList.keySet()){
			if(n==source)
				g.distList.put(n, 0);
			else
				g.distList.put(n, Integer.MAX_VALUE);
		}
		
		// using built-in java priority queue for simplicity
		PriorityQueue<adjNode> q = new PriorityQueue<adjNode>();
		q.add(new adjNode(source, 0));
		
		while(!q.isEmpty()){	
			// If visited node gets next node in the queue
			adjNode adjTemp = q.poll();
			Node temp = adjTemp.getNeighNode();
			int weight = adjTemp.getWeight();
			while(temp.isVisited()){
				if(q.isEmpty())
					return g.distList;
				adjTemp = q.poll();
				temp = adjTemp.getNeighNode();
				weight = adjTemp.getWeight();
				currWeight = 0;
			}
			
			// setting visited node to true
			temp.setVisited(Boolean.TRUE);
			q.add(new adjNode(temp, weight));
			
			// updating the dist table
			currWeight += q.poll().getWeight();
			
			ArrayList<adjNode> neighbours = temp.getNeighbours();   
			for(adjNode neighbour: neighbours){
				if(g.distList.get(neighbour.getNeighNode()) > currWeight + neighbour.getWeight())
					g.distList.put(neighbour.getNeighNode(), currWeight + neighbour.getWeight());
				
				// updating the queue
				q.add(neighbour);
			}
		}
		return null;
		
	}
	
	// using depth-first search (DFS) to solve the case
	
	private static HashMap<Character, Integer> tripCalculator(Node source, Node dest, int trips, int count, HashMap<Character, Integer> store){
		// the trip condition is case-specific
		if(source.getName().equals(dest.getName()) && trips<4){
			store.put('c', store.get('c')+1);
		}
		for(adjNode neighbour:source.getNeighbours()){
			// this condition is case-specific
			if(trips>3)
				return store;
			++trips;
			tripCalculator(neighbour.getNeighNode(), dest, trips, store.get('c'), store );	
			--trips;
		}
		return store;	
	}
	
}
