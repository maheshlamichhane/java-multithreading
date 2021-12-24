package thread.priority.simple.program;
public class Test {

	public static void main(String[] args) {
		
		// main thread priority is always 5
		// child thread priority is always same as parent thread
		// Thread.MAX_PRIORITY = 10;
		// Thread.NORM_PRIORITY = 5;
		// Thread.MIN_PRIORITY = 1;
		// Thread.currentThread().setPriority(7);
		
		
		MyThread t = new MyThread();
		System.out.println("Main Thread Priority ="+Thread.currentThread().getPriority());
		System.out.println("Child Thread Priority ="+t.getPriority());
		System.out.println("After Changing Priority of main thread to 7");
		Thread.currentThread().setPriority(7);
		MyThread t2 = new MyThread();
		// t2.setPriority(4);
		System.out.println("Main Thread Priority ="+Thread.currentThread().getPriority());
		System.out.println("Child Thread Priority ="+t2.getPriority());

	}

}
