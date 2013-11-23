package dagame;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.xml.stream.events.Characters;

public class Paint extends Canvas implements KeyListener
{

	ArrayList<Character> characters = new ArrayList<Character>();
	Player jarvis = new Player(100, 100, 50, 50);
	Enemy thomas = new Enemy(400, 500, 40, 40);

	public Paint()
	{
		characters.add(jarvis);
		characters.add(thomas);
	}

	public void paint(Graphics g)
	{
		for (int i = 0; i < characters.size(); i++)
		{
			characters.get(i).paintCharacter(g);
		}
	}

	@Override
	public void keyTyped(KeyEvent e)
	{

	}

	@Override
	public void keyPressed(KeyEvent e)
	{
			((Player) characters.get(0)).keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e)
	{

			((Player)characters.get(0)).keyReleased(e);
	}
	public int getPlayerX()
	{
		
	}
	public int getPlayerY()
	{
		
	}
	
}
