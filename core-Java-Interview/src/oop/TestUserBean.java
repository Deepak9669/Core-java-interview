package oop;

public class TestUserBean {

	public static void main(String[] args) {
		
		UserBean bean = new UserBean();
		
		bean.setId(1);
		bean.setName("Ram");
		
		System.out.println(bean.getId());
		System.out.println(bean.getName());
		
		// Constructor call
		UserBean bean1 = new UserBean(10, "Ramu");
		System.out.println(bean1.getId());
		System.out.println(bean1.getName());
	}
}
