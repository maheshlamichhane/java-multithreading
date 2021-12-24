package reentrant.program.using.trylock.with.parameter;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread("First Thread");
		MyThread t2 = new MyThread("Second Thread");
		t1.start();
		t2.start();

	}

}
