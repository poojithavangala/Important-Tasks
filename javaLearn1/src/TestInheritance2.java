class Birds{
	void nest(){
		System.out.println("Birds build their own nest");
	}
}
class Children extends Birds{
	void gender(){
		System.out.println("Children have two genders");
		
	}
class Food extends Children{
	void eat(){
		System.out.println("Food is brought by mother");
	} 
}	
	
class TestInheritance2 {
public void main(String args[]){
Food f = new Food();
f.eat();
f.gender();
f.nest();
}
}
}

