import java.util.Scanner;

public class EvenNumberPrinter {
	
	public static void printEvenNumbers(int n)

	{
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)

	{

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scan.nextInt();
	printEvenNumbers(n);

	}

}
