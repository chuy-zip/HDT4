
public class DLinkedList<T> implements IStack<T>{

	private Calculator Calc;
	private DoubleNode<T> First;
	private DoubleNode<T> Last;
	
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
		
		DoubleNode<T> DListNode = First;
		while(DListNode.getNextNode() != null) {
			DListNode = DListNode.getNextNode();
		}
		
		T popData = DListNode.getData();
		
		DListNode.getPreviousNode().setNextNode(null);
		
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
		// TODO Auto-generated method stub
		return null;
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
