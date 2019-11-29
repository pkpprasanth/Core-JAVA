package Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class LinkedListClone {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int  n=sc.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		  for(int i=0;i<n;i++) {
			  String name=sc.next();
			  list.add(name);
		  }
		  
		  LinkedList<String> list1 = (LinkedList<String>)list.clone();
		  
		  Iterator itr=list1.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  
		  int  m=sc.nextInt();
		  for(int i=0;i<m;i++) {
			  String name=sc.next();
			  list1.add(name);
		  }
		  list.addAll(list1);
		  Iterator itr1=list.iterator();  
		  while(itr1.hasNext()){  
		   System.out.println(itr1.next());  
		  }  
		  sc.close();
	}

}
