
public interface IStack <T>{
	
	/**
	 * The pop method is in charged of deleting the item at the top of the stack
	 * @return The element that was deleted from the stack.
	 */
	public T pop();
	
	/**
	 * The push method adds a new element of the stack
	 */
	public void push(T item);
	
	/**
	 * Peek gets the item that is at the top of the stack
	 * @return The value that is at the top of the stack
	 */
	public T Peek();
	
	/**
	 * This method gets the size of the stack
	 * @return How many elements are in the stack
	 */
	public int Size();
}
