package dagame;

public class Enemy extends Character
{
	
	public Enemy(int x, int y, int width, int height)
	{
		super(x, y, width, height);
	}

	public void move()
	{
		super.move();
	    angle = (int) Math.atan2(getY(), getX());
	    move = true;
	}


}
