
public class App {

	public static void main(String[] args) {
		Machine1 mach1 = new Machine1();
		mach1.start();
		
		Person1 prsn = new Person1("Bob");
		prsn.greet();
		
		Info info = new Machine1();//since Machine class implements Info class
		info.showinfo();
		Info info2 = prsn;
		info2.showinfo();
		
		

	}

}
