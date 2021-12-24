package creating.thread.with.thread_class;

public class Test {

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		OtherThread t2 = new OtherThread();
		t.start();
		t2.start();
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+"Main Thread");
		}

	}

}
