import java.util.Scanner;

public class DiscountApplication {
	
		public static void checkDiscount(double purchaseAmount)

		{
			if(purchaseAmount>=100)
				System.out.println("Discount Applicable");
		

		}

		public static void main(String[] args)

		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the purchase amount");
			double a=scan.nextDouble();
			checkDiscount(a);

		

		}

		}


