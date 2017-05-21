
// custom Node class created for adjacency list

public class adjNode implements Comparable<adjNode>{
	
	private Node neighNode;
	private int weight;
	 
	public adjNode(){
		this.neighNode = new Node();
		this.weight = -1;
	}
	
	public adjNode(Node n, int w){
		this.neighNode = n;
		this.weight = w;
	}
	
    public Node getNeighNode() {
		return neighNode;
	}
    
	public void setNeighNode(Node neighNode) {
		this.neighNode = neighNode;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int compareTo(adjNode obj2) {
		if(this.getWeight() < obj2.getWeight())
			return -1;
		else if (this.getWeight() > obj2.getWeight())
			return 1;
		else
		return 0;
	}
	
	public String toString(){
		return "Node: "+neighNode.getName()+", Weight : "+weight;
		
	}

}
