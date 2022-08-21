package PraveenSir;

import java.util.Scanner;

public class ReverseANumber {public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter a number to reverse");
	int number=scanner.nextInt();
	int rev=0;
	int rem;

while (number!=0) {
	rem=number%10;
	rev=rev*10+rem;
	number=number/10;
	
	
}System.out.println(rev);


// aproach 2 by stringbuffer 
//Scanner scanner=new Scanner(System.in);
System.out.println("enter a number to reverse");
int number1=scanner.nextInt();
StringBuffer revBuffer;
StringBuffer sb=new StringBuffer(String.valueOf(number1));
revBuffer=sb.reverse();
System.out.println(revBuffer);


// aproach 3 using stringbuilder class
//Scanner scanner=new Scanner(System.in);
System.out.println("enter a number to reverse");
int number3=scanner.nextInt();
StringBuilder sb1=new StringBuilder();
sb1.append(number3);
System.out.println(sb1.reverse());




}

}
