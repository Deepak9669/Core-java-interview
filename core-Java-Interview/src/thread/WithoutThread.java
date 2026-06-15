package thread;

public class WithoutThread {

	String name = null;
	
	public WithoutThread(String name) {
		this.name = name;
	}
	
	public void run() {
		
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(200);
			} catch (Exception e) {
			}
			System.out.println(i + " "+ name);
		}
	}
}
