package creating.thread.with.runnable_interface;

public class MyRunnable implements Runnable
{

	public void run() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+"->"+"Child Thread");
		}
	}

}
