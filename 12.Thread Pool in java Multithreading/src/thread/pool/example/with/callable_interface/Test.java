package thread.pool.example.with.callable_interface;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
	/*
	 	callable and future:-
	 	-> in the case of runnable job thread won't return anything after completing the job.if a thread is required
	 	to return some result after execution then we should go for callable.
	 	-> callable interface contain only one method call.
	 	public Object call() throws Exception{}
	 	-> if we submit callleable object to executer then after completing the job thread return an object of the
	 	type Future.
	 	-> Future object can be used to reterive the result from callable jobs.
	 	
	 	if a thread is not required to return anything after completing the job then we should go for runnable.
	 	if a thread required to return something after completing the job then we should go for callable.
	 	runnable interface contains only one method run.callable interface contains only one method call.
	 	runnable job not required to return anything and hence return type of run method is void.callable job is
	 	required to return something and hence return type of call method is objecct.within the run method if there 
	 	is any chance of rising check exception compulsary we should handle by using try catch beacause beacause we
	 	can't use throws keywords for run method.inside call method if there is any chance of rising checked exception
	 	we are not required to handle by using try catch because call method already throws exception.runnable interface
	 	present in java.lang package while callable interface present in java.util.concurrent package introduced in 1.0
	 	version and introduced in 1.5 version.
	 	
	 */

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		MyCallable[] call = {
				new MyCallable(10),
				new MyCallable(20),
				new MyCallable(30),
				new MyCallable(40),
				new MyCallable(50),
				new MyCallable(60),
		};
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		for(MyCallable c : call) {
			Future f = service.submit(c);
			System.out.println(f.get());
		}
		service.shutdown();

	}

}
