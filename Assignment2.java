package assignments;

public class Assignment2 {

	static void Calculate(int num1, int num2, String ope) {

		if( String.valueOf( ope ).matches( "[-+*/]" ) ) {

			switch(ope) {

			case "*":
				System.out.println("Answer = "+(num1 * num2));
				break;
			case "/":
				System.out.println("Answer = "+(num1 / num2));
				break;
			case "+":
				System.out.println("Answer = "+(num1 + num2));
				break;
			case "-":
				System.out.println("Answer = "+(num1 - num2));
				break;
			}

		}
		else {
			System.out.println("There was an error: Invalid Operator");
		}

	}


	public static void main(String[] args) {
		Calculate(400,2,"*");
	}

}
