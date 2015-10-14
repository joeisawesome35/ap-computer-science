package minigame;

import java.awt.Rectangle;

public class Unit {
	private int x;
	private int y;
	private int d;
	private int w;
	private int h;
	private int s;
	private Rectangle r;
	Unit(int x, int y, int dir, int width, int height, int speed)
	{
		r = new Rectangle();
		r.setRect(x, y, width, height);
		this.x=x;
		this.y=y;
		this.d=dir;
		this.w=width;
		this.h=height;
		this.s=speed;
	}
	
	public boolean intersects(Rectangle a)
	{
		return r.intersects(a);
	}
	
	public void move(int d)
	{
		switch(d)
		{
		case 0: this.x-=this.w; this.r.x=this.x; System.out.println("left");break;
		case 1: this.y-=this.h; this.r.y=this.y; System.out.println("up");break;
		case 2: this.x+=this.w; this.r.x=this.x; System.out.println("right");break;
		case 3: this.y+=this.h; this.r.y=this.y; System.out.println("down");break;
		}
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
		this.r.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
		this.r.y=y;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
		this.r.width=w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
		this.r.height=h;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public Rectangle getRect(){
		return r.getBounds();
	}
	
}
