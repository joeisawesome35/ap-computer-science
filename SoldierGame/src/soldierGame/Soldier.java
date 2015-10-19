
package soldierGame;

import java.awt.Rectangle;

public class Soldier
{
	private int strenght;
	private int agility;
	private int health;
	private String team;
	private int defense;
	private int xpos;
	private int ypos;
	private int dir;
	private int width;
	private int height;
	private Rectangle r;
	
	Soldier(int str, int ag, int h, String t, int block, int x, int y, int dir,int width, int height)
	{
		this.agility=ag;
		this.defense=block;
		this.dir=dir;
		this.health=h;
		this.height=height;
		this.strenght=str;
		this.team=t;
		this.width=width;
		this.xpos=x;
		this.ypos=y;
		r = new Rectangle();
		r.setRect(x,y,width,height);
	}
	
	
	public void move()
	{
		switch(dir)
		{
		case 0: this.xpos-=this.width; this.r.x=this.xpos; System.out.println("Going left");  break;
		case 1: this.ypos-=this.height; this.r.y=this.ypos; System.out.println("Going up");  break;
		case 2: this.xpos+=this.width; this.r.x=this.xpos; System.out.println("Going right");  break;
		case 3: this.ypos+=this.height; this.r.y=this.ypos; System.out.println("Going down");  break;
		}
	}
	
	
	
	public int getWidth()
	{
		return width;
	}


	public void setWidth(int width)
	{
		this.width = width;
		this.r.width=width;
	}


	public int getHeight()
	{
		return height;
	}


	public void setHeight(int height)
	{
		this.height = height;
		this.r.height=height;
	}


	public int getStrenght()
	{
		return strenght;
	}


	public void setStrenght(int strenght)
	{
		this.strenght = strenght;
	}


	public int getAgility()
	{
		return agility;
	}


	public void setAgility(int agility)
	{
		this.agility = agility;
	}


	public int getHealth()
	{
		return health;
	}


	public void setHealth(int health)
	{
		this.health = health;
	}


	public String getTeam()
	{
		return team;
	}


	public void setTeam(String team)
	{
		this.team = team;
	}


	public int getDefense()
	{
		return defense;
	}


	public void setDefense(int defense)
	{
		this.defense = defense;
	}


	public int getXpos()
	{
		return xpos;
	}


	public void setXpos(int xpos)
	{
		this.xpos = xpos;
		this.r.x=xpos;
	}


	public int getYpos()
	{
		return ypos;
	}


	public void setYpos(int ypos)
	{
		this.ypos = ypos;
		this.r.y=ypos;
	}


	public int getDir()
	{
		return dir;
	}


	public void setDir(int dir)
	{
		this.dir = dir;
	}


	
	public void attack()
	{
		
	}
	public void die()
	{
		
	}
	public void block()
	{
		
	}
	public Rectangle getRect()
	{
		return r.getBounds();
	}
	
}
