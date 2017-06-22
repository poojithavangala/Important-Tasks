class Robot{
	public void speak(String text){ //parameter is passed into method "String text is a method parameter"
		System.out.println(text);
	}
	public void jump(int height){
		System.out.println("Jumping:" + height);
	}
	public void move(String direction, double distance){
		System.out.println("Moving " + direction + " with " + distance + " per/mile ");
	}

}

public class App1 {
	
	public static void main(String[] args) {
		Robot sam = new Robot();
        sam.speak("Heylo Good noon!"); // passing string into this 
	    sam.jump(7);//passing the method parameter type int into this main method
	    sam.move("East", 13);
	}

}
