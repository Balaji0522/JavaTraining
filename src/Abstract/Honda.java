package Abstract;  /*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
A method that is declared as abstract and does not have implementation is known as abstract method.
*/

class Honda extends Bike{  
void run(){System.out.println("running safely..");}  
public static void main(String args[]){  
 Bike obj = new Honda();  
 obj.run();  
}  
}  
