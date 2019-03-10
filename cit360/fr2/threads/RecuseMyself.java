package fr2.threads;

import java.util.ArrayList;
import java.util.List;

public class RecuseMyself implements Runnable {
	
	String threadName;
	
	RecuseMyself(String name) {
		threadName = name;
	}

	@Override
	public void run() {
		List<String> lyrics = new ArrayList<String>();
		lyrics.add("I’ve heard the devil speak");
		lyrics.add("Speak through a man");
		lyrics.add("And I found them listening");
		lyrics.add("I've seen the holy take");
		lyrics.add("Take to a fool");
		lyrics.add("And I've seen them following");
		lyrics.add("Long enough to know");
		lyrics.add("I fall");
		lyrics.add("Somewhere outside it all");
		lyrics.add("Let me recuse myself");
		lyrics.add("Lose myself");
		lyrics.add("Excuse myself from your world");
		lyrics.add("I've felt the weight of death");
		lyrics.add("I've held the hand");
		lyrics.add("And I've tread a fading line");
		lyrics.add("I'm not afraid to go");
		lyrics.add("And still I am");
		lyrics.add("I've sung the battle cry");
		lyrics.add("Long enough to know...");
		lyrics.add("I never saw myself inside your shadow");
		lyrics.add("But now I dig to pull myself out of your grave");
		lyrics.add("I don't know where I stand");
		lyrics.add("I just can't meet your demands");
		lyrics.add("Time to find my way out");
		
		for (int i = 0; i < lyrics.size(); i++) {
			try {
				Thread.sleep(3500);
				System.out.println(lyrics.get(i));
			} catch (InterruptedException e) {
				System.out.println(threadName + " has been interrupted.");
				e.printStackTrace();
			}
		}
		System.out.println(threadName + " has completed.");
	}
}
