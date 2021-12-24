package creating.thread.with.runnable_interface;

public class Test {

	public static void main(String[] args) {
		
		MyRunnable x1  = new MyRunnable();
		Thread t = new Thread(x1,"Child Thread -> ");
		OtherRunnable r2 = new OtherRunnable();
		Thread t2 = new Thread(r2,"Other Thread -> ");
		t.start();
		t2.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+"Main Thread");
		}

	}

}
