package thread.local.program.with.multiple.thread;

public class CustomerThread extends Thread {
	static Integer custId = 0;
	private static ThreadLocal t1 = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	
	public CustomerThread(String name) {
		super(name);
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName()+" executing with customer id:"+t1.get());
	}

}
