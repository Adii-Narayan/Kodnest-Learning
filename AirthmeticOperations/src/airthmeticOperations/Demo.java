package airthmeticOperations;

import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(subtractNumbers(num1,num2));
		System.out.println("Enter 2 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println(multiplyNumbers(num1,num2));
		System.out.println("Enter 2 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println(divideNumbers(num1,num2));
		System.out.println("Enter 2 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println(findRemainder( num1,  num2));

	}
	public static int subtractNumbers(int num1, int num2) {
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2) {
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2) {
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2) {
		return num1%num2;
	}

}

