import java.util.Scanner;

public class PolygonIdentifier {
	public static void identifyPolygon(int sides)

	{

	switch(sides) {
	case 3:
		System.out.println("Triangle");
		break;
		
	case 4:
		System.out.println("Quadrilatera");
		break;
		
	case 5:
		System.out.println(",Pentagon");
		break;
		
	case 6:
		System.out.println("Hexagon");
		break;
		
		default:
			System.out.println("Polygon");
			break;
		
	}

	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the no of sides");
		int sides=scan.nextInt();
		identifyPolygon(sides);
		

	}

}
