import java.util.ArrayList;

public class ArrayListStack <T> implements IStack<T>{
	private Calculator Calc;
	private ArrayList<T> Stack;
	
	public ArrayListStack() {
		Calc.getInstance();
		Stack = new ArrayList<T>();
	}
	
	@Override
	public T pop() {
		T EliminatedValue = null;
		try {
			EliminatedValue = (T) Stack.get(Stack.size() - 1);
			Stack.remove(Stack.size() - 1);
		} catch (Exception e) {
			System.out.println("Error, no se encontraron suficientes operandos para las operacioens pendientes");
			System.out.println("Se terminaran las operaciones");
			System.exit(0);
		}
		return EliminatedValue;
	}

	@Override
	public void push(T item) {
		String currentStack = "";
		Stack.add(item);
		for (T items : Stack) {
			currentStack += items + ", ";  
		}
		
		System.out.println("Estado actual: " + currentStack + "\n");
	}

	@Override
	public T Peek() {
		try {
			return (T) Stack.get(Stack.size() - 1);
		} catch (Exception e) {
			System.out.println("La pila esta vacia");
		}
		return null;
	}

	@Override
	public int Size() {
		return Stack.size();
	}
	
	@Override
	public Calculator getCalc() {
		return Calc;
	}	

}
