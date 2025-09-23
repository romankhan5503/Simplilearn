package keyword;

class This{
	int i;
//	void setValue(int x) { 
//		//if we change the variable x into i then it will be zero and if we want 10 then we will use this
//		i = x;
//	}
	
	void setValue(int i) { 
		//if we change the variable x into i then it will be zero and if we want 10 then we will use this
		this.i = i;
	}
	
	void show() {
		System.out.println(i);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		This t = new This();
		t.setValue(10);
		t.show();

	}

}
