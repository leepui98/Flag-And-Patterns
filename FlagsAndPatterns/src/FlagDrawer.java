// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN131 assignment.
// You may not distribute it in any other way without permission.

/* Code for SWEN131
 * Name:
 * Usercode:
 * ID:
 */



import ecs100.*;
import java.awt.Color;
import javax.swing.JColorChooser;

public class FlagDrawer {


    public static final double width = 30;
    public static final double height = 100;

    /**
     * asks user for a position and three colours, then calls the
     * drawThreeColourFlagCore method, passing the appropriate arguments
     *
     * CORE
     */
    public void testCore(){
        double left = UI.askDouble("left of flag");
        double top = UI.askDouble("top of flag");
        UI.println("Now choose the colours");
        Color stripe1 = JColorChooser.showDialog(null, "First Stripe", Color.white);
      
        Color stripe2 = JColorChooser.showDialog(null, "Second Stripe", Color.white);
        
        Color stripe3 = JColorChooser.showDialog(null, "Third Stripe", Color.white);
  
        this.drawThreeColourFlagCore(left, top, stripe1, stripe2, stripe3 );
        //UI.println("You need to uncomment the line above this in testCore.");
    }

    /**
     * draws a three colour flag consisting of three vertical equal-width stripes
     * at the given position
     *
     * CORE
     */
    public void drawThreeColourFlagCore(double x, double y, Color stripe1, Color stripe2, Color stripe3){
    	
    //UI.fillRect(width, height);
    
    	UI.setColor(stripe1);
    	UI.fillRect(x, y, width, height);
    	UI.setColor(stripe2);
    	UI.fillRect(x+width, y, width, height);
    	UI.setColor(stripe3);
    	UI.fillRect(x+2*width, y, width, height);
    	
    
     	
    
    	
        /*# YOUR CODE HERE */
    	
    
    }

    /**
     * draws multiple flag made up of three equal size stripes by calling the
     * drawThreeColourFlagCompletion method, passing the appropriate arguments
     *
     * COMPLETION
     */
    public void testCompletion(){
//        double left=100;
//        double top=20;
//        //// Uncomment these lines when you start working on the completion:
        this.drawThreeColourFlagCompletion(true, 20, 50, Color.black, Color.yellow, Color.red);               // Belgium
        this.drawThreeColourFlagCompletion(false, 250, 100, Color.black, Color.red, Color.yellow);            // Germany
        this.drawThreeColourFlagCompletion(true, 140, 430, Color.blue, Color.white, Color.red);               // France
        this.drawThreeColourFlagCompletion(false, 470, 30, Color.red, Color.white, Color.blue);               // The Netherlands
        this.drawThreeColourFlagCompletion(false, 50, 250, Color.white, Color.blue, Color.red);               // Russia
        this.drawThreeColourFlagCompletion(true, 290, 270, Color.red, Color.yellow, Color.green.darker());    // Guinea
       // UI.println("You need to uncomment the lines above this in testCompletion.");
    }

    /**
     * draws a three colour flag consisting of three equal-size stripes
     * at the given position
     * The stripes can be either vertical or horizontal
     *
     * COMPLETION
     */
    public void drawThreeColourFlagCompletion(boolean pui, double left, double top, Color col1, Color col2, Color col3){
        /*# YOUR CODE HERE */
    	    	
    	/*double stripeW= 300; horizontal
    	double stripeH= 100;    
    	double stripew=100; vertical
    	double stripeh=300; */
    	
    	if(pui == true) {
         drawThreeColourFlagCore(left, top, col1, col2, col3);
    	}
    	
    	else {
    		UI.setColor(col1);
        	UI.fillRect(left,top, width, height);
        	UI.setColor(col2);
        	UI.fillRect(left, top+ height, width, height);
        	UI.setColor(col3);
        	UI.fillRect(left, top + 2*height, width, height);
    	}
    }


}
