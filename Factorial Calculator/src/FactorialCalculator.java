import java.util.Scanner;

public class FactorialCalculator {
	
	public static void calculateFactorial(int n)

	{

	int res=1;
	for(int i=1;i<=n;i++) {
		res=res*i;
	}
	System.out.println(res);

	}

	public static void main(String[] args)

	{

	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	calculateFactorial(n);

	}

}
