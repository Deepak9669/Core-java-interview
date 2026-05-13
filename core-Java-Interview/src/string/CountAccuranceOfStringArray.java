package string;

public class CountAccuranceOfStringArray {

	public static void main(String[] args) {
		String [] name = {"Shivaaaaannni","Dubee"};
		for (char ch = 'a'; ch < 'z'; ch++) {
			int count = 0;
			for(String n :name)
				for (int i = 0; i < n.length(); i++) {
					if(ch==n.charAt(i)) {
						count++;	
				}
			}
			if(count>0) {
				System.out.println(ch+"="+count);
			}
		}
	}
}