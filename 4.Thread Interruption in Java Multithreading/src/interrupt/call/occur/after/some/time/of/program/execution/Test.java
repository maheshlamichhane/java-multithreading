package interrupt.call.occur.after.some.time.of.program.execution;

public class Test {
	
	/*
	 * whenever we are calling interrupt method if the target thread not in sleeping
	 * state or waiting state then there is no impact of interrupt call immediately.
	 * interrupt call will be waited until target thread enter into sleeping or waiting 
	 * state.if the target thread enter into sleeping or waiting state,then immediately 
	 * interrupt call will interrupt the target thread.
	 * 
	 * If target thread never enter into sleeping or waiting state in it's lifetime then
	 * there is no impact of interrupt call. this is the only case where interrupt call will
	 * be wasted.
	
	 */

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.start();
		t.interrupt();
		System.out.println("End of program");

	}

}
