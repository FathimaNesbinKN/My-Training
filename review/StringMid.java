package review;

import java.util.Scanner;


public class StringMid {
	
	
	public static void main(String args[]) {
		
	
	System.out.println("Enter the string: ");
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	
	int n = st.length();
	
	if ( (n%2)==0)
	{
		int p=(n/2)-1;
		int q= (n/2);
		System.out.println("The middle letters are :"+st.charAt(p)+st.charAt(q));
	}
		
	else
	{
		int r = (n/2);
		System.out.println("The middle letter is :"+st.charAt(r));
	}
	
	}
}
