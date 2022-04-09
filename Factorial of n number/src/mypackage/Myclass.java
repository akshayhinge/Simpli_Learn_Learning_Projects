package mypackage;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n=sc.nextInt();
	int fact=n;
	for(int i=1;i<n;i++)
		 fact=fact*i;
	System.out.print("factorial of " +n+ " is " +fact);
	}
}
