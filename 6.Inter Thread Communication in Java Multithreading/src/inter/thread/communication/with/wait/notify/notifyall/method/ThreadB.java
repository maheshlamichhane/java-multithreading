package inter.thread.communication.with.wait.notify.notifyall.method;

public class ThreadB extends Thread {
	
	int total = 0;
	
	public void run() {
		synchronized(this) {
			System.out.println("Child Thread Starts Execution");
			for(int i = 1; i<=100;i++) {
				total = total + i;
			}
			System.out.println("Child Thread Trying To Give Notifications");
			this.notify();
		}
	}

}
