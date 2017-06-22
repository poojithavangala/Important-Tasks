//Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object.
//The idea behind inheritance in java is that you can create new classes that are built upon existing classes. 
//When you inherit from an existing class, you can reuse methods and fields of parent class, and you can add new methods and fields also.
//Inheritance represents parent-child relationship.
//The extends keyword indicates that you are making a new class that derives from an existing class.
//The meaning of "extends" is to increase the functionality.

class Employee{
	float salary=4000;
}
public class Programmer extends Employee {
int bonus=10000;
	public static void main(String[] args) {
	Programmer p = new Programmer();
	System.out.println("Programmer salary is : " +p.salary);
	System.out.println("Bonus of programmer is : " +p.bonus);
	}

}
