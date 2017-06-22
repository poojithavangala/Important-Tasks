//This keyword is used to invoke a method in an other method
class A{
	void m(){
		System.out.println("Hello method m");
	}
	void n(){
		System.out.println("Hello method n");
		this.m();
	}
}
public class TestThis4 {
public static void main(String[] args) {
A a = new A();
a.n();
	}

}
