import java.util.Scanner;

public class TheJourneyCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Speed and Time");
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator journeyCalculator = new JourneyCalculator();
		double distance=journeyCalculator.calculateDistance(speed, time);
		System.out.println(distance);
		
		
		
		
		
	}

	
	}
	
		
		

