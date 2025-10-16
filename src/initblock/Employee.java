package initblock;

public class Employee {

	String name,city,state,country;
	int age;
	
	Address adr;
	{
		adr = new Address();
	}
	
	Salary sal;
	{
		sal = new Salary();
	}
	
	void show() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
		System.out.println("Address :" +adr.city+"\n"+adr.state+"\n"+adr.country);
		System.out.println("Salary :"+sal.td+"\n"+sal.sd+"\n"+sal.pf);
	}
	
	Employee(String n,int a){
		name = n;		
		age = a;
		
	}
	
	public static void main(String[] args) {
		Employee e = new Employee("mrk", 22);
		e.show();

	}

}
