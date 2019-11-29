package Multithreading;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ss=s.next();
		C1 t=new C1(ss);
		t.start();
		
	}
}

class C1 extends Thread{
	
	String str;
	public C1(String ss)
	{
		str=ss;
	}
	public void run()
	{
		
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
		try
		{
			
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("thread running"+i+"time");
		System.out.println(c);
	}
}
}