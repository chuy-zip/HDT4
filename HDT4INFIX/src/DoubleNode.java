
public class DoubleNode<T> {
	
	private T Data;
	private DoubleNode<T> NextNode;
	private DoubleNode<T> PreviousNode;
	
	public DoubleNode(T data) {
		setData(data);
		setNextNode(null);
		setPreviousNode(null);
		
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}

	public DoubleNode<T> getNextNode() {
		return NextNode;
	}

	public void setNextNode(DoubleNode<T> nextNode) {
		NextNode = nextNode;
	}

	public DoubleNode<T> getPreviousNode() {
		return PreviousNode;
	}

	public void setPreviousNode(DoubleNode<T> previousNode) {
		PreviousNode = previousNode;
	}
	
	
	
}
