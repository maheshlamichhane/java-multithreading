package reentrant.program.using.trylock.with.parameter;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
	
	static ReentrantLock I = new ReentrantLock();
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
		
		do {
			try {
				if(I.tryLock(5000,TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+" get lock");
					Thread.sleep(30000);
					I.unlock();
					System.out.println(Thread.currentThread().getName()+" releases the lock");
					break;
				}
				else {
					System.out.println(Thread.currentThread().getName()+"... unable to get lock hence performing alternative operations");
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		while(true);
		
		
	}

}
