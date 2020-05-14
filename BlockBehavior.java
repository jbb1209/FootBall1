package FootBall;

public class BlockBehavior {
	public String play() {
	int n = (int)(Math.random()*3);
	if( n == 3)
		return "Block a kick";
	else if (n==2)
		return "block a punt";
	else if (n==1)
		return "block a pass";
	else
		return "block a catch";
	}
}
