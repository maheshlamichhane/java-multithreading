package interrupt.method.on.sleep.and.join.method_thread;

public class MyThread  extends Thread{
		public void run() {
			
				try {
					for(int i=0; i<=10;i++) {
						System.out.println("Iam Lazy Thread"+i);
					Thread.sleep(2000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("I got Interrupted");
				}
		}
	

}
