package exception;;

public class TestAccount {

	public static void main(String[] args)  {

		Account a = new Account();

		a.setBalance(10000);

		a.deposit(5000);

		try {
 
			a.withdrawl(150056);

		} catch (InsufficientBalance e) {
			System.out.println(e);
			System.exit(0);
		}finally {
			System.out.println("final");
		}
		
		
	}
}
