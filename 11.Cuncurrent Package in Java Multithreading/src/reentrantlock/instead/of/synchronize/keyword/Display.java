package reentrantlock.instead.of.synchronize.keyword;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	
	ReentrantLock l = new ReentrantLock();
	public void wish(String name) {
		l.lock();
		for(int i = 0; i <5; i++) {
			System.out.print("Good Morning:");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
		}
		l.unlock();
	}
}
