package ui;

import bc.util.Calculator;
import bc.util.Console;

public class CalculatorApp {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		Console console = new Console();
		
		int n1 = console.getInt("enter n1: ");
		int n2 = console.getInt("enter n2: ");
		
		System.out.println("sum = "+Calculator.sum(n1, n2));
		System.out.println("Bye");

	}

}
