package Collections;
import java.util.*;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String mail=sc.next();
		String number=sc.next();
		String proofid=sc.next();
		String proof=sc.next();
		
		Encansulation encap=new Encansulation();
		encap.setName(name);
		encap.setMail(mail);
		encap.setNumber(number);
		encap.setProofid(proofid);
		encap.setProof(proof);
		encap.display();
	}

}
