import java.util.Scanner;




public class Application {
	public static void main(String[] args) {
		//Created scanner object
		Scanner input = new Scanner(System.in);
		//output as prompted
		System.out.println("Enter a line of text : ");
		//Wait for the user to enter a line of text
		String line = input.nextLine();
		//Tell them what they entered
		System.out.println("You entered : " + line );
		
		//Create another scanner object
		Scanner inlet = new Scanner(System.in);
		//Print this line
		System.out.println("Enter age : ");
		//User gives input here
		int number = inlet.nextInt();
		//Prints the line with age
		System.out.println("Age is : " + number);
		
	}
	

}
