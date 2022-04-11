package mypackage;

import java.util.Scanner;

public class MyClass {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please select a pattern");
        System.out.println("1.    *");
        System.out.println("     * *");
        System.out.println("    * * *");
        System.out.println("   * * * * ");
        System.out.println("  * * * * *");
        System.out.println("2.* * * * *");
        System.out.println("   * * * * ");
        System.out.println("    * * *");
        System.out.println("     * *");
        System.out.println("      *");
        System.out.println("3.    *");
        System.out.println("     **");
        System.out.println("    ***");
        System.out.println("   ****");
        System.out.println("  *****");
        System.out.println("4. *****");
        System.out.println("   ****");
        System.out.println("   ***");
        System.out.println("   **");
        System.out.println("   *");
        System.out.println("5.  *****");
        System.out.println("     ****");
        System.out.println("      ***");
        System.out.println("       **");
        System.out.println("        *");

        Patterns p=new Patterns();
		int n=sc.nextInt();
		switch(n) {
		case 1: p.pattern_1();
		break;
		case 2: p.pattern_2();
		break;
		case 3: p.pattern_3();
		break;
		case 4: p.pattern_4();
		break;
		default :System.out.println("Please enter a valid number");
        }	
		 
		
		
		
	}

}
