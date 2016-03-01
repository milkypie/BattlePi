package CustomComponents;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BoardSquare extends JPanel {
	public Border SquareBorder;
	public BoardSquare(int XPos,int YPos){
		super();
		SquareBorder = BorderFactory.createLineBorder(Color.BLACK);
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		this.setSize(20, 20);
		this.setBorder(SquareBorder);
		this.setLocation(XPos, YPos);
	}
	public BoardSquare(int XPos,int YPos,Color InitialColour){
		super();
		SquareBorder = BorderFactory.createLineBorder(Color.BLACK);
		this.setLayout(null);
		this.setBackground(InitialColour);
		this.setSize(20, 20);
		this.setBorder(SquareBorder);
		this.setLocation(XPos, YPos);
	}
}
