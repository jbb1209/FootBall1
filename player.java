package FootBall;

public abstract class player {
	protected String Name;
	 OffenceBehavior OffenceBehavior;
	DefenceBehavior DefenceBehavior;
	public player(String aName)
	{
		this.Name = aName;
	}
	public abstract void display();
	public void OffenceBehavior()
	{
		
	}
	public void DefenceBehavior()
	{
		
	}
	public void setOffenceBehavior(OffenceBehavior offenceBehavior) {
		OffenceBehavior = offenceBehavior;
	}
	public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
		DefenceBehavior = defenceBehavior;
	}
	public  String play()
	{
		return "not playing";
	}
	public void turnover()
	{
		
	}
	
}
