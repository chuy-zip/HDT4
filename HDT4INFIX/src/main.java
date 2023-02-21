import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		System.out.println("First Commit");
		String InfixExpression = getDataFromTxt();
		
		System.out.println(InfixExpression);
		
		System.out.println(getUserOption());
		
	}
	
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
	
	public static int getUserOption() {
		Scanner scan = new Scanner(System.in);
		int UserSelection = 0;
		try {
			System.out.println("¿Con cual tipo de estructura desea hacer la operacion? \n"
					+ "1.Arreglo/Vector\n"
					+ "2.ArrayList\n"
					+ "3.Lista Simple Encadenada\n"
					+ "4.Lista Doblemente Encadenada");
			UserSelection = scan.nextInt();
			return UserSelection;
			
		} catch (Exception e) {
			System.out.println("El dato ingresado no es valido");
		}
		
		
		return UserSelection;
	}
	
	public static String ConvertInfixToPostFix(String InfixOperation) {
		
		String PostFix = InfixOperation;
		
		return PostFix;
		
	}
}
