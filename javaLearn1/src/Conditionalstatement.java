
public class Conditionalstatement {

	public static void main(String[] args) {
		int score=60;
		String grade;
		if (score >= 75){
			grade = "A";
		}
		else if (score >= 50){
			grade = "B";
		}
		else{
			grade = "C";
		}
		System.out.println("Score is : " +score);
		System.out.println("Grade is : " +grade);
	}

}
