package Polymorphism;

/*When type of the object is determined at run-time, it is known as dynamic binding.*/

class DynamicBinding extends Animal{  
	 void eat(){System.out.println("dog is eating...");}  
	  
	 public static void main(String args[]){  
	  Animal a=new DynamicBinding();  
	  a.eat();  
	 }  
	} 
