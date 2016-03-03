
private class LinkedList {
	
	Node head;
	int count;
	
	public LinkedList(){
		head = new Node(null);
		count = 0;
	}
	
	public void add(Object data){
		Node temp = new Node(data);
		Node current = head;
		
		while(current.getNext()!=null){
			current = current.getNext();
		}
		
			current.setNext(temp);
			count++;
	}
	
	public void add(Object data, int index){
		Node temp = new Node(data);
		Node current = head;
		
		for(int i=1; i<index && current.getNext()!=null; i++){
			current = current.getNext();
		}
		
		temp.setNext(current.getNext());
		current.setNext(temp);
		count++;
	}
	
	public Object get(int index){
		Node current = head;
		for(int i=1; i<index && current.getNext()!=null; i++)
			current = current.getNext();
		return current;
	}
	
	public void remove(int index){
		Node current = head;
		for(int i=1; i<index && current.getNext()!=null; i++){
			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		count--;
	}
}
