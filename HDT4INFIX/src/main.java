import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		
		while (true) {
			/**
			 * Reading the file to get the infix expression from the txt file
			 */
			String InfixExpression = getDataFromTxt();
			System.out.println("Expresion Infix: " + InfixExpression);
			
			 /**
			  * Converting the infix expression to postfix
			  */
			String PostFix = ConvertInfixToPostFix(InfixExpression);
			System.out.println("Expresion Postfix: " + PostFix);
			String[] strSplit = PostFix.split("");
			
			/**
			 * Getting user input for type of stack and crating it with stack factory
			 */
			int StackType = getUserOption();
			//End the program if selected option is 5
			if (StackType == 5) {
				System.exit(0);
			}
			
			StackFactory Factory = new StackFactory();
			IStack CurrentStack = Factory.createStack(StackType, strSplit);
			
			System.out.println("...................................");
			for (int i = 0; i < PostFix.length(); i++) {
				System.out.println("Entrada: " + strSplit[i]);
				
				float SeconOperand, FirstOperand, result;
				
				switch (strSplit[i]) {
				
				case "+":
					System.out.println("Operacion: Sumar, pop, pop y push del resultado");
					SeconOperand = (float) CurrentStack.pop();
					FirstOperand = (float) CurrentStack.pop();
					result = CurrentStack.getCalc().getInstance().Add(FirstOperand, SeconOperand);
					CurrentStack.push(result);
					break;
					
				case "*":
					System.out.println("Operacion: Multiplicar, pop, pop y push del resultado");
					SeconOperand = (float) CurrentStack.pop();
					FirstOperand = (float) CurrentStack.pop();
					result = CurrentStack.getCalc().getInstance().Multiply(FirstOperand, SeconOperand);
					CurrentStack.push(result);
					break;
				/**
				 * Case for division operand
				 */
				case "/":
					System.out.println("Operacion: Dividir, pop, pop y push del resultado");
					SeconOperand = (float) CurrentStack.pop();
					FirstOperand = (float) CurrentStack.pop();
					result = CurrentStack.getCalc().getInstance().Divide(FirstOperand, SeconOperand);
					CurrentStack.push(result);
					break;
				
				/**
				 * Case for founding an operand or invalid argument
				 */
				default:
					try {
				        float pushedValue = Float.parseFloat(strSplit[i]);
				        System.out.println("Push al operando: " + strSplit[i]);
				        CurrentStack.push(pushedValue);
						
				    } catch(NumberFormatException e) {
				    	System.out.println(strSplit[i] + ", Caracter no valido\n");
				    }
				}
				
				
			}
			
			System.out.println("...................................");
		}	
	}
	
	/**
	 * reading file for infix expression
	 * @return Infix Expression
	 */
	public static String getDataFromTxt() {
		String MyFile = "src/datos.txt";
		String InfixData = "";
		
		/**
		 * Reading file datos.txt
		 */
		try {
			BufferedReader reader = new BufferedReader(new FileReader(MyFile));
			InfixData= reader.readLine();
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return InfixData;
	}
	
	/**
	 * Getting the user input for type of structure for the stack
	 * @return int that symbolizes the stack type
	 */
	public static int getUserOption() {
		Scanner scan = new Scanner(System.in);
		int UserSelection = 0;
		try {
			System.out.println("¿Con cual tipo de estructura desea hacer la operacion? \n"
					+ "1.Arreglo/Vector\n"
					+ "2.ArrayList\n"
					+ "3.Lista Simple Encadenada\n"
					+ "4.Lista Doblemente Encadenada\n"
					+ "5.Salir");
			UserSelection = scan.nextInt();
			return UserSelection;
			
		} catch (Exception e) {
			System.out.println("El dato ingresado no es valido");
		}
		
		
		return UserSelection;
	}
	
	/**
	 * Convert a string from infix format to postfix
	 * @param exp Expression in infix
	 * @return COnvert string to Postfix
	 */
	public static String ConvertInfixToPostFix(String exp)
    {
        // initializing empty String for result
        String result = new String("");
 
        // initializing empty stack
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
 
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
 
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.push(c);
 
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
 
                stack.pop();
            }
            else // an operator is encountered
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
 
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
 
        // pop all the operators from the stack
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
       
        return result;
    }
	
	/**
	 * Method to determine the order of operations according to arithmetic order
	 * @param ch
	 * @return
	 */
	static int Prec(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }

}
