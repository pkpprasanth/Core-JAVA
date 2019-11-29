package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayRemove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int  n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		  for(int i=0;i<n;i++) {
			  String name=sc.next();
			  list.add(name);
		  }
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  list.clear();
		  Iterator itr1=list.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
		  } 
	}		  
}
