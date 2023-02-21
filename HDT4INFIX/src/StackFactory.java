
public class StackFactory<T> {
	
	public IStack createStack(int StackType) {
		
		switch (StackType) {
		case 1:
			ArrayStack<T> ArrayStack = new ArrayStack<T>();
			return ArrayStack;
			
		case 2:
			ArrayListStack<T> ArrayListStack = new ArrayListStack<T>();
			return ArrayListStack;
			
		case 3:
			LinkList<T> LinkList = new LinkList<T>();
			return LinkList;

		case 4:
			DLinkedList<T> DLinkedList = new DLinkedList<T>();
			return DLinkedList;
		
		}
		return null;
		
	}
		
		
}
