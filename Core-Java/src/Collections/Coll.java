package Collections;
import java.io.*;
import java.util.*;

public class Coll {
		public static void main(String args[])
		{
		int i=0,c;
			Scanner sc= new Scanner(System.in);
			ArrayList<String> al = new ArrayList<String>();
			
			do
			{
				System.out.println("1.Display installed applications\n"
						+ "2.Install an application\n3.Uninstall an application\n4.Quit");
				 c = sc.nextInt();
				switch(c)
				{
				case 1:
					if(al.isEmpty())
						System.out.println("There is no application installed.");
					else
					{
						System.out.println("Installed applications are :");
						Iterator<String> itr = al.iterator();
						while(itr.hasNext())
						{
							i++;
							String s= (String)itr.next();
							System.out.println(i+") "+s);
						}
						i=0;
					}
					break;
				case 2:
					System.out.println("Enter Name :");
					al.add(sc.next());
					System.out.println("Application installed successfully.");
				    break;
				case 3:
					System.out.println("Installed applications are :");
					Iterator<String> itr = al.iterator();
					while(itr.hasNext())
					{
						i++;
						String s= (String)itr.next();
						System.out.println(i+") "+s);
					}
					i=0;
					System.out.println("Enter the application number :");
					int num = sc.nextInt();
					Iterator<String> itr1 = al.iterator();
					while(itr1.hasNext())
					{
						i++;
					
						String s1= (String)itr1.next();
						if(i==num)
						{
							al.remove(s1);
							System.out.println("Application uninstalled successfully.");
							break;
						}
						else if(num>al.size())
						{
							System.out.println("Application not found.");
							break;
						}
					}
					i=0;
					break;
				}
			}while(c!=4);
		}

}
