package thread.priority.real.world.program;

public class KPrintThread implements Runnable {

	@Override
	public void run() {
		
		for(int k = 0; k <= 10; k++) {
			System.out.println(Thread.currentThread().getName()+" -> "+k);
		}

	}

}
