package dead.lock.occured.program;

public class A {
	
	public synchronized void d1(B b) {
		System.out.println("Thread started execution of d1() method");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread trying to call B's last() method");
		b.last();
	}
	
	public synchronized void  last() {
		System.out.println("Inside A, last() method ");
	}

}
