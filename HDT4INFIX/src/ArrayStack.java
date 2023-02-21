
public class ArrayStack<T> implements IStack<T>{
	private Calculator Calc;
	
	public ArrayStack() {
		Calc.getInstance();
	}
	
	@Override
	public T pop() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(T item) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T Peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int Size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Calculator getCalc() {
		return Calc;
	}	
}
