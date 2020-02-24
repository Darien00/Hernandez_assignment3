import java.util.Random;
import java.util.Scanner;

public class CAI5 {
	static Random randomNumber = new Random();
	private static int answerCounter =0;
	private static int correctAnswer=0;

	public static void main(String[] args) {
		

		
		
		quiz();

	}
	
	public static void quiz() {
		readifficulty();
		
	}
	
	public static void askQuestion(int number1, int number2) {
		
		
		
		for(int count = 1 ;count <= 10;count++) {
			
		
		//prompt
		System.out.printf("How much is %d times %d:", number1, number2);
		
		readResponse(number1, number2);
		}
		
		Scanner input= new Scanner(System.in);
		System.out.print("Would you like to try a new problem set 1:YES 2:NO");
		int studentResponse = input.nextInt();
		
		if(studentResponse == 1) {
			answerCounter =0;
			correctAnswer =0;
			quiz();
		}
		else if(studentResponse ==2) {
			
		}
	
	}
	
	//acquire responses from user and compares to answer
	public static void readResponse(int num1, int num2 ) {
		
		//create a scanner class to read from standard input for response
		Scanner input = new Scanner(System.in);
		
		//read response from user
		int response = input.nextInt();
		
		
		isAnswerCorrect(response, num1, num2);
		
	}
	
	public static void isAnswerCorrect(int response, int n1, int n2) {
		
		int answer = n1 * n2;
		
		if(answer == response) {
			displayCorrectResponse();
			correctAnswer ++;
			
			
		}
		
		if(answer != response) {
			displayIncorrectResponse();
					
		}
		answerCounter++;
		if(answerCounter ==10) {
			double percentage=((double)correctAnswer / (double)answerCounter)*100;
			if(percentage >= 75) {
				System.out.println("Congratulations your read for the next level");
			}
			else if(percentage <75) {
				System.out.println("Please ask teacher for help");
			}
		}
	}
	
	//will display if correct answer equals response
	public static void displayCorrectResponse() {
		int CorrectResponse = 1+ randomNumber.nextInt(4);
		switch(CorrectResponse) {
		case 1: 
			System.out.println("Very good!");
			break;
			
		case 2:
			System.out.println("Excellent!");
			break;
			
		case 3: 
			System.out.println("Nice work");
			break;
			
		case 4:
			System.out.println("Keep up the good work!");
			break;
		}
		
	}
	//will display if correct answer and response are not equal
	public static void displayIncorrectResponse(){
		int incorrectResponse = 1 + randomNumber.nextInt(4);
		switch(incorrectResponse) {
		case 1:
			System.out.println("No. please try again");
			break;
			
		case 2:
			System.out.println("Wrong.Try once more!");
			break;
		
		case 3:
			System.out.println("Dont give up!");
			break;
			
		case 4:
			System.out.println("No. Keep trying");
			break;
		}
	}
	public static int readProblemType() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Problem leve 1-2-3-4-5");
		int level = input.nextInt();
		return level;
	}
	public static void readifficulty() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the difficulty level 1-2-3-4");
		int difficulty = input.nextInt();
		 generateQuestionArgument(difficulty);
	}
	
	public static void generateQuestionArgument(int difficulty) {
			int number1 = 0;
			int number2 = 0;
		
		switch(difficulty) {
		case 1:
			number1 = randomNumber.nextInt(9);
			number2 = randomNumber.nextInt(9);
			
	
			break;
		
		case 2:
			number1 = randomNumber.nextInt(99);
			number2 = randomNumber.nextInt(99);
			
			break;
			
		case 3:
			number1 = randomNumber.nextInt(999);
			number2 = randomNumber.nextInt(999);
			
		
			break;
		
		case 4:
			number1 = randomNumber.nextInt(9999);
			number2 = randomNumber.nextInt(9999);
			break;
			
			
			
		}
		askQuestion(number1, number2);
	}
}
