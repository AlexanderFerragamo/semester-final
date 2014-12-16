import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import org.asl.karelx.Squarebot;


public class TestChallenge1 {
	
     
public static void main(String[] args) {
    
   Display.openWorld("maps/.map");
   Display.setSize(20, 20);
   Display.setSpeed(5);
   
   Squarebot pete = new Squarebot(9,3);
   
   pete.layCorners(5);
   pete.explode();
   
   Sentry alex = new Sentry(4, 4, Display.NORTH, 1);
   
   alex.patrol(alex);

		
		// TODO Create a Squarebot and have it place beepers at the corners of a rectangle
		//   	with bottom right corner at (9, 3) and sized for 5 beepers on each side (see picture)
		// TODO Create a Sentry and have it patrol clockwise around the beepers, indefinitely
	}

}
