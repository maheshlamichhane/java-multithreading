package thread.priority.real.world.program;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		
		IPrintThread i = new IPrintThread();
		Thread t = new Thread(i,"I-Print-Thread");
		t.setPriority(10);
		t.start();
		
		JPrintThread j = new JPrintThread();
		j.setName("J-Print-Thread");
		j.setPriority(8);
		j.start();
		
		KPrintThread k = new KPrintThread();
		Thread t5 = new Thread(k,"K-Print-Thread");
		t5.setPriority(6);
		t5.start();
		
//		for(int k = 0; k <= 10; k++) {
//			System.out.println("Main-Thread");
//		}
		

	}

}
