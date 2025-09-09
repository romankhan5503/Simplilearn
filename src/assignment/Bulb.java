package assignment;

public class Bulb {

	int watt;
	float price;
	String color;
	boolean state;
	static int counter;
	static String cname;
	
	static {
		counter = 0;
		cname = "SURYA";
	}
	
	{
		counter++;
	}
	
	Bulb(){
		watt = 20;
		price = 25.60f;
		color = "red";
		state = true;
	}
	
	Bulb(int watt,float price,String color,boolean state){
		this.watt = watt;
		this.price = price;
		this.color = color;
		this.state = state;
	}
	
	void showdetail() {
		System.out.println("Company Name of Bulb is :" +cname);
		System.out.println("Watt of Bulb is :" +watt);
		System.out.println("Price of Bulb is :" +price);
		System.out.println("Color of Bulb is :" +color);
		System.out.println("State of Bulb is :" +state);
	}
	
	void changestate() {
		if (state==true)
			System.out.println("true");
		else
			System.out.println("false");
	}
	
	static void countbulb() {
		System.out.println("Total Number of Bulb is : " +counter);
	}
	
	void changecompanyname(String cname) {
		this.cname = cname;
	}
	
	public static void main(String[] args) {
		countbulb();
		
		System.out.println("--------Creating same type of bulb---------");
		Bulb b1 = new Bulb();
		Bulb b2 = new Bulb();
		Bulb b3 = new Bulb();
		
		System.out.println("--------Details of 1st bulb---------");
		b1.showdetail();
		
		System.out.println("--------Details of 2nd bulb---------");
		b2.showdetail();
		
		System.out.println("--------Details of 3rd bulb---------");
		b3.showdetail();
		countbulb();
		
		System.out.println("--------Creating Different type of bulb---------");
		Bulb b4 = new Bulb(10,30.5f,"yellow",true);
		Bulb b5 = new Bulb(30,50.60f,"white",false);
		Bulb b6 = new Bulb(5,40.80f,"red",true);
		
		System.out.println("--------Details of 4th bulb---------");
		b4.changestate();
		b4.changecompanyname("phillips");
		b4.showdetail();
		
		System.out.println("--------Details of 5th bulb---------");
		b5.changestate();
		b5.changecompanyname("phillips");
		b5.showdetail();
		
		System.out.println("--------Details of 6th bulb---------");
		b6.changestate();
		b6.changecompanyname("phillips");
		b6.showdetail();
		countbulb();

	}

}

