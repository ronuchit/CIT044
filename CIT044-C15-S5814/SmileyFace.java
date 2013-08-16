// 5814
// CIT044 Assignment 15 Exercise 1
/* Creates a smiley face using Graphics methods.
*/

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

/** Creates smiley faces of various sizes, positions, and colors
    using Graphics methods.
*/
public class SmileyFace extends JFrame
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

	public SmileyFace(int diam)
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

	public SmileyFace(int diam, Color faceCol, Color eyesAndMouthCol,
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
		face.setColor(faceColor);
		face.fillOval(facePosX, facePosY, diameter, diameter);
		face.setColor(eyesAndMouthColor);
		face.fillOval(eye1X, eye1Y, EYE_WIDTH, EYE_WIDTH);
		face.fillOval(eye2X, eye2Y, EYE_WIDTH, EYE_WIDTH);
		face.drawArc(mouthX, mouthY, mouthWidth, mouthWidth, MOUTH_ARC_BEGIN, MOUTH_ARC_LENGTH);
	}
}