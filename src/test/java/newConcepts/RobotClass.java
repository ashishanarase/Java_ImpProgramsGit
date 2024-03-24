package newConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class RobotClass {
	
	public static void main(String[] args) throws AWTException {
		Robot rajnikant = new Robot ();
		
		 int x = 100;
         int y = 100;
         rajnikant.mouseMove(x, y);
        
         // Simulate a mouse click at the current cursor position
         rajnikant.mousePress(InputEvent.BUTTON1_DOWN_MASK);
         rajnikant.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

}
