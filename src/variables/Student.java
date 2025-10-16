package variables;

public class Student {

	 int number = 80;  //instance variable
	 static int number2 = 80;  //instance variable
	
	void local(){
		int num = 10;  //local variable
		System.out.println(number + num);
	}
	
	void local2() {
		int num2 = 20;    //local variable
		System.out.println(number + num2);
	}
	
	static void local3() {
		int num3 = 30;
		System.out.println(number2 + num3);
	}
	
public static void main(String[] args) {
	Student s = new Student();
	s.local();
	s.local2();
	//s.local3();
	Student.local3();
}
}
