import java.util.Scanner;

public class ControlConstruct {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=scan.nextInt();
		System.out.println("Welcome to Kodnest");
		Techclub(marks);
		

	}
	public static void Techclub(int marks) {
		if(marks>=80) {
			System.out.println("Welcome to Techclub");
		}
	}
}
