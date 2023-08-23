import java.util.Scanner;


public class doubleTrouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=sc.nextInt();
		System.out.println(doubleTheNumber(n));

	}
	public static int doubleTheNumber(int num) {
		return num*2;
	}

}
