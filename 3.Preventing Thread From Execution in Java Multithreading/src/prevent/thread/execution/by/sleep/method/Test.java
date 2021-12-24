package prevent.thread.execution.by.sleep.method;

public class Test {
	
	/*
	 The real world example of sleep is slider in ppt file.it can sleep for specified time and after '
	 that automatically moves to next slide.the blinking bulb is also example.if your thread don't want
	 to perform any operation for a particular amount of time then we should go for sleep method.in sleep
	 method we can't sleep forever.so we need to provide arguments to it always.every sleep method throws 
	 interrupted exception,which is checked exception hence whenever we are using sleep method compulsary
	 we should handle interrupted exception either by try catch or by throws keyword otherwise we will get
	 compile time error.
	 
	 If times got expires or slepping thread got interrupted then thread would go to runnable state.if thread 
	 sehedule allocates processor then go to running then dead state.
	 
	 After sleep method call thread will go to sleeping state.in join method thread go to waiting state.
	 we can interrupt a slepping thread and waiting thread using interrupt method.
	 */

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("Slide ->> "+i);
			Thread.sleep(500);
		}

	}

}
