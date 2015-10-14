package minigame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

import javax.swing.JComponent;

public class GameView extends JComponent
{
	Unit one;
	Bullet b;
	GameView(Unit one, Bullet b)
	{
		this.one=one;
		this.b=b;
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		double angle = 0;
		double bangle = 0;
		try{
			angle = Math.atan2((this.getMousePosition().getY()-(one.getY()+one.getH()/2)),(this.getMousePosition().getX()-(one.getX()+one.getW()/2)));
			bangle = Math.atan2(b.getySpeed(), b.getxSpeed());
		}catch(NullPointerException e){}
		AffineTransform transform = new AffineTransform();
		transform.rotate(angle, one.getX() + one.getW()/2, one.getY() + one.getH()/2);
		Shape t = transform.createTransformedShape(one.getRect());
		
		g2.setColor(Color.BLACK);
		g2.fill(t);
		
		if(b!=null)
		{
			transform.rotate(bangle, b.getX()+ b.getRect().getWidth()/2, b.getY()+b.getRect().getHeight()/2);
			Shape bt = transform.createTransformedShape(b.getRect());
			g2.fill(bt);
			b.move();
		}
	}
	
}
