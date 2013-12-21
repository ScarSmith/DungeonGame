package dagame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.xml.stream.events.Characters;

public class Paint extends Canvas implements KeyListener
{
	private int playerX = 100;
	private int playerY = 100;
	Random random = new Random();
	ArrayList<Character> characters = new ArrayList<Character>();

	public Paint()
	{
		characters.add(new Player(playerX, playerY, 30, 30, this));
		for (int i = 0; i < 20; i++)
		{
			characters.add(new Soldier(random.nextInt(1280), random.nextInt(960), 53, 53, this));
		}
	}

	public void paint(Graphics g)
	{
		for (int i = 0; i < characters.size(); i++)
		{
			g.setColor(Color.RED);
//			
			characters.get(i).paintCharacter(g);
		}
		g.setColor(Color.BLUE);
		characters.get(0).paintCharacter(g);

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
	public Player getPlayer()
	{
		return ((Player) characters.get(0));
	}
}
