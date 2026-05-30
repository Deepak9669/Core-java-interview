package oop.Interface;

public class TestBusinessman {

	public static void main(String[] args) {
		
		Businessman b = new Businessman();
		
		b.earnMoney();
		b.donation();
		b.party();
		b.abc();
		b.helpToOthers();
		
		Richman r = new Businessman();
		
		r.earnMoney();
		r.donation();
		r.party();
	
		
		SocialWorker s = new Businessman();
		
		s.helpToOthers();
		
	}
}
