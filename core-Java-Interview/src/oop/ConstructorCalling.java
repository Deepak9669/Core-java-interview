package oop;

public class ConstructorCalling {

	public String fName;
	public String lName;
	public String address;

	public ConstructorCalling() {
		System.out.println("Default Constructor.....");
	}

	public ConstructorCalling(String fName) {

		this();

		this.fName = fName;

		System.out.println(fName);

	}

	public ConstructorCalling(String fName, String lName) {

		this(fName);

		this.lName = lName;

		System.out.println(lName);
	}
	public ConstructorCalling(String fName, String lName , String address) {
		
		this(fName,lName);
		
		this.address = address;
		
		System.out.println(address);

		
	}

}
