package FootBall;

public class Receiver extends player {
	public Receiver(String Name)
	{
	super(Name);
	}
	
	public void OffenceBehavior()
	{
		OffenceBehavior= new ReceiverBehavior();
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
