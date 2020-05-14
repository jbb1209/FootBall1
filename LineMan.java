package FootBall;

public class LineMan extends player {
	public LineMan(String Name)
	{
	super(Name);
	}
	
	public void OffenceBehavior()
	{
		OffenceBehavior= new OBlockBehavior();
	}
	public void DefenceBehavior()
	{
		DefenceBehavior = new StripBehavior();
	}
	public void display()
	{
		System.out.print("Name " + Name+" "+OffenceBehavior);
	}
}
