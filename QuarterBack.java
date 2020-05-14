package FootBall;

public class QuarterBack extends player {
	public QuarterBack(String Name)
	{
	super(Name);
	}
	
	public void OffenceBehavior()
	{
		OffenceBehavior= new RunBehavior();
		OffenceBehavior= new PassBehavior();
	}
	public void DefenceBehavior()
	{
		DefenceBehavior = null;
	}
	public void display()
	{
		System.out.print("Name " + Name+" "+OffenceBehavior);
	}
}

