package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int n,i;
	       String name,email;
	       int age;
	       Scanner sc=new Scanner(System.in);
 	      System.out.println("Enter the Size");
	       n=sc.nextInt();
	       ArrayList al = new ArrayList();
	       Employee[] emp=new Employee[n];
	       for(i=0;i<n;i++)
	       { 
	    	   System.out.println("Enter the Name");
	    	   name=sc.next();
	    	   System.out.println("Enter the Age");
	    	   age=sc.nextInt();
	    	   System.out.println("Enter the Email");
	    	   email=sc.next();
	    	   emp[i]=new Employee();
	    	   System.out.println("do u want to Update the Email yes/no");
	    	   String m=sc.next();
	    	   String c=m.toLowerCase();
	    	   if(c.equals("yes"))
	    	   {
		    	   System.out.println("Enter the update Email");
		    	   String m1=sc.next();
		    	   emp[i].setEmail(m1);
		    	   emp[i].setAge(age);
		    	   emp[i].setName(name);
	    	   }
	    	   else
	    	   {
	    	   emp[i].setAge(age);
	    	   emp[i].setName(name);
	    	   emp[i].setEmail(email);
	    	   }
	    	   al.add(emp[i]);
	       }
	        Iterator<Employee> itr = al.iterator();
	        int j=1;
	        while(itr.hasNext())
	        {
	        	
	        	Employee e = itr.next();
	        	  System.out.println("Employee Details "+ j);
	        	  System.out.println("************************** ");
	            System.out.println("Name -> "+e.getName());
	            System.out.println("Age -> "+e.getAge());
	            System.out.println("Email -> "+e.getEmail());
	            System.out.println("");

	            j++;
	        }
	      	  

	}

}


























/*System.out.println("List of Employee");
  int index=0;
  Iterator<Employee> itr2 = al.iterator();

while(itr2.hasNext())
{
	
	Employee e = itr.next();
	System.out.println("ID             Name");
	System.out.println(index +"        "+e.getName());
}  
System.out.println("Do u want to delete the Employee details yes/no");
String m=sc.next();
String c=m.toLowerCase();
if(c.equals("yes"))
{
  System.out.println("Enter the Employee Id");
  int id=sc.nextInt();
  al.remove(id);
Iterator<Employee> itr1 = al.iterator();
int j1=1;
while(itr1.hasNext())
{
	
	Employee e = itr.next();
	  System.out.println("Employee Details "+ j1);
	  System.out.println("************************** ");
  System.out.println("Name -> "+e.getName());
  System.out.println("Age -> "+e.getAge());
  System.out.println("Email -> "+e.getEmail());
  System.out.println("");

  j1++;
}
  

}
else {
System.out.println("Have a Nice Day");

}*/