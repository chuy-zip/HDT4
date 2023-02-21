/**
 * Calculator class that must be included in every stack
 * Implements singleton pattern design.
 * @author Ricardo Chuy
 */
public class Calculator {
	
	private static Calculator CalcInstance;
	
	/**
	 * method to get the instance of the calculator, if instance is null, then a new calculator is created
	 * @return The instance of the calculator
	 */
	public static Calculator getInstance() {
		if (CalcInstance == null) {
			CalcInstance = new Calculator();
		}
		
		return CalcInstance;
	}
	
	/**
	 * Sum of 2 floating point values
	 * @param num1
	 * @param num2
	 * @return the result of the operation
	 */
	public static float Add(float num1, float num2) {
		return num1 + num2;
		
	}
	
	/**
	 * Substraction of 2 floating point values
	 * @param num1
	 * @param num2
	 * @return de result of the operation
	 */
	public static float Substract(float num1, float num2) {
		return num1 - num2;
		
	}
	
	/**
	 * Multiplication of 2 floating point values
	 * @param num1
	 * @param num2
	 * @return de result of the operation
	 */
	public static float Multiply(float num1, float num2) {
		return num1 * num2;
		
	}
	
	/**
	 * Division of 2 floating point values
	 * @param num1
	 * @param num2
	 * @return de result of the operation
	 */
	public static float Divide(float num1, float num2) {
		return num1 / num2;
		
	}
}
