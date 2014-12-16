import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;


public class TestChallenge2 {
	

	public static void main(String[] args) {
   
      Display.openWorld("maps/pasture.map");
      Display.setSize(15, 15);
      Display.setSpeed(5);
      
      Horse jordon = new Horse(6,3);
      
      jordon.graze(36,7);
      jordon.explode();
      
		// TODO Load the "pasture" map at size 15 by 15
		// TODO Create an instance of a Horse inside the pasture
		// TODO Have the horse wander for 36 steps with a timer of 7
		// TODO Have the horse explode()
	}

}
