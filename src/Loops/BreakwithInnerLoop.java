package Loops;

public class BreakwithInnerLoop {

	/**
	 * It breaks inner loop only if you use break statement inside the inner loop.
	 */
	public static void main(String[] args) {
		  for(int i=1;i<=3;i++){    
              for(int j=1;j<=3;j++){    
                  if(i==2&&j==2){    
                      break;    
                  }    
                  System.out.println(i+" "+j);    
              }    
      }   

	}

}
