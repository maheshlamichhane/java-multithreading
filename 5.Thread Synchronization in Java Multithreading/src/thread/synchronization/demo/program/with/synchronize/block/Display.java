package thread.synchronization.demo.program.with.synchronize.block;

public class Display {
	
	public void   wish(String name) {
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; // one lakh line of code
		
		synchronized(this) {
			for(int i = 0; i < 10; i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					
				}
				System.out.println(name);
			}
		}
		
		;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; // one lakh line of code
	}

}
