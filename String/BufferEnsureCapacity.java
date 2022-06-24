
public class BufferEnsureCapacity {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("divya");
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(30);
		System.out.println(sb.capacity());
		
		sb.append("sgkjghkjbjghfhjvjkhgghjghjgbkj");
		System.out.println(sb.capacity());
		
	}

}
