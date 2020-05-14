package FootBall;

public class ReceiverBehavior implements OffenceBehavior {
	
	public String play(){
	int n = (int)(Math.random()*4);
	if( n == 4)
		return "runs a slant route";
	else if (n==3)
		return "runs a Screen pass";
	else if (n==2)
		return "runs a out route";
	else if (n==1)
		return "runs a seem route";
	else
		return "runs a hail mary";
	}
}
