package Loops;

public class Continue {

	/*
	 * The continue statement is used in loop control structure when you need to immediately jump to the next iteration of the loop. It can be used with for loop or while loop.

The Java continue statement is used to continue loop. It continues the current flow of the program and skips the remaining code at specified condition. In case of inner loop, it continues only inner loop.
	 */
	
		public static void main(String[] args) {  
            for(int i=1;i<=3;i++){    
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            continue;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }

	}

}
