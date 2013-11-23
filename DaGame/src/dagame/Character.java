package dagame;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Character
{
	private int speed = 8;
	protected int angle;
	private int x;
	private int y;
	private int width;
	private int height;
	protected boolean move;

	public Character(int x, int y, int width, int heigth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = heigth;

	}

	public void paintCharacter(Graphics g)
	{
		g.fillRect(x, y, width, height);
		move();

	}

	public void move()
	{
		if (move)
		{
			x += speed * Math.cos(Math.toRadians(angle));
			y += speed * Math.sin(Math.toRadians(angle));
		}
	}
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
}
