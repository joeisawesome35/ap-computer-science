
package soldierGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class SoldierGameView extends JComponent
{
	Soldier s;
	public SoldierGameView(Soldier s)
	{
		this.s=s;
	}
	public void paintComponent(Graphics g)
	{
		AffineTransform transform = new AffineTransform();
		double angle = 0;
		try{
		angle = Math.atan2((this.getMousePosition().getY()-(s.getYpos()+s.getHeight()/2)),(this.getMousePosition().getX()-(s.getXpos()+s.getWidth()/2)));
		}catch(NullPointerException e){}
		//angle = Math.toRadians(angle);
		transform.rotate(angle, s.getXpos()+s.getWidth()/2, s.getYpos()+s.getHeight()/2);
		Shape rotatedRect = transform.createTransformedShape(s.getRect());
		Graphics2D g2 = (Graphics2D)g;
		//g2.rotate(angle);
		g2.setColor(Color.black);
		File sp = new File("soldier.png");
		BufferedImage soldier = null;
		try
		{
			soldier = ImageIO.read(sp);
		}catch (IOException e){}
		//g2.drawImage(soldier, s.getXpos(), s.getYpos(), s.getWidth()+s.getXpos(), s.getHeight()+s.getYpos(), s.getXpos(), s.getYpos(), s.getWidth()+s.getXpos(), s.getHeight()+s.getYpos(), null);
		//g2.drawImage(soldier, 1, 1, 20, 20, 1, 1, 20, 20, null);
		g2.fill(rotatedRect);
	}
}
