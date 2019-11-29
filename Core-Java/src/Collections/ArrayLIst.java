package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayLIst {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<String>();
		 list.add("Hai");
		 list.add("Welcome");
		 list.add("Face");
		LinkedList<String> list1 = new 	LinkedList<String>(); 
		 list1.add("Java");
		 list1.add("Program");
		  list.addAll(list1);
		   System.out.println(list.get(4));  

		  Iterator itr1=list.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
		  }  
	}

}
