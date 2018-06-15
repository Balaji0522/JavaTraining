package ArrayList;



	import java.util.*;    
	class JavaArray{    
	 public static void main(String args[]){    
	     
	  List<String> al=new ArrayList<String>();//creating arraylist    
	  al.add("Balaji");//adding object in arraylist    
	  al.add("Michael");    
	  al.add("James");    
	  al.add("Andy");    
	  //traversing elements using Iterator  
	  Iterator itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }    
	 }  
	}
	   
