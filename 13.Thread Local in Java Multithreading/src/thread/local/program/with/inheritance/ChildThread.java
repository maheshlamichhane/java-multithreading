package thread.local.program.with.inheritance;

public class ChildThread extends Thread {

		public void run() {
			System.out.println("Child Thread Value = "+ParentThread.t1.get());
		}
}
