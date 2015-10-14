package minigame;

import java.awt.Rectangle;

public class Bullet{
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	private int xDir;
	private int yDir;
	private Rectangle r;
	public Bullet(int x, int y, int xSpeed, int ySpeed, int xDir, int yDir)
	{
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
		r.setRect(x, y, 6, 2);
	}
	
	public void move()
	{
		this.setX(this.x+1);
		this.setY(this.y+1);
	}
	
	public int getX()
	{
		return this.x;
	}
	public int getY()
	{
		return this.y;
	}
	public void setX(int x)
	{
		this.x=x;
		this.r.x=x;
	}
	public void setY(int y)
	{
		this.y=y;
		this.r.y=y;
	}
	public Rectangle getRect()
	{
		return this.r.getBounds();
	}
	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public int getxDir() {
		return xDir;
	}

	public void setxDir(int xDir) {
		this.xDir = xDir;
	}

	public int getyDir() {
		return yDir;
	}

	public void setyDir(int yDir) {
		this.yDir = yDir;
	}
	
}
