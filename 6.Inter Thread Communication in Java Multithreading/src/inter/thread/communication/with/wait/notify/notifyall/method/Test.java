package inter.thread.communication.with.wait.notify.notifyall.method;

public class Test {
	
	/*
	 	two threads can communicate with each other by using wait,notify,notifyall method.
	 	the thread which is expecting updation is responsible to called wait method then
	 	immediately the thread will inter into waiting state.
	 	
	 	the thread which is responsible to perform updation,after performing updation it
	 	is responsible to call notify method.then waiting will get that notification and
	 	continue it's execution with those updated items.
	 	
	 	wait,notify,notifyall methods present in object class but not in thread class
	 	because thred can call these methods on any java object. 
	 	
	 	to call wait,notify or notifyall methods on any object,thread should be owner of that
	 	object that is the thread should has lock of that object.that is the thread should
	 	be inside synchronized area.hence we can wait,notify or notifyall methods only
	 	from synchronized area otherwise we will get runtime exception saying IllegalMoni
	 	torStateExeception.
	 	
	 	when thread goes to the waiting state by calling wait method.when notify method 
	 	is called it does not releases the lock immediately so it goes to another waiting 
	 	state then goes to runnable state after getting the lock. 
	 	if a threads calls wait method on any object.it immediately releases the lock of
	 	that particular object and enter into waiting state.
	 	
	 	if a thread calls notify method on any objects it releases the lock of that object
	 	but may not immediately. except wait,notify and notifyall there no other method 
	 	where thread releases the lock.
	 	
	 	public final void wait(); throws IE
	 	public final native void wait(long ms); thorws IE
	 	public final void wait(long ml,int ns); throws IE
	 	
	 	public final native void notify();
	 	public final native void notifyAll();
	 	
	 	every wait method throws interrupted exception which is checked exception hence
	 	whenever we are using wait method compulsary we should handle this interrupted 
	 	exception either by try catch or by throws keyword otherwise we will get compile
	 	time error.
	 	
	 	Producer Consumer Problem: Producer thread is responsible to produce items to
	 	the queue,on the consumer thread is responsible to consumes items from the queue.
	 	if query is empty consumer thread will call wait method and enter into waiting 
	 	state.after producing items to the queue producer thread is responsible to call
	 	notify method.then waiting consumer will get that notification and continue it's
	 	execution with updated items.
	 	
	 	we can use notify method to give the notification for only one waiting thread.
	 	if multiple threads are waiting then only one thread will be notify and the 
	 	remaining threads have to wait for furthur notification.which thread will be
	 	notifying we can't expect it depends on JVM.
	 	
	 	we can use notifyall to give the notification for all waiting threads of a 
	 	particular object even though multiple thread notified but execution will be 
	 	performed one by one because threads required lock and only one lock is available.
	 	
	 	
	 	
	 	
	 */

	public static void main(String[] args) throws InterruptedException {
		
		ThreadB b = new ThreadB();
		b.start();
		synchronized(b) {
			System.out.println("Main Method Trying To Call wait() Method");
			b.wait();
			System.out.println("Main Thread Got Notification");
			System.out.println(b.total);
		}

	}

}
