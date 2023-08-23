package nestedloops;

public class namedloops {

	public static void main(String[] args) {
		System.out.println("Robo.....");
		int i=1;
		int j=1;
		tony:while(i<=5) {
			
			stark:while(j<=5) {
			System.out.print("* ");
			j++;
			break tony;
			}
			i++;
			System.out.println();
		}
		
	}

}
