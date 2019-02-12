import java.util.InputMismatchException;
import java.util.Scanner;

public class Mod1Hwk {
	public static void main(String[] args) throws Exception {
		
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your equation: ");
		String equation = scan.nextLine();
		scan.close();
		
		String[] eqArgs = equation.split(" ");
		
		if(eqArgs.length != 3) {
			System.out.println("Usage: operand1 operator operand2");
			System.exit(0);
		
		}
		
		int result = 0;
		
		switch(eqArgs[1].charAt(0)) {
			case '+': 
				result = Integer.parseInt(eqArgs[0]) +
							Integer.parseInt(eqArgs[2]);
				break;
			case '-':
				result = Integer.parseInt(eqArgs[0]) -
				Integer.parseInt(eqArgs[2]);
				break;
			case '*':
				result = Integer.parseInt(eqArgs[0]) *
							Integer.parseInt(eqArgs[2]);
				break;
			case '/':
				result = Integer.parseInt(eqArgs[0]) /
							Integer.parseInt(eqArgs[2]);
				break;	
			default:
				throw new InputMismatchException("Only use + - / *, (or/and) add numerical values.");
		}
		
		System.out.println(eqArgs[0] + ' ' + 
				eqArgs[1] + ' ' + eqArgs[2] + 
				" = " + result);
		
		}catch(ArithmeticException e) {
			System.out.println("Cant perform this mathmatical equation.");
		}
		catch(NumberFormatException e) {
			System.out.println("Unusable Mathmatical Operation, please use numerical value. ");
		}
	}
}
