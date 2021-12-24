package prevent.thread.execution.by.yield.method;

public class Test {
	
	/**
	   yield method causes to pause current executing thread to give the chance for waiting thread
	   of same priority in waiting queue.if there is no waiting thread or  all waiting thread have low priority then same 
	   thread can continue it's execution. 
	   If multiiple thread are waiting with same priority then which waiting thread will get the chance 
	   we can't expect.it depends on thread scheduler.
	   
	   the thread which yeilded,then it will go to the waiting state,
	   then it will get the chance once again it depends on thread scheduler.
	   and we can't expect exactly.
	   
	   if there is no thread with same priority,and there is a thread without lower priority then
	   same thread will continue to execute.
	   
	   This method is useful in real life when we have one thread which takes large amount of time.
	   at the same time in wating queue threre is a thread having same priority which takes very less 
	   amount of time. so it is helpful in running thread which takes small time and finish its execution.
	   
	   after yield method call it will come back to runnable state.
	 */

	public static void main(String[] args) {
		
		IPrintThread t1 = new IPrintThread();
		t1.setName("Thread-I-Print");
		t1.start();
		

		Thread.currentThread().setName("Main-Thread");
		for(int l = 0; l <=5; l++) {
			System.out.println("Main Thread");
		}
	}

}
