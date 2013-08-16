// 5814
// CIT044 Assignment 15 Exercise 2
/* Creates a smiley face using Graphics2D methods.
*/

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.Graphics;
import java.awt.Graphics2D;

/** Creates smiley faces of various sizes, positions, and colors
    using Graphics2D methods.
*/
public class SmileyFace2D extends JFrame
{
	private int eye1X;
	private int eye1Y;
	private int eye2X;
	private int eye2Y;
	private int mouthX;
	private int mouthY;
	private int diameter;
	public int facePosX;
	public int facePosY;
	private Color faceColor;
	private Color eyesAndMouthColor;
	private int mouthWidth;
	private final int EYE_WIDTH = 10;
	private final int MOUTH_ARC_BEGIN = 180;
	private final int MOUTH_ARC_LENGTH = 180;

	public SmileyFace2D(int diam)
	{
		facePosX = 0;
		facePosY = 0;
		diameter = diam;
		faceColor = Color.YELLOW;
		eyesAndMouthColor = Color.BLACK;
		eye1X = (diam / 4) + facePosX;
		eye1Y = (diam / 5) + facePosY;
		eye2X = (2 * diam / 3) + facePosX;
		eye2Y = (diam / 5) + facePosY;
		mouthX = (diam / 4) - 7 + facePosX;
		mouthY = (diam / 5) + facePosY;
		mouthWidth = 5 * diam / 7;
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public SmileyFace2D(int diam, Color faceCol, Color eyesAndMouthCol,
		int posX, int posY)
	{
		facePosX = posX;
		facePosY = posY;
		diameter = diam;
		faceColor = faceCol;
		eyesAndMouthColor = eyesAndMouthCol;
		eye1X = (diam / 4) + facePosX;
		eye1Y = (diam / 5) + facePosY;
		eye2X = (2 * diam / 3) + facePosX;
		eye2Y = (diam / 5) + facePosY;
		mouthX = (diam / 4) - 7 + facePosX;
		mouthY = (diam / 5) + facePosY;
		mouthWidth = 5 * diam / 7;
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void setColors(Color faceCol, Color eyesAndMouthCol)
	{
		faceColor = faceCol;
		eyesAndMouthColor = eyesAndMouthCol;
	}

	public void setPosition(int posX, int posY)
	{
		facePosX = posX;
		facePosY = posY;
		eye1X = (diameter / 4) + facePosX;
		eye1Y = (diameter / 5) + facePosY;
		eye2X = (2 * diameter / 3) + facePosX;
		eye2Y = (diameter / 5) + facePosY;
		mouthX = (diameter / 4) - 7 + facePosX;
		mouthY = (diameter / 5) + facePosY;
		mouthWidth = 5 * diameter / 7;
	}

	public void paint(Graphics face)
	{
		super.paint(face);
		Graphics2D face2D = (Graphics2D)face;
		face2D.setColor(faceColor);
		face2D.fill(new Ellipse2D.Float(facePosX, facePosY, diameter, diameter));
		face2D.setColor(eyesAndMouthColor);
		face2D.fill(new Ellipse2D.Float(eye1X, eye1Y, EYE_WIDTH, EYE_WIDTH));
		face2D.fill(new Ellipse2D.Float(eye2X, eye2Y, EYE_WIDTH, EYE_WIDTH));
		face2D.fill(new Arc2D.Float(mouthX, mouthY, mouthWidth, mouthWidth,
			MOUTH_ARC_BEGIN, MOUTH_ARC_LENGTH, Arc2D.CHORD));
	}
}