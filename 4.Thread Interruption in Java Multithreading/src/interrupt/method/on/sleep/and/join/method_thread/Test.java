package interrupt.method.on.sleep.and.join.method_thread;

public class Test {
	
	/*
	  After sleep method call thread will go to sleeping state.in join method thread go to waiting state.
	 we can interrupt a slepping thread and waiting thread using interrupt method.
	 A thread can interrup a sleepiing thread or waiting thread by using interrupt method of thread 
	 class.
	 */

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of program");

	}

}
