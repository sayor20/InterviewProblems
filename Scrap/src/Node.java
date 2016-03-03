
public class Node {
	private Object data;
	private Node next;
	
	public Node(Object data){
		this.data = data;
		this.next = null;
	}
	
	public Node(Object data, Node next){
		this.data = data;
		this.next = next;
	}
	
	public void setData(Object data){
		this.data = data;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
	
	public Object getData(){
		return data;
	}
	
	public Node getNext(){
		return next;
	}
	
	public String toString(){
		return data+" "+next;
	}
}
