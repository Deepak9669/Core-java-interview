package string;

public class CountVowel {
	public static void main(String[] args) {
		//char vowel []= {'a','e','i','o','u'};
		String val = "ljdaifywiiifkjdsfkjou";
		char ch []=val.toCharArray();
		
		for (char a = 'a'; a < 'z'; a++) {
			int count =0;
			for (int i = 0; i < ch.length; i++) {
				if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
					if(a==ch[i]) {
						count++;
					}
				}
				}
			if(count>0) {
				System.out.println(a+"  "+count);
			}
			}
			
		
	}
}