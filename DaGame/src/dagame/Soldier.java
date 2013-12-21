package dagame;

public class Soldier extends Enemy
{

	public Soldier(int x, int y, int width, int height, Paint draw)
	{
		super(x, y, width, height, draw);
	    move = true;
	    speed = 10;
	}
	@Override
	public void move()
	{
		super.move();
		angle = 180 + (int) Math.toDegrees(Math.atan2(getY() - draw.getPlayer().getY(), getX() - draw.getPlayer().getX()));
	}
	
}
