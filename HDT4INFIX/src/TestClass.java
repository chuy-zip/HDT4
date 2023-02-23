import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass {
	@Test
	public  void SimpleTonReturnsOnlyInsatance() {
		ArrayListStack ArrLStack  = new ArrayListStack();
		LinkList LstStack  = new LinkList();
		boolean Expectedresult = true;
		boolean result = ArrLStack.getCalc().getInstance() == LstStack.getCalc().getInstance();
		assertEquals(Expectedresult, result);
		
	}
	
	@Test
	public void pushCanBeMadeWithDifferentDataTypeInt() {
		DLinkedList<Object> testStack = new DLinkedList<Object>();
		testStack.push(3);
		testStack.push(4);
		testStack.push(9);
		testStack.push(0);
		testStack.pop();
		
		assertEquals( 9, testStack.Peek());
	}
	
	@Test
	public void pushCanBeMadeWithDifferentDataTypeFloat() {
		DLinkedList<Object> testStack = new DLinkedList<Object>();
		testStack.push(3.00f);
		testStack.push(4.00f);
		testStack.push(9.00f);
		testStack.push(0.00f);
		testStack.pop();
		
		assertEquals( 9.00f, testStack.Peek());
	}
	
	@Test
	public void ArrayListStackPeekIs0() {
		ArrayListStack<Object> testStack1 = new ArrayListStack<Object>();
		testStack1.push(9);
		testStack1.push(1);
		testStack1.push(0);
		testStack1.push(2);
		testStack1.pop();
		
		assertEquals(0, testStack1.Peek());
	}
	
	@Test
	public void ArrayListAndArrayStackPeekIs4() {
		ArrayListStack<Object> testStack1 = new ArrayListStack<Object>();
		testStack1.push(3);
		testStack1.push(4);
		testStack1.push(4);
		testStack1.push(2);
		testStack1.pop();
		
		String[] list= new String[5];
		
		ArrayStack<Object> testStack2 = new ArrayStack<Object>(list);
		testStack1.push(3);
		testStack1.push(4);
		testStack1.push(4);
		testStack1.push(2);
		testStack1.pop();
		
		
		assertEquals(4, testStack1.Peek());
	}
	
	@Test
	public void ResultaOfAditionIs15f() {
		LinkList<Object> testStack = new LinkList<Object>();
		
		
		testStack.push(3.0f);
		testStack.push(4.0f);
		testStack.push(9.0f);
		testStack.push(6.0f);
		float val1 = (float) testStack.pop();
		float val2 = (float) testStack.pop();
		
		assertEquals( 15.0f , testStack.getCalc().getInstance().Add(val1, val2) , 0D);
	}
	
	@Test
	public void ResultaOfSubstractionIs20f() {
		ArrayListStack<Object> testStack = new ArrayListStack<Object>();

		
		testStack.push(3.0f);
		testStack.push(21.0f);
		
		testStack.push(1.0f);
		float val2 = (float) testStack.pop();
		float val1 = (float) testStack.pop();
		
		assertEquals( 20.0f ,  testStack.getCalc().getInstance().Substract(val1, val2) , 0D);
	}
}
