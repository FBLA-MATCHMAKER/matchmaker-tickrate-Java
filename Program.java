import java.util.Timer;

import java.util.TimerTask;

public class Program {

	public static void main(String[] args) {

		Timer timer = new Timer();

		timer.scheduleAtFixedRate(new TimerTask() {

			@Override

			public void run() {

				System.out.println("TEST!");

			}

		},
				
				0, 15000);   // 1000 Millisecond  = 1 second

	}

}
