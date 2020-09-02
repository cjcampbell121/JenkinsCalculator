import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();

		System.out.println("Welcome to the calculator");
		System.out.println("Enter a command:");

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNextLine()) {
			String[] line = scanner.nextLine().split(" ");
			readCommand(line, calculator);
		}
	}

	private static void readCommand(String[] line, Calculator calculator) {
		switch(line[0]) {
			case "add":
				System.out.println(calculator.add(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
				break;
			case "subtract":
				System.out.println(calculator.subtract(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
				break;
			case "multiply":
				System.out.println(calculator.multiply(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
				break;
			case "divide":
				System.out.println(calculator.divide(Integer.parseInt(line[1]), Integer.parseInt(line[2])));
				break;
			case "fibonacci":
				System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(line[1])));
				break;
			case "binary":
				System.out.println(calculator.intToBinaryNumber(Integer.parseInt(line[1])));
				break;
		}
	}
}
