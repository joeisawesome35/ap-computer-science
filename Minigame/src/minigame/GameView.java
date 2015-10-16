package minigame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.List;

import javax.swing.JComponent;

public class GameView extends JComponent
{
	Unit one;
	List<Bullet> b;
	double bangle;
	GameView(Unit one, List<Bullet> b)
	{
		this.one=one;
		this.b=b;
	}
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		double angle = 0;
		bangle = 0;
		if(!b.isEmpty())
		{
			try{
			bangle = Math.atan2(b.get(b.size()-1).getySpeed(), b.get(b.size()-1).getxSpeed());
			AffineTransform transbul = new AffineTransform();
			transbul.rotate(bangle, b.get(b.size()-1).getX()+ b.get(b.size()-1).getW()/2, b.get(b.size()-1).getY()+b.get(b.size()-1).getH()/2);
			Shape bt = transbul.createTransformedShape(b.get(b.size()-1).getRect());
			g2.fill(bt);
			b.get(b.size()-1).move(bangle);
			}catch(NullPointerException npess){}
		}
		try{
			angle = Math.atan2((this.getMousePosition().getY()-(one.getY()+one.getH()/2)),(this.getMousePosition().getX()-(one.getX()+one.getW()/2)));
			
		}catch(NullPointerException e){}
		AffineTransform transform = new AffineTransform();
		transform.rotate(angle, one.getX() + one.getW()/2, one.getY() + one.getH()/2);
		Shape t = transform.createTransformedShape(one.getRect());
		
		g2.setColor(Color.BLACK);
		g2.fill(t);
		
		
	}
	
}
