package thread.pool.example.with.runnable_interface;

public class PrintJob implements Runnable {
	String name;
	public PrintJob(String name){
		this.name=name;
	}

	@Override
	public void run() {
		System.out.println(name+"...Job started by thread:"+Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(name+"...Job completed by thread"+Thread.currentThread().getName());
		
	}

}
