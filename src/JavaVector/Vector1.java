package JavaVector;



import java.util.*;      
class Vector1{      
	 public static void main(String args[]){      
	  Vector<String> v=new Vector<String>();//creating vector  
	  v.add("Balaji");//method of Collection  
	  v.addElement("Kiran");//method of Vector  
	  v.addElement("kumar");  
	  //traversing elements using Enumeration  
	  Enumeration e=v.elements();  
	  while(e.hasMoreElements()){  
	   System.out.println(e.nextElement());  
	  }  
	 }      
	}   