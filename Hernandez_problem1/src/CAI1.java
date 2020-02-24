import java.util.Random;
import java.util.Scanner;

public class CAI1 {
	static Random randomNumber = new Random();

	public static void main(String[] args) {
		

		
		
		quiz();

	}
	
	public static void quiz() {
		askQuestion();
	}
	
	public static void askQuestion() {
		
		//declare random numbers into variables
		int number1 = randomNumber.nextInt(9);
		int number2 = randomNumber.nextInt(9);
		
		//prompt
		System.out.printf("How much is %d times %d:", number1, number2);
		
		readResponse(number1, number2);
		
	
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
		}
		
		if(answer != response) {
			displayIncorrectResponse();
			do {
				System.out.printf("How much is %d times %d:", n1, n2);
				
				readResponse(n1, n2);
			}while(answer == response);
					
		}
	}
	
	//will display if correct answer equals response
	public static void displayCorrectResponse() {
		System.out.printf("Very Good%n");
	}
	//will display if correct answer and response are not equal
	public static void displayIncorrectResponse(){
		System.out.printf("No. Please try again.%n");
	}
	
	

}
