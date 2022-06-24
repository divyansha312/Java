
public class BufferTrimToSize {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(100);
		sb.append("hello");
		sb.trimToSize();
		System.out.println(sb.capacity());

	}

}
