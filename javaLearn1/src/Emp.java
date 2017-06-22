
public class Emp {
	int id;
	String name;
	Address address; // aggregation (getting properties from other class)

public Emp(int id,String name,Address address){
	this.id = id;
	this.name = name;
	this.address = address;
}
void display(){
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);
}

	public static void main(String[] args) {
		Address address1 = new Address("gzb","AP","India");
		Address address2 = new Address("karimnagar","telangana","India");
		
		Emp emp1 = new Emp(215," pooh",address1);
		Emp emp2 = new Emp(121,"vangala",address2);
		emp1.display();
		emp2.display();
		

	}

}
