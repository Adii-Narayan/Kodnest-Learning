import java.util.Scanner;

public class TenChecker {

	public static void checkMultipleOfTen(int n) {

	if(n%10==0) {
		System.out.println("The number is a multiple of 10.");
	}
	}

	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no to check multiplr of ten");
		int n=scan.nextInt();
		checkMultipleOfTen(n);
	}

	
}
