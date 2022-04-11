package mypackage;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number :");
		int a=sc.nextInt();
		if(a%2==0)
			System.out.println("The Number "+ a +" is an Even Number");
		else
			System.out.println("The Number "+ a +" is an Odd Number");

		


	}

}
