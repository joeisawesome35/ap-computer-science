
package soldierGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class SoldierGameComp implements KeyListener
{
	Soldier[] t1;
	Soldier[] t2;
	JFrame frame;
	SoldierGameView view;
	public SoldierGameComp()
	{
		int w = 10;
		t1 = new Soldier[5];
		t2 = new Soldier[5];
		t1[0]=new Soldier(5, 5, 5, "1", 5, 0, 0, 2, w, w);
		frame = new JFrame("Soldier Game");
		view = new SoldierGameView(t1[0]);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		frame.add(view);
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent e)
	{
		System.out.println(e.getKeyChar());
		switch(e.getKeyChar())
		{
		case 'w': t1[0].setDir(1); t1[0].move(); break;
		case 'a': t1[0].setDir(0); t1[0].move(); break;
		case 's': t1[0].setDir(3); t1[0].move(); break;
		case 'd': t1[0].setDir(2); t1[0].move(); break;
		}
		view.repaint();
		
	}
	@Override public void keyReleased(KeyEvent arg0){}
	@Override public void keyTyped(KeyEvent arg0){}
	
}
