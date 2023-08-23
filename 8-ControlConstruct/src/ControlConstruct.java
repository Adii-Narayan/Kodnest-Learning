import java.util.Scanner;

public class ControlConstruct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Score");
		int Score=scan.nextInt();
		Grade grade=new Grade();
		grade.GradeCal(Score);
		
		
		

	}

}
