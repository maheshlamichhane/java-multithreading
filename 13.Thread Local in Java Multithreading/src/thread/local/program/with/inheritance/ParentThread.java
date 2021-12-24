package thread.local.program.with.inheritance;

public class ParentThread extends Thread {
	
	public static InheritableThreadLocal t1 = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};
	
	public void run() {
		t1.set("pp");
		System.out.println("Parent Thread value = "+t1.get());
		ChildThread t = new ChildThread();
		t.start();
	}

}
