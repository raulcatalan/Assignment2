//Raul Catalan, CSC360, Class #: 85141
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	//returns int total
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		//total is added with the value, string history is append what was added to total.
		total += value;
		history += " + " + value;
	}
	
	public void subtract (int value) {
		//total is subtracted with the value, string history is append what was subtracted to total.
		total -= value;
		history += " - " + value;
	}
		
	public String toString () {
		return history;
	}
	
	//clears the value in total and sets history = 0 for new log of functions
	public void clear() {
		total = 0;
		history = "0";
	}
}
