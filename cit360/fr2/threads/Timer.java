package fr2.threads;

public class Timer extends Thread {

	private int time;
	private static int seconds;
	
	@Override
	public void run() {
    	System.out.println("Starting " + currentThread().getName() + " thread.");
    	countSeconds();
	}
	
	public void setTime(int milliseconds) {
		time = milliseconds;
	}
	
	public void countSeconds() {
		try {
			for (int i = 0; i <= time; i++) {
				Thread.sleep(1000);
				setSeconds(i);
				System.out.print("\r" + i + " seconds in.");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static int getSeconds() {
		return seconds;
	}

	public static void setSeconds(int seconds) {
		Timer.seconds = seconds;
	}
}
