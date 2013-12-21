package dagame;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import javax.swing.JApplet;

public class Character
{
	protected int speed = 20;
	protected int angle;
	private int x;
	private int y;
	private int width;
	private int height;
	protected boolean move;
	protected Paint draw;
AudioClip pushingTheWall = JApplet.newAudioClip(Character.class.getResource("Heart.aiff"));
	public Character(int x, int y, int width, int heigth, Paint draw)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = heigth;
		this.draw = draw;
	}

	public void paintCharacter(Graphics g)
	{
		g.fillRect(x, y, width, height);
		move();
		PlayerIsOutsideTheWindow();
	}

	private void PlayerIsOutsideTheWindow()
	{
		if (getX() > 1260)
		{
			x = 1250;
			pushingTheWall.play();
		}
		if (getY() > 920)
		{
			y = 910;
			pushingTheWall.play();
		}
		if (getX() < 0)
		{
			x = 0;
			pushingTheWall.play();
		}
		if (getY() < 0)
		{
			y = 0;
pushingTheWall.play();
		}
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
