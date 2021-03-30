package dodger;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui extends JFrame implements KeyListener {
	
	JLabel plane;

	static JLabel enemyPlane1;
	static JLabel enemyPlane2;
	static JLabel enemyPlane3;
	static JLabel enemyPlane4;
	static JLabel enemyPlane5;
	static JLabel enemyPlane6;
	static JLabel enemyPlane7;
	static JLabel enemyPlane8;
	static JLabel enemyPlane9;
	static JLabel enemyPlane10;
	static JLabel enemyPlane11;

	JLabel menu1;
	JLabel menu2;
	JLabel title;

	static JPanel deathScreen;
	static JLabel deathText;

	static int playerPos = 6;
	
	JLabel timeLabel;
	int timeAlive = 0;
	static boolean alive = true;

	public void setTime() {
		while (alive == true) {
			timeAlive++;
			timeLabel.setText("Score: " + String.valueOf(timeAlive) + " seconds!");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	public Gui() {


		this.setContentPane(new JLabel(new ImageIcon(getClass().getClassLoader().getResource(""))));
		this.setBackground(new Color(0, 188, 255));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addKeyListener(this);
		// ImageIcon icon = new ImageIcon(Gui.class.getResource("icon.png"));
		// this.setIconImage(icon.getImage());
		this.setTitle("Dodger");
		this.setResizable(false);
		this.setSize(800, 800);
		this.setMinimumSize(new Dimension(800, 800));


		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		timeLabel.setBounds(300, 0, 300, 100);
		timeLabel.setForeground(Color.yellow);
		timeLabel.setVisible(false);
		this.add(timeLabel);

		menu1 = new JLabel();
		menu1.setBounds(300, 300, 800, 100);
		menu1.setFont(new Font("Consolas", Font.PLAIN, 20));
		menu1.setText("Use W and S keys to go up and down!");
		menu1.setVisible(true);
		this.add(menu1);

		menu2 = new JLabel();
		menu2.setBounds(290, 400, 800, 100);
		menu2.setFont(new Font("Consolas", Font.PLAIN, 22));
		menu2.setText("Press W or S to start, DON'T CRASH!");
		menu2.setVisible(true);
		this.add(menu2);

		title = new JLabel();
		title.setBounds(20, 100, 800, 150);
		title.setFont(new Font("Impact", Font.PLAIN, 180));
		title.setForeground(Color.yellow);
		title.setText("D O D G E R");
		title.setVisible(true);
		this.add(title);

		deathText = new JLabel();
		deathText.setBounds(150, 230, 800, 200);
		deathText.setFont(new Font("Impact", Font.PLAIN, 90));
		deathText.setForeground(Color.red);
		deathText.setText("You crashed!");
		deathText.setVisible(false);
		this.add(deathText);

		deathScreen = new JPanel();
		deathScreen.setBounds(0, 0, 800, 800);
		deathScreen.setBackground(Color.black);
		deathScreen.setVisible(false);
		this.add(deathScreen);



		JPanel ground = new JPanel();
		ground.setBackground(new Color(0, 147, 0));
		ground.setFocusable(false);
		ground.setBounds(0, 700, 800, 97);
		ground.setVisible(true);
		this.add(ground);

		JPanel ground2 = new JPanel();
		ground2.setBackground(new Color(0, 61, 0));
		ground2.setFocusable(false);
		ground2.setBounds(0, 697, 800, 3);
		ground2.setVisible(true);
		this.add(ground2);

		plane = new JLabel();
		plane.setFocusable(false);
		plane.setBounds(50, 310, 200, 61);
		ImageIcon planeImage = new ImageIcon(Main.class.getResource("plane.png"));
		plane.setIcon(planeImage);
		plane.setVisible(true);
		this.add(plane);


		enemyPlane1 = new JLabel();
		enemyPlane1.setFocusable(false);
		enemyPlane1.setBounds(820, 0, 200, 61);
		ImageIcon enemyPlaneImage = new ImageIcon(Main.class.getResource("enemy plane.png"));
		enemyPlane1.setIcon(enemyPlaneImage);
		enemyPlane1.setVisible(true);
		this.add(enemyPlane1);

		enemyPlane2 = new JLabel();
		enemyPlane2.setFocusable(false);
		enemyPlane2.setBounds(820, 62, 200, 61);
		enemyPlane2.setIcon(enemyPlaneImage);
		enemyPlane2.setVisible(true);
		this.add(enemyPlane2);


		enemyPlane3 = new JLabel();
		enemyPlane3.setFocusable(false);
		enemyPlane3.setBounds(820, 124, 200, 61);
		enemyPlane3.setIcon(enemyPlaneImage);
		enemyPlane3.setVisible(true);
		this.add(enemyPlane3);

		enemyPlane4 = new JLabel();
		enemyPlane4.setFocusable(false);
		enemyPlane4.setBounds(820, 186, 200, 61);
		enemyPlane4.setIcon(enemyPlaneImage);
		enemyPlane4.setVisible(true);
		this.add(enemyPlane4);

		enemyPlane5 = new JLabel();
		enemyPlane5.setFocusable(false);
		enemyPlane5.setBounds(820, 248, 200, 61);
		enemyPlane5.setIcon(enemyPlaneImage);
		enemyPlane5.setVisible(true);
		this.add(enemyPlane5);

		enemyPlane6 = new JLabel();
		enemyPlane6.setFocusable(false);
		enemyPlane6.setBounds(820, 310, 200, 61);
		enemyPlane6.setIcon(enemyPlaneImage);
		enemyPlane6.setVisible(true);
		this.add(enemyPlane6);

		enemyPlane7 = new JLabel();
		enemyPlane7.setFocusable(false);
		enemyPlane7.setBounds(820, 372, 200, 61);
		enemyPlane7.setIcon(enemyPlaneImage);
		enemyPlane7.setVisible(true);
		this.add(enemyPlane7);

		enemyPlane8 = new JLabel();
		enemyPlane8.setFocusable(false);
		enemyPlane8.setBounds(820, 434, 200, 61);
		enemyPlane8.setIcon(enemyPlaneImage);
		enemyPlane8.setVisible(true);
		this.add(enemyPlane8);

		enemyPlane9 = new JLabel();
		enemyPlane9.setFocusable(false);
		enemyPlane9.setBounds(820, 496, 200, 61);
		enemyPlane9.setIcon(enemyPlaneImage);
		enemyPlane9.setVisible(true);
		this.add(enemyPlane9);

		enemyPlane10 = new JLabel();
		enemyPlane10.setFocusable(false);
		enemyPlane10.setBounds(820, 558, 200, 61);
		enemyPlane10.setIcon(enemyPlaneImage);
		enemyPlane10.setVisible(true);
		this.add(enemyPlane10);

		enemyPlane11 = new JLabel();
		enemyPlane11.setFocusable(false);
		enemyPlane11.setBounds(820, 620, 200, 61);
		enemyPlane11.setIcon(enemyPlaneImage);
		enemyPlane11.setVisible(true);
		this.add(enemyPlane11);

		this.pack();
		this.setVisible(true);
		setTime();

	}


	@Override
	public void keyTyped(KeyEvent e) {
		switch (e.getKeyChar()) {
		
		case 'w':
			if (Main.gameRunning == false) {
				timeAlive = -1;
				timeLabel.setVisible(true);
			}
			Main.gameOn();
			menu1.setVisible(false);
			menu2.setVisible(false);
			title.setVisible(false);
			if (plane.getY() > 0) {
				plane.setLocation(50, plane.getY() - 62);
				playerPos--;
			}
			break;
		case 's':
			if (Main.gameRunning == false) {
				timeAlive = -1;
				timeLabel.setVisible(true);
			}
			Main.gameOn();
			menu1.setVisible(false);
			menu2.setVisible(false);
			title.setVisible(false);
			if (plane.getY() < 620) {
				plane.setLocation(50, plane.getY() + 62);
				playerPos++;
			}
			break;
		case 'r':
			deathText.setVisible(false);
			deathScreen.setVisible(false);
			Main.task1.cancel();
			Main.timer1.cancel();
			break;

		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
