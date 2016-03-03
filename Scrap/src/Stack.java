
public class Stack {
	
	LinkedList list;
	
	public Stack(){
		list = new LinkedList();
	}
	
	public void push(Object data){
		list.add(data);
	}
	
	public Object peek(){
		return list.get(list.count);
	}
	
	public Object pop(){
		Object item = list.get(list.count);
		list.remove(list.count);
		return item;
		
	}
	
}
