package Loops;

public class Switch {

	/** The java switch statement is fall-through. It means it executes all statement after first match if break statement is not used with switch cases.
	 * The Java switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement.
	 */
	public static void main(String[] args) {
		 int number=20;  
		    switch(number){  
		    case 10: System.out.println("10");  
		    case 20: System.out.println("20");  
		    case 30: System.out.println("30");  
		    default:System.out.println("Not in 10, 20 or 30");  
		    }  

	}

}
 