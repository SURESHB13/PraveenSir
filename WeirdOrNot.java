package PraveenSir;

import java.util.Scanner;

public class WeirdOrNot {public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number to check whether the given number is weird or not");
	System.out.println(" or enter 0 to exit");
	int number=scanner.nextInt();
	if (number==0) {System.exit(0);}
	if (number%2!=0) {System.out.println("weird");}
	if (number%2==0&& number>=2&&number<=5) {
		System.out.println("not weird");}
	if (number%2==0 && number>=6&&number<=20) {
		System.out.println("weird");}
	if (number%2==0&& number>20) {
		System.out.println("not weird");}
}
}
