package FootBall;

public class RunBehavior implements OffenceBehavior{
	public String play()
	{
		int n = (int)(Math.random()*3);
		if( n == 3)
			return "runs a Drive";
		else if (n==2)
			return "runs a pitch";
		else if (n==1)
			return "runs a reverse";
		else
			return "runs a draw";
	}
}
