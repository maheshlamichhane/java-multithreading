package thread.synchronization.demo.program.with.synchronize.method;

public class Test {
	
	/*
	 	Synchronizer is the modifier applicable only for methods and blocks,but not for
	 	classes and variables.
	 	
	 	if multiple threads are trying to operate simultaneously on the same java object
	 	then there may be a chance of data inconsistency problem.to overcome this problem
	 	we should go for synchronizer keyword.
	 	
	 	if  method or block declared as a synchronizer then at a time only one thread is 
	 	allowed to exectue that method or block and the given object so that data inconsistency
	 	problem will be resolved.
	 	
	 	the main advantage of synchronizer keyword is we can resolve data inconsistency
	 	problems but the main dis-advantage of synchronizer keyword is it increases 
	 	waiting time of thread and creates performance problems.hence if there is no 
	 	specific requirement then it is not recomended to use synchronizer keyword.
	 	
	 	Internally synchronization concept is implemented by using lock.every object in
	 	java has a unique lock.whenever we are using synchronizer keyword then only lock
	 	concept will come into the picture.
	 	
	 	if a thread wants to execute synchronizer method on the given object first it has
	 	to get lock of that object.once theread got the lock it is allowed to execute any 
	 	synchronizer method on that object.once method execution completes automatically thread
	 	releases the lock.acquring and the releasing lock internally takes care by JVM and 
	 	programmer not reponsible for this activity.
	 	
	 	while a thead executing synchronizer method on the given object the remaining threads are
	 	not allowed to execute any synchronizer method simultaneously on the same object.but 
	 	remaining thread are allowed to execute non-synchronizer methods simultaneously.
	 	
	 	lock concept is implemented based on object but not based on methods.
	 	
	 	java objects contains two area called synchronize and non synchronize area.
	 	non synchronize area can be access by any numbers of thread simultaneously. synchronize 
	 	area can be access by only one thread at a time. synchronize area contains the operations
	 	such as remove,update,delete(state of object change)  while non-synchronize contains
	 	the operation lide read(state object won't be change).
	 	
	 	if multiple threads are accessing same method at a time then if first thread
	 	made any changes and then go to the sleep state. then other thread which calls that
	 	method will use that change so error can occured.
	 	
	 	if we are not declaring wish method as synchronizer then both threads will be
	 	executed simultaneously and hence we will get irregular output.if we declare wish
	 	method as synchronizer then at a time only one thread is allowd to execute wish 
	 	method on given display object hence we will get regular output.
	 	
	 	case study: Even though wish method is synchronizer we will get irregular output
	 	because threads are operating on different java objects.if multiple threads are 
	 	operating on same java objects then synchronization is required.if multiple threads are operating
	 	 on multiple java objects then synchronization is not required.
	 	 
	 	 class level lock: every class in java has a unique lock which is nothing but
	 	 class level lock.if a thread wants to execute static synchronizer method then 
	 	 thread required class level lock.once thread got class level lock then it is
	 	 allowed to execute any static synchronizer method of that class.once method 
	 	 execution completes automatically thread releases the lock.if two thread with
	 	 different java object call same method with static method then only one thread
	 	 will run that method at a time.
	 	 
	 	 while a thread executing static synchroizer method the remaining thread are 
	 	 not allowed to execute any static synchronizer method of that class simultaneously
	 	 but remaining threads are allowed to execute the following method simultaneously.
	 	 i.normal static methods
	 	 ii.synchronize instance method
	 	 iii.normal instance method. 
	 */
  
	public static void main(String[] args) {
		
		Display d = new Display();
		MyThread t = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Yuvaraj");
		t2.start();
		t.start(); 

	}

}
