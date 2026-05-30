package oop.metodoverriding;

public class TestOverride {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.home();
		
		Child c = new Child();
		c.home();
		
		Parent pc = new Child();
		pc.home();
	}
}
