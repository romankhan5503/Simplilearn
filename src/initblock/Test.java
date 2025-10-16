package initblock;

public class Test {

	Test(){
		System.out.println("print");
	}
	{
		System.out.println("init block3");
	}
	{
		System.out.println("init block1");
	}
	{
		System.out.println("init block4");
	}
	public static void main(String[] args) {
		new Test();
		new Test();
		{
			System.out.println("init block2");
		}
		{
			System.out.println("init block5");
		}

	}
	
		
	}


