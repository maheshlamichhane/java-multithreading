package reentrantlock.demo.program;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	
	/*
 	The problems with traditional synchronizer keyword:-> 
 	i. we are not having any flexibility to try for the lock without waiting.
 	ii. there is no way to specify maximum waiting time for a thread to get lock so that thread will wait a until
 	getting the lock which may creates performance problems which may cause deadlock.
 	iii.if a thread releases a lock then which waiting thread will get that lock we are not having any control on
 	this.
 	iv. there is no api to listout all waiting threads for a lock
 	v. the synchronizer keyword compulsary we have to use either at method level or within the method level and 
 	it is not possible use across multiple methods.
 	
 	
 	To overcome these problems sun people introducer java.util.concurrent.locks package in 1.5 version.it also
 	provides several enhancements to the programmer to provide more control on concurency.
 	
 	Lock interface:Lock object is simillar to implict lock acquired by a thread to execute synchronizer method 
 	or synchronizer block.lock implementations provide more extensive operations than traditional implict locks.
 	
 	Improtant methods of lock interface : 
 	i. void lock(); we can use this method to acquire a lock if lock is already available then imeediately curent
 	thread will get that lock.if the lock is already not available then it will wait until getting the lock.it
 	is exactly same behaviour of traditional synchronizer keyword.
 	
 	ii. boolean tryLock(); to acquire a lock without waiting. if the lock is available then the theread acquires
 	that lock and returns true.if the lock is not available then this method returns false and can continue it's
 	execution without waiting.in this case thread never be enter into waiting state.
 	
 	iii. boolean tryLock(long time,TimeUnit unit); if lock is available then the thread will get the lock and 
 	continue it's execution.if the lock is not available then the thread will wait until specified amount of time
 	still if the lock is not available then thread can continue it's execution.
 	
 	iv. void interruptbly(); acquires a lock if it is available and returns immediately.if the lock is not available
 	then it will.while waiting if the thread is interrupted then thread won't get the lock.
 	
 	v. void unlock(); to releses the lock.to call onlock mehtod current thread should be owner of that lock otherwise
 	it will throw illegalMonitorState exception.
 	
 	ReentrantLock();it is the implementation class of lock interface and it is the direct child class of object.
 	reentrant means a thread can acquire same lock multiple times without any issue.internally reentrant lock increaments
 	threads personal count whenever we call lock method and decreaments count value whenever thread calls unlock 
 	method and lock will be reseased whenever count reaches zero.
 	ReentrantLock lock = new ReentrantLock(); //default false
 	
 	ReentrantLock lock = new ReentrantLock(boolean fairness);
 	creates reentrantlock with the given fairness policy.if the fairness is true then longest waiting thread
 	can acquire the lock if it available.that is it follows first come first serve policy.if fairness is false
 	then which waiting thread will get the chance we can't expect.
 	
 	Some other methods of Lock Interface:-
 	int getHoldCount(); returns number of holds on this lock by current thread
 	boolean isHeldByCurrentThread(); returns true if and only if lock is hold by current thread
 	int getQueueLength(); returns number of threads of waiting for the lock.
 	Collection getQueuedThreads(); it returns the collection of threads which are waiting to get the lock.
 	boolean hasQueuedThreads(); returns true if any thread waiting to get the lock.
 	boolean isLocked(); returns true if the lock is acquired by some thread.
 	boolean isFair(); returns true if the fairness policy is set with true value.
 	Thread getOwner(); returns thread which acquired the lock.
 	
 	
 	
 */

	public static void main(String[] args) {
		
		ReentrantLock I = new ReentrantLock();
		I.lock();
		I.lock();
		System.out.println(I.isLocked()); //true
		System.out.println(I.isHeldByCurrentThread()); //true
		System.out.println(I.getQueueLength()); //0
		I.unlock();
		System.out.println(I.getHoldCount()); //1
		System.out.println(I.isLocked()); //true
		I.unlock();
		System.out.println(I.isLocked());
		System.out.println(I.isFair());

	}

}
