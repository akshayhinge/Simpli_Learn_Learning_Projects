package mypackgae;

import java.util.Scanner;

public class Myclass {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter number that you want to sum it");
	 System.out.println("====================================");
	 int a=sc.nextInt() ;
	 int b,c=0;
	 for(int i=1;i<=a;i++) {
		 System.out.print("Enter a " + i+" number : ");
	     b=sc.nextInt();
	     c=c+b;
	 }
	 System.out.println("Sum of "+a +" numbers is " + c);
	 
	 
 }
}
