package fr2.threads;

public class ExecuteThreads {
	
	public static void main(String args[]) {
		Thread.currentThread().setName("main");
		System.out.println("Starting " + Thread.currentThread().getName() + " thread.");
		
		// Construct objects.
		Audio instrumentalThread = new Audio();
		Audio vocalThread = new Audio();
		Timer timerThread = new Timer();
		
		// Pass audio path into object's setSong() method parameters.
		instrumentalThread.setSong("http://music.faintdev.net/paulgift.wav");
		vocalThread.setSong("http://music.faintdev.net/undermyfeet.wav");
		
		// Pass millisecond argument into setTime() method parameters.
		timerThread.setTime(20000);
		
		// Name threads.
		instrumentalThread.setName("instrumental");
		vocalThread.setName("vocal");
		timerThread.setName("timer");
		
		// Start timer thread.
		timerThread.start();
		// Start instrumental thread.
		instrumentalThread.start();
		
		// Wait to start vocal thread.
		try {
			Thread.sleep(20000);
			System.err.println("\nCue vocals!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Start vocal thread.
		vocalThread.start();
	}
}
