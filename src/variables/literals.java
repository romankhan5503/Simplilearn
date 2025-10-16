package variables;

public class literals {

	public static void main(String[] args) {
		int a = 0b11010;   //binary 
		int b = 1_00_001_001;  //it also happen
		int c = 032;           //octal number
		int d = 0x34;          //hexadecimal
		
		String name = "Zubair";
		String name2 = "Quraishi";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.print(name+"\t"+name2);
		//System.out.print(name2);

	}

}
