package dagame;

import java.awt.event.KeyEvent;

public class Player extends Character
{
	public Player(int x, int y, int width, int heigth)
	{
		super(x, y,width,heigth);
	}

	private boolean pressingW;
	private boolean pressingA;
	private boolean pressingS;
	private boolean pressingD;

	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyChar() == 's')
		{
			pressingS = true;
			move = true;
		}
		if (e.getKeyChar() == 'd')
		{
			pressingD = true;
			move = true;
		}
		if (e.getKeyChar() == 'a')
		{
			pressingA = true;
			move = true;
		}
		if (e.getKeyChar() == 'w')
		{
			pressingW = true;
			move = true;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyChar() == 's')
		{
			pressingS = false;
		}
		if (e.getKeyChar() == 'd')
		{
			pressingD = false;
		}
		if (e.getKeyChar() == 'a')
		{
			pressingA = false;
		}
		if (e.getKeyChar() == 'w')
		{
			pressingW = false;
		}
		if (!pressingA && !pressingD && !pressingS && !pressingW)
		{
			move = false;
		}
	}
	
	public void move()
	{
		super.move();
		if (pressingW)
			{
			 angle = 270;
			}
			if (pressingA)
			{
				angle = 180;
			}
			if (pressingS)
			{
				angle = 90;
			}
			if (pressingD)
			{
				angle = 0;
			}
			if (pressingA && pressingS)
			{
				angle = 135;
			}
			if (pressingD && pressingS)
			{
				angle = 45;
			}
			if (pressingW && pressingD)
			{
				angle = 315;
			}
			if (pressingA && pressingW)
			{
				angle = 225;
			}
	}
}
