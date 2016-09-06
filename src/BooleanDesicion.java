import java.util.Scanner;

public class BooleanDesicion {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your test score: ");
		int score = scan.nextInt();
		String grade = "F";// I'm not hopeful

		if (score > 89){
			if(score%10 <3)
				grade = "A-";
			else if(score%10 >6 )
				grade = "A+";
			else
				grade = "A";
			
			}
		else if (score > 79)
			grade = "B";
		else if (score > 69)
			grade = "C";
		else if(score >59)
			grade = "D";
		else
			grade = "F";

		System.out.println("Your Grade is: "+ grade);
		
		scan.close();

	}

}
