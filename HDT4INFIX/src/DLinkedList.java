
public class DLinkedList<T> implements IStack{

	private DoubleNode<T> First;
	private DoubleNode<T> Last;
	
	public DLinkedList() {
		setFirst(null);
		setLast(null);
	}
	
	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(Object item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object Peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return 0;
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
