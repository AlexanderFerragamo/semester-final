import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

   public Sentry(int x, int y, int dir, int beeps)
   {
   super(x, y, dir, beeps);
   }

      public static void patrol(Sentry arg){
         
         while (1 == 1){      
            while (!arg.nextToABeeper()){
               arg.move();
            }
            while (arg.nextToABeeper()){
               arg.turnRight();
               arg.move();
            }
       }
	// Provide one or more constructors, as you wish
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
		// TODO You implement this method.
	}
}
