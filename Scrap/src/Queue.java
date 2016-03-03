
public class Queue {
	
	LinkedList list;
	
	public Queue(){
		list = new LinkedList();
	}
	
	public void enQueue(Object data){
		list.add(data);
	}
	
	public Object deQueue(){
		Object item = list.get(1);
		list.remove(1);
		return item;
	}	
	
	public Object peek(){
		return list.get(1);
	}
	
}


// Implementing queue using two stacks
public class Queue<E>
{

    private Stack<E> inbox = new Stack<E>();
    private Stack<E> outbox = new Stack<E>();

    public void queue(E item) {
        inbox.push(item);
    }

    public E dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
               outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

}
