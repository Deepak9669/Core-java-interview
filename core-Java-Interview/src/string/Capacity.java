package string;


public class Capacity {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Deepak");
		
		
		System.out.println("Length" + "=" + sb.length() );
		System.out.println("Capicity" + "=" + sb.capacity() );
		
		System.out.println("Append" + "=" + sb.append(" Verma"));
		System.out.println("Length" + "=" + sb.length() );
		System.out.println("Capicity" + "=" + sb.capacity() );
		
		System.out.println("Append" + "=" + sb.append(" Serhoree mp"));
		System.out.println("Length" + "=" + sb.length() );
		System.out.println("Capicity" + "=" + sb.capacity() );
		

		
	}

}
