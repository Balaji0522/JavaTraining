package AccessModifiers;

/*The protected access modifier is accessible within package and outside the package but through inheritance only.*/

import Pack.*;  

class B extends A{  
  public static void main(String args[]){  
   B obj = new B();  
   obj.msg();  
  }  
}   


