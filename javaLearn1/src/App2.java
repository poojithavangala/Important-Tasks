
public class App2 {
	public final static int LUCKY_NUMBER = 7;//CONSTANT declaration
	public String name;
	public static String description;
	public static int count = 0;
	public App2(){
		count++;
	}
	
	public void showName(){
		System.out.println(name);
	}
	
	
public static void main(String[] args) {
	App2.description = "Both are good friends";
	System.out.println(App2.description);
	System.out.println("Before creating object,count is:" + App2.count);
		
		App2 app = new App2();
		app.name = "ben";
		App2 app1 = new App2();
		app1.name = "newton";
		//System.out.println(app.name);
		System.out.println("After creating object,count is:" + App2.count);
		System.out.println(app1.name);
		app.showName(); 
		System.out.println(App2.LUCKY_NUMBER);

	}

}
