//for loop syntax- for(initialization; boolean_expression; update)
public class LoopsDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			System.out.println("The value of i: " + i);
		}
		int[] numbers = {10,20,30};
		for (int i = 0; i < numbers.length; i++){
			System.out.println("The value of index " + i + " is: " + numbers[i]);	
		}

	}

}
