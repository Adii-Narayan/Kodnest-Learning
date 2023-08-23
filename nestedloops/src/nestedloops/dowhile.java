package nestedloops;

public class dowhile {
	public static void main(String[] args) {
		
		System.out.println("Robo.....");
		int i=1;
		int j=1;
		tony:do {
			
			
			stark:do {
			System.out.print("* ");
			j++;
			break stark;
			}while(j<=5);
			i++;
			System.out.println();
		}while(i<=5);
	}

}
