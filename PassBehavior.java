package FootBall;

public class PassBehavior implements OffenceBehavior {
	
	public String play(){
	int n = (int)(Math.random()*4);
	if( n == 4)
		return "throws a slant route";
	else if (n==3)
		return "throws a Screen pass";
	else if (n==2)
		return "throws a out route";
	else if (n==1)
		return "throws a seem route";
	else
		return "throws a hail mary";
	}
}
