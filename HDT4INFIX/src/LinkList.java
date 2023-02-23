
import java.util.Iterator;
/**
 * A stack that internally works with Linked List
 * @author Ricardo Chuy
 *
 * @param <T>
 */
public class LinkList<T> implements IStack<T>{
	
	private Calculator Calc;
	private SimpleNode<T> First;
	private SimpleNode<T> Last;
	
	/**
	 * Constructor of the linked list
	 */
	public LinkList() {
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
		 * Going through a linked list until the second last element is found
		 */
		SimpleNode<T> SecondLast = First;
		while (SecondLast.getNextNode().getNextNode() != null) {
			SecondLast = SecondLast.getNextNode();
		}
		
		/**
		 * Storing the nexto value after second last (final value),
		 * Then Change second last to being last element in the list
		 */
		T popData = SecondLast.getNextNode().getData();
		Last = SecondLast;
		
		SecondLast.setNextNode(null);

		return popData;
	}

	@Override
	public void push(T item) {
		SimpleNode<T> newNode = new SimpleNode<T>(item);
		
		if (First == null) {
			First = newNode;
			Last = newNode;
		}
		
		else {
			Last.setNextNode(newNode);
			Last = newNode;
		}
		
		SimpleNode<T> currentNode = First;
		String currentStack = "";
		while (currentNode != null) {
			currentStack += currentNode.getData() + ", ";
			currentNode = currentNode.getNextNode();
		}
		
		System.out.println("Estado actual: " + currentStack + "\n");
		
	}

	@Override
	public T Peek() {
		/**
		 * Going through every created node until next node is equal to null
		 */
		SimpleNode<T> currentNode = First;
		while (true) {
			if(currentNode.getNextNode() == null) {
				return currentNode.getData();
			}
			
		}
	}

	@Override
	public int Size() {
		int counter = 0;
		
		SimpleNode<T> currentNode = First;
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
	
	public SimpleNode<T> getFirst() {
		return First;
	}

	public void setFirst(SimpleNode<T> first) {
		First = first;
	}

	public SimpleNode<T> getLast() {
		return Last;
	}

	public void setLast(SimpleNode<T> last) {
		Last = last;
	}
		
	
}
