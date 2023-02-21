
public class SimpleNode<T> {
	
	private T Data;
	private SimpleNode<T> NextNode;
	
	public SimpleNode(T digit) {
		setData(digit);
		setNextNode(null);
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}

	public SimpleNode<T> getNextNode() {
		return NextNode;
	}

	public void setNextNode(SimpleNode<T> nextNode) {
		NextNode = nextNode;
	}
	
	
}
