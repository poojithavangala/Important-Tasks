//Setter method
class Frog {
	String name;
	int age;
	public void setName(String newName){
		name = newName;
	}

	public String getName(){
	return name;
}
	public int getAge(){
	return age;
	}
}



public class Setters {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		//frog1.name = "Ben";
		//frog1.age = 5;
		frog1.setName("Bertie");
		//System.out.println(frog1.getName());
		

	}

}
 