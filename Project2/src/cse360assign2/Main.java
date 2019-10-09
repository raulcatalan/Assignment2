package cse360assign2;

//Created file for testing
public class Main {

	public static void main(String[] args) {
		
		//create the adding machine and test adding and subtracting and printing toString()
		AddingMachine mach = new AddingMachine();
		mach.add(4);
		mach.subtract(2);
		mach.add(5);
		System.out.println(mach.toString());
		System.out.println(mach.getTotal());
		mach.clear();
		mach.add(10);
		System.out.println(mach.toString());
		System.out.println(mach.getTotal());
	}
	
}