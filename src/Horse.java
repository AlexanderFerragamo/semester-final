import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;


/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {

   public Horse(int x, int y)
   {
   super(x, y);
   }

	//  TODO Add one or more constructors, as needed
	
	/**
	 * Wander around in random directions until a specified number of steps have been taken.
	 * At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count		the total number of steps to take
	 * @param timer		the interval at which to drop a beeper
	 * 
	 * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
	 */
	public void graze(int count, int timer) {
   int x = 0;
   while (x < count){ 
   wander(timer);
   putBeeper();
   x = x + timer;
   
   }
   }
   
   
}
   
   

   
		
     
