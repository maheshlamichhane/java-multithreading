package reentrantlock.instead.of.synchronize.keyword;

public class Test {
	
	public static void main(String[] args) {
		
		Display d = new Display();
		MyThread t1 = new MyThread(d,"Dhoni");
		MyThread t2 = new MyThread(d,"Yuvaraj");
		MyThread t3 = new MyThread(d,"Kohli");
		t1.start(); 
		t2.start();
		t3.start();
		

	}

}
