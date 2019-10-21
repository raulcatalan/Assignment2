//Raul Catalan, Class #: 85141, Used for testing purposes
package cse360assign3;

//Created file for testing
public class Main {

	public static void main(String[] args) {
		
		//create the adding machine and test adding and subtracting and printing toString()
		System.out.println("****ASSIGN 3****");
		Calculator calc = new Calculator();
		calc.add(4);
		calc.mult(2);
		calc.mult(5);
		System.out.println(calc.toString());
		System.out.println(calc.getTotal());
		calc.div(4);
		System.out.println(calc.toString());
		System.out.println(calc.getTotal());
		calc.power(10);
		calc.power(0);
		System.out.println(calc.toString());
		System.out.println(calc.getTotal());
		calc.add(3);
		calc.power(2);
		System.out.println(calc.toString());
		System.out.println(calc.getTotal());
	}
	
}