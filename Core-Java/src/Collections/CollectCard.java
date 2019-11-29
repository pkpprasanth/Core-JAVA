package Collections;
import java.io.*;
import java.util.*;

public class CollectCard {
		public static void main(String arg[]) 
		{
			int Cards,num,i,count=0,sum=0;
			String symbol;
		    Scanner sc = new Scanner(System.in);
			ArrayList<Card> list = new ArrayList<Card>();
			Map<String, Card> map = new TreeMap<String, Card>();
			
			System.out.println("Enter Number of Cards : ");
			Cards = sc.nextInt();
			Card[] c = new Card[Cards];
			for(i=0;i<Cards;i++)
			{
				System.out.println("Enter card :"+(i+1));
				symbol = sc.next();
				num = sc.nextInt();
				c[i] = new Card();
				c[i].setSymbol(symbol);
				c[i].setNumber(num);
				list.add(c[i]);
				map.put(c[i].getSymbol(),c[i]);
			}
			System.out.println("Distinct Symbols are : ");
			Set<String> keys = map.keySet();
			for(String key:keys)
				System.out.print(key+" ");
			System.out.println();
			for(String key:keys)
			{
				System.out.println("Cards in "+key+" Symbol");
				Iterator<Card> itr =  list.iterator();
				while(itr.hasNext())
				{
					Card ca = itr.next();
				if(ca.getSymbol().equals(key))
					System.out.println(ca.getSymbol()+" "+ca.getNumber());
				}
				Iterator<Card> itr1 =  list.iterator();
				while(itr1.hasNext())
				{
					Card ca = itr1.next();
					
					if(ca.getSymbol().equals(key))
					{
						count++;
						sum = ca.getNumber() + sum;
					}
				}
				System.out.println("Number of cards : "+count);
				System.out.println("Sum of Number : "+sum);
				count=sum=0;
			}
		}
}
			
			


