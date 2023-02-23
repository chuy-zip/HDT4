
public class StackFactory<T> {
	
	public IStack createStack(int StackType, String[] postfix) {
		
		switch (StackType) {
		case 1:
			ArrayStack<T> ArrayStack = new ArrayStack<T>(postfix);
			System.out.println("Usando ArrayStack");
			return ArrayStack;
			
		case 2:
			ArrayListStack<T> ArrayListStack = new ArrayListStack<T>();
			System.out.println("Usando ArrayListStack");
			return ArrayListStack;
			
		case 3:
			LinkList<T> LinkList = new LinkList<T>();
			System.out.println("Usando Linked List");
			return LinkList;

		case 4:
			DLinkedList<T> DLinkedList = new DLinkedList<T>();
			System.out.println("Usando DoubleLinked List");
			return DLinkedList;
		
		}
		return null;
		
	}
		
		
}
