
public class Person {
	String name;
	int age;
	void speak(){
		System.out.println("my name is " + name + " and my age is " + age);
	}
	void calculateYearstoretirement(){
		int yearsleft = 65 - age;
		System.out.println(yearsleft);
	}

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.name = "poojitha";
		person1.age = 55;
		person1.speak();
		person1.calculateYearstoretirement();
		
		Person person2 = new Person();
		person2.name = "vangala";
		person2.age = 21;
		person2.speak();
		

	}

}
