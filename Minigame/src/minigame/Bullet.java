package minigame;

import java.awt.Rectangle;

public class Bullet{
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	private int xDir;
	private int yDir;
	private int height;
	private int width;
	private Rectangle r;
	public Bullet(int x, int y, int xSpeed, int ySpeed, int xDir, int yDir)
	{
		this.x=x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
		height = 2;
		width = 6;
		r = new Rectangle();
		r.setRect(x, y, width, height);
	}
	
	public void move(double direction)
	{
		
		double speed = Math.sqrt(xSpeed*xSpeed + ySpeed*ySpeed);
	    speed = Math.min(speed, 5.0);
	    int x_inc = (int)(speed * Math.cos(direction));
	    int y_inc = (int)(speed * Math.sin(direction));
	    this.setX(this.x+x_inc);
		this.setY(this.y+y_inc);
	}
	public int getW()
	{
		return this.width;
	}
	public int getH()
	{
		return this.height;
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
