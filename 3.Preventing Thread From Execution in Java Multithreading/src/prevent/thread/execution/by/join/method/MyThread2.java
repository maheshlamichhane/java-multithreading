package prevent.thread.execution.by.join.method;

public class MyThread2 extends Thread {
	
	public static Thread mt;

	public void run() {
		for( int i = 0; i < 10; i++) {
			try {
				mt.join(); //we can also put 8000 arguments here
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName()+" -> "+i);
		}
	}

}
