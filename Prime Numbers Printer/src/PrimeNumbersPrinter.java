import java.util.Scanner;

public class PrimeNumbersPrinter {
	
	public static void printPrimes(int n)

	{

	int c=2,fact=1;
	if(c<=n) {
	for(int i=2;c<n;i++) {
		if(n%i!=0) {
			c++;
			
			
		}
		System.out.println(i);
		
	}

	}
	
	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		printPrimes(n);

	}

}
