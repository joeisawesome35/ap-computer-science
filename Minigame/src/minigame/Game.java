package minigame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Game extends JFrame implements KeyListener{
	Unit one;
	Bullet b;
	GameView panel;
	Scanner in = new Scanner(System.in);
    Timer timer = new Timer(250 , new ActionListener(){
    	public void actionPerformed(ActionEvent e) {
  		  panel.repaint();
  	  }
    });
    
	Game()
	{
		System.out.println("Enter start (0-500): ");
		int strt = in.nextInt();
		one = new Unit(0,strt,2,20,20,10);
		panel = new GameView(one,b);
	}
	
	@Override
	public void keyPressed(KeyEvent e)
	{
		//System.out.println(e.getKeyChar());
		switch(e.getKeyChar())
		{
		case 'w': one.setD(1);one.move(1);break;
		case 'a': one.setD(0);one.move(0);break;
		case 's': one.setD(3);one.move(3);break;
		case 'd': one.setD(2);one.move(2);break;
		case 'e': try{b = new Bullet(one.getX()+one.getW()/2,one.getY()+one.getH()/2, (int)(this.getMousePosition().getX()-(one.getX()+one.getW()/2)), (int)(this.getMousePosition().getY()-(one.getY()+one.getH()/2)), 1, 1);}catch(NullPointerException npe){}System.out.println("Pew"); break;
		}
		panel.repaint();
	}
	
	
	public void start()
	{
		System.out.println("Starting Game...");
		JFrame frame = new JFrame("Game");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		frame.setVisible(true);
		frame.getContentPane().add(panel);
		startTimer();
		
	}
	
	public void startTimer()
	{
        timer.start();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}



