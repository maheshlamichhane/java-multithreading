package dead.lock.occured.program;

public class Test {
	
	/*
		if two threads are waiting for each other forever such type of infinite
		waiting is called deadlock.
		
		synchronizer keyword is the only reason for deadlock situation hence while using
		synchronizer keyword we have to take special care.
		
		there are no resolution technique for deadlock but several prevention technique
		are available.
		
		in the above program if we remove atleast one syncronized keyword then the program
		won't enter into deadlock hence synchronizer keyword is the only reason for deadlock
		situation.so due to this while using synchronizer keyboards we have to take special 
		care.
		
		long waiting of your thread where watiging never ends is called deadlock.
		long waiting of your thread where waiting ends at certain points is called 
		starvation.for example low priority thread has to wait until completing all high
		priority threads.it may be long waiting but ends at certain points which is nothing
		but starvation.
		
	 */

	public static void main(String[] args) {
		
		MyThread t = new MyThread();
		t.m1();
	}

}
