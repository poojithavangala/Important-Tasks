//Interfaces example
public class Person1 implements Info {
	private String name;
	public Person1(String name){
		this.name = name;
	}

	public void greet(){
		System.out.println("Hello there!");
	}

	public void showinfo() {
		System.out.println("Person name is:" + name);
		
	}

}
