package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Array1 {
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
 	   System.out.println("Enter the Size");
	     int  n=sc.nextInt();
		ArrayList list=new ArrayList();// Arraylist Class Declaration
		//ArrayList<String> list=new ArrayList();
		//ArrayList<Integer> list=new ArrayList();
		  for(int i=0;i<n;i++) 
		  {
	    	  System.out.println("Enter the Name");
			  String name=sc.next();
	    	  System.out.println("Enter the age");
			  int  age=sc.nextInt();
			  list.add(name);// add method 
			  list.add(age);
		  }
    	  System.out.println("Enter the Update Name");
		  String name1=sc.next();
		  list.set(0, name1);
		  list.clear();
		  Iterator itr=list.iterator();//It is used to traverse a elements one by one.
		  while(itr.hasNext())//boolean hasNext():Returns true if the iteration has more elements.
		  {  
		   System.out.println(itr.next());  //Returns the next element in the iteration.

		  } 

	

}
}




















//ArrayList list1=(ArrayList) list.clone();// clone Method
//list1.remove(0);// remove Method
//System.out.println(list1.get(0)); // get Method
//list1.clear(); // Clear Method
	// System.out.println("Enter the Update Name");
// String name=sc.next();
 //list1.set(0,name);//Update Method
	//System.out.println("Update Name");
//System.out.println(list1.get(0));
