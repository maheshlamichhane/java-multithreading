package creating.thread.with.thread_class;

public class MyThread extends Thread
{

	public void run() {
		Thread.currentThread().setName("Child Thread -> ");
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+"Child Thread");
		}
	}

}
