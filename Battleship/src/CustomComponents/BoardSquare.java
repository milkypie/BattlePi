package CustomComponents;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class BoardSquare extends JPanel {
	public Boolean Active;
	public Border SquareBorder;
	public BoardSquare(int XPos,int YPos){
		super();
		SquareBorder = BorderFactory.createLineBorder(Color.BLACK);
		this.Active = true;
		this.setLayout(null);
		this.setBackground(Color.GRAY);
		this.setSize(20, 20);
		this.setBorder(SquareBorder);
		this.setLocation(XPos, YPos);
	}
}
