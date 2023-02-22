import java.lang.reflect.Array;

public class ArrayStack<T> implements IStack<T>{
	private Calculator Calc;
	private T[] Stack;
	
	public ArrayStack(String[] postfix) {
		Stack = (T[]) new Object[postfix.length + 1];
		
		/**
		 * Iterating through the array to set every value to null
		 * This value can't enter normally to the stack, it helps later to check
		 * the last value while using the stack methods. 
		 */
		for (int i = 0; i < postfix.length; i++) {
			Stack[i] = null;
		}
		
		Calc.getInstance();
	}
	
	
	
	@Override
	public T pop() {
		
		T eliminatedvalue = null;
		
		/**
		 * Looking for the last element in the list and eliminating it 
		 */
		for (int i = 0; i < Stack.length; i++) {
			if (Stack[i + 1] == null) {
				eliminatedvalue = Stack[i];
				Stack[i] = null;
				return eliminatedvalue;
			}
		}
		
		return eliminatedvalue;
	}

	@Override
	public void push(T item) {
		/**
		 * Going to the first empty position to add the element
		 */
		for (int i = 0; i < Stack.length; i++) {
			if (Stack[i] == null) {
				Stack[i] = item;
				String currentStack = "";
				
				for (T items : Stack) {
					if (items != null) {
						currentStack += items + ", ";  
					}
					
				}
				System.out.println("Estado actual: " + currentStack + "\n");
				return;
			}
		}
		
	}

	@Override
	public T Peek() {
		T Top = null;
		/**
		 * Looking for the last element in the list
		 */
		for (int i = 0; i < Stack.length; i++) {
			if (Stack[i + 1] == null) {
				Top = Stack[i];
				return Top;
			}
		}
		return Top;
	}

	@Override
	public int Size() {
		int counter = 0;
		
		for (int i = 0; i < Stack.length; i++) {
			if (Stack[i] != null) {
				counter++;
			}
		}
		
		return counter;
	}
	
	public Calculator getCalc() {
		return Calc;
	}	
}
