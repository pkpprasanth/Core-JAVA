package Collections;
import java.io.*;
import java.util.*;

public class CarCrd{

	public static void main(String args[]) 
	{
		String symbol;
		int num,count=0;
		
		Scanner sc=new Scanner(System.in);
		Set<NewCard> s = new TreeSet<NewCard>(new Symbol());
		NewCard[] c = new NewCard[40];
		int n=sc.nextInt();
			
		while(s.size()<n)
		{
			symbol = sc.next();
			num = sc.nextInt();
			c[count] = new NewCard();
			c[count].setSymbol(symbol);
			c[count].setNumber(num);
			s.add(c[count]);
			count++;
		}
		System.out.println(n+"symbols gathered in "+count+" cards.");
		System.out.println("Cards are ");
		
		Iterator<NewCard> itr = s.iterator();
		while(itr.hasNext())
		{
			NewCard ca = (NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNumber());
		}
}
}
