import java.util.Iterator;

public class LinkList<T> implements IStack<T>{
	
	private Calculator Calc;
	private SimpleNode<T> First;
	private SimpleNode<T> Last;
	
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
		
		SimpleNode<T> SecondLast = First;
		
		while (SecondLast.getNextNode().getNextNode() != null) {
			SecondLast = SecondLast.getNextNode();
		}
		
		
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
		while (currentNode != null) {
			if(currentNode.getNextNode() == null) {
				return currentNode.getData();
			}
			
		}
		
		return currentNode.getData();
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return 0;
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
