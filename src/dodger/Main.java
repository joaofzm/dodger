package dodger;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	static int xPosEnemy1 = 800;
	static int xPosEnemy2 = 800;
	static int xPosEnemy3 = 800;
	static int xPosEnemy4 = 800;
	static int xPosEnemy5 = 800;
	static int xPosEnemy6 = 800;
	static int xPosEnemy7 = 800;
	static int xPosEnemy8 = 800;
	static int xPosEnemy9 = 800;
	static int xPosEnemy10 = 800;
	static int xPosEnemy11 = 800;

	static boolean gameRunning = false;

	static int random1 = (int) (Math.random() * 10) + 30;
	static int random2 = (int) (Math.random() * 10) + 30;
	static int random3 = (int) (Math.random() * 10) + 30;
	static int random4 = (int) (Math.random() * 10) + 30;
	static int random5 = (int) (Math.random() * 10) + 30;
	static int random6 = (int) (Math.random() * 10) + 30;
	static int random7 = (int) (Math.random() * 10) + 30;
	static int random8 = (int) (Math.random() * 10) + 30;
	static int random9 = (int) (Math.random() * 10) + 30;
	static int random10 = (int) (Math.random() * 10) + 30;
	static int random11 = (int) (Math.random() * 10) + 30;

	static Timer timer1;
	static Timer timer2;
	static Timer timer3;
	static Timer timer4;
	static Timer timer5;
	static Timer timer6;
	static Timer timer7;
	static Timer timer8;
	static Timer timer9;
	static Timer timer10;
	static Timer timer11;

	static TimerTask task1;
	static TimerTask task2;
	static TimerTask task3;
	static TimerTask task4;
	static TimerTask task5;
	static TimerTask task6;
	static TimerTask task7;
	static TimerTask task8;
	static TimerTask task9;
	static TimerTask task10;
	static TimerTask task11;



	public static void spawnPlane1() {
		xPosEnemy1 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer1 = new Timer();
			task1 = new TimerTask() {
				public void run() {
					if (xPosEnemy1 < -150) {
						xPosEnemy1 = 800;
					}
					Gui.enemyPlane1.setBounds(xPosEnemy1, 0, 200, 61);
					if (xPosEnemy1 < 250 && xPosEnemy1 > -150 && Gui.playerPos == 1) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy1 -= random1;

				}
			};
			timer1.schedule(task1, delay);
		}
	}
	
	public static void spawnPlane2() {
		xPosEnemy2 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer2 = new Timer();
			task2 = new TimerTask() {
				public void run() {
					if (xPosEnemy2 < -150) {
						xPosEnemy2 = 800;
					}
					Gui.enemyPlane2.setBounds(xPosEnemy2, 62, 200, 61);
					if (xPosEnemy2 < 250 && xPosEnemy2 > -150 && Gui.playerPos == 2) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy2 -= random2;
				}
			};
			timer2.schedule(task2, delay);
		}
	}

	public static void spawnPlane3() {
		xPosEnemy3 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer3 = new Timer();
			task3 = new TimerTask() {
				public void run() {
					if (xPosEnemy3 < -150) {
						xPosEnemy3 = 800;
					}
					Gui.enemyPlane3.setBounds(xPosEnemy3, 124, 200, 61);
					if (xPosEnemy3 < 250 && xPosEnemy3 > -150  && Gui.playerPos == 3) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy3 -= random3;
				}
			};
			timer3.schedule(task3, delay);
		}
	}

	public static void spawnPlane4() {
		xPosEnemy4 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer4 = new Timer();
			task4 = new TimerTask() {
				public void run() {
					if (xPosEnemy4 < -150) {
						xPosEnemy4 = 800;
					}
					Gui.enemyPlane4.setBounds(xPosEnemy4, 186, 200, 61);
					if (xPosEnemy4 < 250 && xPosEnemy4 > -150  && Gui.playerPos == 4) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy4 -= random4;
				}
			};
			timer4.schedule(task4, delay);
		}
	}

	public static void spawnPlane5() {
		xPosEnemy5 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer5 = new Timer();
			task5 = new TimerTask() {
				public void run() {
					if (xPosEnemy5 < -150) {
						xPosEnemy5 = 800;
					}
					Gui.enemyPlane5.setBounds(xPosEnemy5, 248, 200, 61);
					if (xPosEnemy5 < 250 && xPosEnemy5 > -150  && Gui.playerPos == 5) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy5 -= random5;
				}
			};
			timer5.schedule(task5, delay);
		}
	}

	public static void spawnPlane6() {
		xPosEnemy6 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer6 = new Timer();
			task6 = new TimerTask() {
				public void run() {
					if (xPosEnemy6 < -150) {
						xPosEnemy6 = 800;
					}
					Gui.enemyPlane6.setBounds(xPosEnemy6, 310, 200, 61);
					if (xPosEnemy6 < 250 && xPosEnemy6 > -150 && Gui.playerPos == 6) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy6 -= random6;
				}
			};
			timer6.schedule(task6, delay);
		}
	}

	public static void spawnPlane7() {
		xPosEnemy7 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer7 = new Timer();
			task7 = new TimerTask() {
				public void run() {
					if (xPosEnemy7 < -150) {
						xPosEnemy7 = 800;
					}
					Gui.enemyPlane7.setBounds(xPosEnemy7, 372, 200, 61);
					if (xPosEnemy7 < 250 && xPosEnemy7 > -150  && Gui.playerPos == 7) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy7 -= random7;
				}
			};
			timer7.schedule(task7, delay);
		}
	}

	public static void spawnPlane8() {
		xPosEnemy8 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer8 = new Timer();
			task8 = new TimerTask() {
				public void run() {
					if (xPosEnemy8 < -150) {
						xPosEnemy8 = 800;
					}
					Gui.enemyPlane8.setBounds(xPosEnemy8, 434, 200, 61);
					if (xPosEnemy8 < 250 && xPosEnemy8 > -150  && Gui.playerPos == 8) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy8 -= random8;
				}
			};
			timer8.schedule(task8, delay);
		}
	}

	public static void spawnPlane9() {
		xPosEnemy9 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer9 = new Timer();
			task9 = new TimerTask() {
				public void run() {
					if (xPosEnemy9 < -150) {
						xPosEnemy9 = 800;
					}
					Gui.enemyPlane9.setBounds(xPosEnemy9, 496, 200, 61);
					if (xPosEnemy9 < 250 && xPosEnemy9 > -150  && Gui.playerPos == 9) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy9 -= random9;
				}
			};
			timer9.schedule(task9, delay);
		}
	}

	public static void spawnPlane10() {
		xPosEnemy10 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer10 = new Timer();
			task10 = new TimerTask() {
				public void run() {
					if (xPosEnemy10 < -150) {
						xPosEnemy10 = 800;
					}
					Gui.enemyPlane10.setBounds(xPosEnemy10, 558, 200, 61);
					if (xPosEnemy10 < 250 && xPosEnemy10 > -150  && Gui.playerPos == 10) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy10 -= random10;
				}
			};
			timer10.schedule(task10, delay);
		}
	}

	public static void spawnPlane11() {
		xPosEnemy11 = 800;
		int delay = 0;
		for (int i = 0; i <= 500; i++) {
			delay += 100;
			timer11 = new Timer();
			task11 = new TimerTask() {
				public void run() {
					if (xPosEnemy11 < -150) {
						xPosEnemy11 = 800;
					}
					Gui.enemyPlane11.setBounds(xPosEnemy11, 620, 200, 61);
					if (xPosEnemy11 < 250 && xPosEnemy11 > -150 && Gui.playerPos == 11) {
						Gui.deathScreen.setVisible(true);
						Gui.deathText.setVisible(true);
						Gui.alive = false;
					}
					xPosEnemy11 -= random11;
				}
			};
			timer11.schedule(task11, delay);
		}
	}

	public static void gameOn() {
		if (gameRunning == false) {
			gameRunning = true;
			Timer timer = new Timer();
			TimerTask task = new TimerTask() {
				public void run() {
						spawnPlane1();
				}
			};
			timer.schedule(task, 1000);

			TimerTask task2 = new TimerTask() {
				public void run() {
					spawnPlane2();
				}
			};
			timer.schedule(task2, 2000);

			TimerTask task3 = new TimerTask() {
				public void run() {
					spawnPlane3();
				}
			};
			timer.schedule(task3, 3000);

			TimerTask task4 = new TimerTask() {
				public void run() {
					spawnPlane4();
				}
			};
			timer.schedule(task4, 4000);

			TimerTask task5 = new TimerTask() {
				public void run() {
					spawnPlane5();
				}
			};
			timer.schedule(task5, 5000);

			TimerTask task6 = new TimerTask() {
				public void run() {
					spawnPlane6();
				}
			};
			timer.schedule(task6, 6000);

			TimerTask task7 = new TimerTask() {
				public void run() {
					spawnPlane7();
				}
			};
			timer.schedule(task7, 7000);

			TimerTask task8 = new TimerTask() {
				public void run() {
					spawnPlane8();
				}
			};
			timer.schedule(task8, 2000);

			TimerTask task9 = new TimerTask() {
				public void run() {
					spawnPlane9();
				}
			};
			timer.schedule(task9, 3000);

			TimerTask task10 = new TimerTask() {
				public void run() {
					spawnPlane10();
				}
			};
			timer.schedule(task10, 5000);

			TimerTask task11 = new TimerTask() {
				public void run() {
					spawnPlane11();
				}
			};
			timer.schedule(task11, 8000);
		}

		}




	public static void main(String[] args) {

		new Gui();
	
	}

}
