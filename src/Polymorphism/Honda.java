package Polymorphism; /*Java Runtime Polymorphism*/

class Honda extends Bike{  
	  void run(){System.out.println("running safely with 60km");}  
	  
	  public static void main(String args[]){  
	    Bike b = new Honda(); 
	    b.run();  
	  }  
	} 
