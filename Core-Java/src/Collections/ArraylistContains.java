package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArraylistContains {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	     int  n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		  for(int i=0;i<n;i++) {
			  String name=sc.next();
			  list.add(name);
		  }
		  int  m=sc.nextInt();
		  ArrayList<String> list1 = new ArrayList<String>();
		  for(int i=0;i<m;i++) {
			  String name=sc.next();
			  list.add(name);
		  }
		  
		  boolean flag =list.containsAll(list1);
		  if (flag == true) {
		         System.out.println("contains");
		      } else {
		         System.out.println("not");
		      }
	}

}

