
public class Grade {
	void GradeCal(int Score) {
		if(Score>=90) {
			System.out.println("A+ Grade");
		}
		else if(Score>=80 && Score<90) {
			System.out.println("A Grade");
		}
		else if(Score>=70 && Score<80) {
			System.out.println("B Grade");
		}
		else if(Score>=60 && Score<70) {
			System.out.println("C Grade");
		}
		else if(Score>=50 && Score<60) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail.....");
		}
		
		
	}

}
