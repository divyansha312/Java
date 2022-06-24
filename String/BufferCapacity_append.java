
public class BufferCapacity_append {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("hello");
		System.out.println(sb.capacity());
		
		sb.append("everyone");
		System.out.println(sb.capacity());
		
		sb.append("hello");
		System.out.println(sb.capacity());  //  (old capacity+1)*2
		System.out.println(sb);
		

	}

}
