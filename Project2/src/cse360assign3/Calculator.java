package cse360assign3;

public class Calculator extends AddingMachine {

	
	//This function multiplies the total by a value and then we add to the history what we * by
	public void mult (int value) {
		//total is multiplied with the value, string history is append with what total was * by
		total *= value;
		history += " * " + value;
	}

	//This function divides the total by a value and then we add to the history what we / by
	//We set the value = 0 if we divide by 0
	public void div (int value) {
		//total is divided with the value but remains a int ( no double ) 
		//string history is append with what total was divided by
		if(value == 0)
			total = 0;
		else
			total = total / value;
		history += " / " + value;
	}
	
	//This function raises the total by the power of a value
	public void power (int value) {
		//total is raised to the power of the value
		//if the value is a negative number, we set total to 0, but keep the history
		if(value == 0)
			total = 0;
		else
			total = (int)Math.pow(total, value);
		history += " ^ " + value;
	}
}
