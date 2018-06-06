package Loops;

public class Break {

	/**
	 *When a break statement is encountered inside a loop, the loop is immediately terminated and the program control resumes at the next statement following the loop.
      The Java break is used to break loop or switch statement. It breaks the current flow of the program at specified condition. In case of inner loop, it breaks only inner loop.
	 */
	public static void main(String[] args) {
		  for(int i=1;i<=10;i++){  
		        if(i==5){  
		            break;  
		        }  
		        System.out.println(i);  
		    }  

	}

}
