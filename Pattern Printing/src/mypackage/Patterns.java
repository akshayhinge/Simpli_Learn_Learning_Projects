package mypackage;

public class Patterns {
 public void pattern_1(){
	 for(int i=0;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int a=0;a<i;a++) {
				System.out.print("* ");
			 }
			
			System.out.println();
		}
	 
 }
 public void pattern_2(){
	 for(int i=0;i<=5;i++) {
		 for(int a=0;a<i;a++) {
			 System.out.print(" ");
		 }
		 for(int j=5;j>i;j--) {
			 System.out.print("* ");
		 }
		 
		 System.out.println();
	 }
 }
 public void pattern_3(){
	 for(int i=0;i<=5;i++) {
		 for(int j=5;j>i;j--) {
			 System.out.print(" ");
		 }
		 for(int a=0;a<i;a++) {
			 System.out.print("*");
		 }
		 
		 System.out.println();
	 }
	 
 }
 public void pattern_4(){
	 for(int i=0;i<=5;i++) {
		 for(int j=5;j>i;j--) {
			 System.out.print(" *");
		 }
		 /*for(int a=0;a<i;a++) {
			 System.out.print(" ");
		 }*/
		 
		 System.out.println();
	 }
 }
}
