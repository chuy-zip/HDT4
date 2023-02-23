/**
 * A node that is used specifically by single linked lists
 * @author Ricardo Chuy
 *
 * @param <T>
 */
public class SimpleNode<T> {
	
	private T Data;
	private SimpleNode<T> NextNode;
	
	/**
	 * The constructor of the node
	 * @param digit The object that wants to be stored in the structure
	 */
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
