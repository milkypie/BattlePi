package CustomComponents;

import java.awt.Color;

import javax.swing.JPanel;

public abstract class Board extends JPanel {
	protected Ship[] Ships = new Ship[5];
	public BoardSquare[][] Squares = new BoardSquare[12][12];
	public Board(){
		super();
		this.setLayout(null);
		this.setBackground(Color.WHITE);
		this.setSize(300, 300);
		for(int x=0;x<12;x++){
			for(int y=0;y<12;y++){
				this.Squares[x][y] = new BoardSquare(50+(20*x),50+(20*y));
				this.add(Squares[x][y]);
			}
		}
		
	}
	public int[] FindSquare(Location SearchLocation)throws CustomException{
		for(int x = 0;x<12;x++){
			for(int y = 0;y<12;y++){
				if(Squares[x][y].getLocation().x<=SearchLocation.getXPos()&&Squares[x][y].getLocation().x+Squares[x][y].getWidth()>=SearchLocation.getXPos()
						&&Squares[x][y].getLocation().y<=SearchLocation.getYPos()&&Squares[x][y].getLocation().y+Squares[x][y].getHeight()>=SearchLocation.getYPos()){
					int[] returnArray = new int[] {x,y};
					return returnArray;
				}
			}
		}
		throw new CustomException("Invalid search Location");
	}
	
	public abstract void ClickAction(int Squarex,int SquareY);
	
	public abstract void Shoot();
	
	public abstract void PlacePieces();
	
	public abstract void MakeMove();
	
	public abstract void ShipSunk();
}
