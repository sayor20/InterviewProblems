import java.util.ArrayList;
import java.util.Arrays;

// generic Node class
public class Node {
	
	private String name;
	public ArrayList<adjNode> neighbours;
	public boolean isVisited() {
		return visited;
	}


	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	private boolean visited;

	public Node(){
		name = null;
		neighbours = new ArrayList<adjNode>();
		visited = false;
	}
	
	public Node(String name){
		this.name = name;
		neighbours = new ArrayList<adjNode>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<adjNode> getNeighbours() {
		return neighbours;
	}
	
	public void addNeighbour(adjNode adj){
		neighbours.add(adj);
	}
	
	@Override
	public String toString(){
		return "vertex "+name+"\nadjList "+Arrays.deepToString(neighbours.toArray())+"\n\n";
	}
	
}
