// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a SWEN131 assignment.
// You may not distribute it in any other way without permission.

/* Code for SWEN131
 * Name:
 * Usercode:
 * ID:
 */

import java.awt.Color;

import ecs100.*;

public class PatternDrawer{

    public static final double boardLeft = 50;   // Top left corner of the board
    public static final double boardTop = 50;
    public static final double boardSize = 300;  // The size of the board on the window

    /** Draw a square grid board with white squares.
     *  Asks the user for the number of squares on each side
     *
     * CORE
     */
    public void drawGridBoard(){
        UI.clearGraphics();
        int rows = UI.askInt("How many rows:");
        int columns = UI.askInt("How many columns");
        
        double h = (boardSize/columns);
        double w = (boardSize/rows);
        
        /*# YOUR CODE HERE */
        for(int row = 0; row < rows; row++) // ex. rows=50, row variable means 0-49 
        {
        	for(int col = 0; col < columns; col++)
            {
        		UI.drawRect(boardLeft+row*w, boardTop+col*h, w, h);
            	
            }
        }
    }
   
    /** Illusion
     * a pattern that makes dark circles appear in the intersections
     * when you look at it.
     **/
    public void drawIllusion(){
        UI.clearGraphics();
        int rows = UI.askInt("How many rows:");
        int columns= rows;//UI.askInt("How many columns:");
        double h = (boardSize/columns);
        double w = (boardSize/rows);
        
        for (int row=0; row<rows; row++) 
        {
        	for (int col=0; col<columns-row; col++)
        	{ 
        		UI.drawRect(boardLeft+row*w, boardTop+col*h, w, h);
      
        		//row=col-1;  
        	} //ask again cuz it's not correct
       }   
    }
        
        	
        /*# YOUR CODE HERE */


    /** Draw a checkered board with alternating black and white squares
     *    Asks the user for the number of squares on each side
     *
     * COMPLETION
     */
    public void drawCheckersBoard(){
        UI.clearGraphics();
        int rows = UI.askInt("How many rows:");
        /*# YOUR CODE HERE */
        int columns= UI.askInt("How many columns:");
        double h = (boardSize/columns);
        double w = (boardSize/rows);
        
        /*# YOUR CODE HERE */
       
        for(int row = 0; row < rows; row++)
        {
        	for(int col = 0; col < columns; col++)
            { if ((row%2 != 0 && col%2!=0) || (row%2==0 && col%2==0))
            {
        		UI.setColor(Color.BLACK);
        		UI.fillRect(boardLeft+row*w, boardTop+col*h, w, h);} 
        	else {
        		UI.drawRect(boardLeft+row*w, boardTop+col*h, w, h);
            }
       	/*((row%2 != 0 && col%2!=0) || (row%2==0 && col%2==0)*/
        }
        }
        
        
        
        
    }

    /** Draw a board made of concentric circles, 2 pixel apart
     *  Asks the user for the number of squares on each side
     */
//    public void drawConcentricBoard(){
//        UI.clearGraphics();
//        int num = UI.askInt("How many rows:");
//        /*# YOUR CODE HERE */
//
//    }


}

