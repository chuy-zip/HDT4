/**
 * A stack that internally works with a Double Linked List, both the linked list and stack
 * methods are included in this class.
 * @author Ricardo Chuy
 *
 * @param <T>
 */
public class DLinkedList<T> implements IStack<T>{

	private Calculator Calc;
	private DoubleNode<T> First;
	private DoubleNode<T> Last;
	
	/**
	 * Constructor of the linked list
	 */
	public DLinkedList() {
		setFirst(null);
		setLast(null);
	}
	
	@Override
	public T pop() {
		if(First == null) {
			return null;
		}
		
		if(First.getNextNode() == null) {
			T popData = getFirst().getData();
			First = null;
			return popData;
		}
		
		/**
		 * If the first conditions are not met, that means there are more that 1 element in the stack.
		 */
		DoubleNode<T> DListNode = First;
		while(DListNode.getNextNode() != null) {
			DListNode = DListNode.getNextNode();
		}
		
		/**
		 * When the last node is found, its data is stored
		 */
		T popData = DListNode.getData();
		
		/**
		 * Then its previous node "disconnects from last"
		 */
		DListNode.getPreviousNode().setNextNode(null);
		
		/**
		 * The previous node of last, becomes the last node
		 */
		Last = DListNode.getPreviousNode();
		
		
		return popData;
	}

	@Override
	public void push(T item) {
		DoubleNode<T> newNode = new DoubleNode<T>(item);
		
		if(First == null) {
			First = newNode;
			Last = newNode;
			
			First.setPreviousNode(null);
		}
		
		/**
		 * Adding node to last position
		 */
		else {
			Last.setNextNode(newNode);
			newNode.setPreviousNode(Last);
			Last = newNode;
		}
		
		DoubleNode<T> currentNode = First;
		String currentStack = "";
		while (currentNode != null) {
			currentStack += currentNode.getData() + ", ";
			currentNode = currentNode.getNextNode();
		}
		
		System.out.println("Estado actual: " + currentStack + "\n");
		
		
	}

	@Override
	public T Peek() {
		DoubleNode<T> DListNode = First;
		while(DListNode.getNextNode() != null) {
			DListNode = DListNode.getNextNode();
		}
		
		T popData = DListNode.getData();
		return popData;
	}

	@Override
	public int Size() {
		int counter = 0;
		
		DoubleNode<T> currentNode = First;
		while (currentNode != null) {
			counter++;
			currentNode = currentNode.getNextNode();
		}
		
		return counter;
	}
	
	@Override
	public Calculator getCalc() {
		return Calc;
	}	

	public DoubleNode<T> getFirst() {
		return First;
	}

	public void setFirst(DoubleNode<T> first) {
		First = first;
	}

	public DoubleNode<T> getLast() {
		return Last;
	}

	public void setLast(DoubleNode<T> last) {
		Last = last;
	}
	
}
