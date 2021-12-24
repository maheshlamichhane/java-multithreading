package reentrantlock.program.using.trylock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
	
	static ReentrantLock I = new ReentrantLock();
	
	public MyThread(String name) {
		super(name);
	}
	
	public void run() {
//		if(I.tryLock(5000,TimeUnit.MILLISECONDS))
		if(I.tryLock()) {
			System.out.println(Thread.currentThread().getName()+"...got lock and performing safe operations");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			I.unlock();
			System.out.println(Thread.currentThread().getName()+" releases the lock");
		}
		else {
			System.out.println(Thread.currentThread().getName()+"... unable to get lock hence performing alternative operations");
			
		}
	}

}
