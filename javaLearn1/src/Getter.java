
public class Getter {
	String name;
	int age;
	int timeToretirement(){
		int yearsLeft = 65 - age ; 
		return yearsLeft;
	}
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}

	
	public static void main(String[] args) {
		Getter person1 = new Getter();
		person1.name = "pooh";
		person1.age = 20;
		int years = person1.timeToretirement();
		System.out.println("Years till retirement : " + years);
		int age = person1.getAge();
		System.out.println("Age is : " + age);
		String name = person1.getName();
		System.out.println("Name is : " + name);
		

	}

}
