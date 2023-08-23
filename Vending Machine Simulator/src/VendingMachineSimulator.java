import java.util.Scanner;

public class VendingMachineSimulator {
	
	public static void getProduct(String productCode)

	{
		switch(productCode) {
		
		
		case "P01":
			System.out.println("Coca Cola");
			break;
		case "P02":
			System.out.println("Pepsi");
			break;
		case "P03":
			System.out.println("Pepsi");
			break;
		case "P04":
			System.out.println("Pepsi");
			break;
		case "P05":
			System.out.println("Pepsi");
			break;
		case "P06":
			System.out.println("Pepsi");
			break;
			default:
				System.out.println("Panaka");
		
		}

	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the product code");
		String productCode=scan.nextLine();
		getProduct(productCode);
		
		
		

	}

}
