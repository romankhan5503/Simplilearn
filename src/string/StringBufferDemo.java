package string;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//methods
		StringBuffer sb = new StringBuffer();
		//capacity showing how many numbers stringbuffer stores
		System.out.println(sb.capacity()); 
		
		sb.append("hello");
		System.out.println(sb.capacity());   // 16 + string length
		
		sb.append(" Roman Javaaa ");
		System.out.println(sb.capacity());   //(16*2+2)  show 34
		
		sb.append(" Hey Roman how are u right now ");
		System.out.println(sb.capacity());   //(34*2+2)  show 70

		//length shows how much numbers of characters present
		System.out.println(sb.length());
//		System.out.println(sb.charAt(9));
//		System.out.println(sb.delete(23, 29));
//		System.out.println(sb.deleteCharAt(17));
//		System.out.println(sb.indexOf("R"));
//		System.out.println(sb.lastIndexOf("w"));
		//and many of
		System.out.println(sb);
	}

}
