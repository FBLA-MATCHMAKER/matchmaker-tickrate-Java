import java.util.Timer;

import java.util.TimerTask;

import java.util.Date;

public class Program {

	public static void main(String[] args) {

		boolean loop = true;

		while (loop = true) {

			int interval = 15000;

			Date timeToRun = new Date(System.currentTimeMillis() + interval);

			Timer timer = new Timer();

			timer.schedule(new TimerTask() {

				public void run() {

					System.out.println("Tick!");

				}

			}, timeToRun);

		}

	}

}

