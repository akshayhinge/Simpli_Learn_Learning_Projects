package mypackage;

import java.util.Scanner;

public class anotherone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many numbers of line you want to print in pattarn");
		System.out.println("=====================================================");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=n;j>i;j--) 
				System.out.print(" *");
	
		System.out.println("");
		}
	}

}
