import java.util.Scanner;

public class SumofNaturalNumbersCalculator {
	public static void calculateSum(int n)

	{   
		int res=0;
		for(int i=1;i<=n;i++) {
		res=res+i;	
		
		}
		System.out.println(res);

	}

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		calculateSum(n);
		

	}

}
