package thread.local.program.with.multiple.thread;

public class Test {
	
	
		
		/*
		 	with respect to inheritance behaviour of local thread:
		 	i. thread local verses inheritance 
		 	-> parent threads thread local variable by deafult not available to the child thread.if we want to make
		 	parent threads threadlocal varialbe value available to the child thread then we should go for inheritable
		 	threadlocal class.
		 	-> by default child thread value is exactly same as parent threads value but we can provide customizer
		 	value for child thread by overriding childValue method.
		 	-> constructor InheritableThreadLocal tl = new InheritableThreadLocal();
		 	inheribtalbe threadlocal is a child class of threadlocal and hence all methods present in thread local 
		 	by default available to inheritable thread local.in addition to this method it contains only one method
		 	called childValue.
		 */

	public static void main(String[] args) {
		
		CustomerThread c1 = new CustomerThread("Customer Thread-1");
		CustomerThread c2 = new CustomerThread("Customer Thread-2");
		CustomerThread c3 = new CustomerThread("Customer Thread-3");
		CustomerThread c4 = new CustomerThread("Customer Thread-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
