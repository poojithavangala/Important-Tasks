//Constructor is a special method which is run everytime you create an instance of a class 

public class Machine {
public Machine(){//constructor is declared just like a class
	System.out.println("Constructor running !");
}
	

	public static void main(String[] args) {
	Machine machine1 = new Machine(); 	
	new Machine(); //calling the constructor here which is defined in Machine class
	}	

}
