// 5814
// CIT044 Assignment 15 Exercise 3
/* Uses the Smiley Face classes to display various smiley faces
   of varying size, position, and color.
*/

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

/** Uses the Smiley Face classes to display various smiley faces
    of varying size, position, and color.
*/
public class SmileyDisplayer
{
	/** Uses the Smiley Face classes to display various smiley faces
	    of varying size, position, and color.
	*/
	public static void main(String[] args)
	{
		final int FRAME_WIDTH = 1000;
		final int FRAME_HEIGHT = 1000;

		SmileyFace[] smileyFaces =
		{
			new SmileyFace(50),
			new SmileyFace(100, Color.BLUE, Color.RED, 800, 300),
			new SmileyFace(70)
		};

		SmileyFace2D[] smileyFaces2D =
		{
			new SmileyFace2D(60),
			new SmileyFace2D(150, Color.BLUE, Color.GREEN, 700, 350),
			new SmileyFace2D(40)
		};

		smileyFaces[0].setPosition(100, 100);
		smileyFaces[2].setColors(Color.MAGENTA, Color.PINK);
		smileyFaces[2].setPosition(400, 400);

		smileyFaces2D[0].setPosition(100, 30);
		smileyFaces2D[2].setColors(Color.BLUE, Color.YELLOW);
		smileyFaces2D[2].setPosition(200, 800);

		for(int x = 0; x < smileyFaces.length; x++)
		{
			smileyFaces[x].setSize(FRAME_WIDTH, FRAME_HEIGHT);
			smileyFaces[x].setVisible(true);
			smileyFaces2D[x].setSize(FRAME_WIDTH, FRAME_HEIGHT);
			smileyFaces2D[x].setVisible(true);
		}
	}
}