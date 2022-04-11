package mypackage;

import java.util.Scanner;

public class Myclass {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a Number");
	System.out.println("==============");
	int n = sc.nextInt();
	int a=1;
	for(int i=2;i<=n;i++){
		if(n%i==0)
			a=0;
			break;
		    
	}
	if(a==0)
		System.out.println(n+" is not a prime number.");
	else
		System.out.println(n+" is a prime number.");
	 	
	}

}
