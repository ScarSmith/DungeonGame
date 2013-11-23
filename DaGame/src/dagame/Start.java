package dagame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Start implements ActionListener
{
	private JFrame frame = new JFrame("Dungeon Game");
	private Paint paint = new Paint();
	private Timer timer = new Timer(33, this);

	public static void main(String[] args)
	{
		Start start = new Start();
	}

	public Start()
	{
		frame.setSize(1280, 960);
		frame.addKeyListener(paint);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(paint);
		timer.start();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource().equals(timer))
		{
			paint.repaint();
		}
	}

}
