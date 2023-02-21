
public class LinkList<T> implements IStack{
	
	private SimpleNode<T> First;
	private SimpleNode<T> Last;
	
	public LinkList() {
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
