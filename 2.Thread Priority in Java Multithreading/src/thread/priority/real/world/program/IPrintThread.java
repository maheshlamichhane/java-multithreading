package thread.priority.real.world.program;

public class IPrintThread implements Runnable {

	@Override
	public void run() {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName()+" -> "+i);
		}

	}

}
