package CustomComponents;

import java.awt.Color;

import javax.swing.JLabel;

import Control.BattleshipMain;

public class AIBoard extends Board{
	public AIBoard(){
		super();
		this.NameLabel = new JLabel();
		this.NameLabel.setLocation(50, 0);
		this.NameLabel.setForeground(Color.BLACK);
		this.NameLabel.setText("the Board");
		system.out.println("something different");
		this.NameLabel.setSize(100, 50);
		this.add(this.NameLabel);
	}

	@Override
	public void PlacePieces() {
		// TODO Auto-generated method stub
		
		try {
			this.Ships[0] = new Ship(this,0,new Location(190,70),3);
			this.Ships[3] = new Ship(this,3,new Location(70,110),3);
			this.Ships[4] = new Ship(this,4,new Location(170,170),3);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void MakeMove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShipSunk() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Shoot() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ClickAction(int Squarex, int SquareY) {
		// TODO Auto-generated method stub
		if(!BattleshipMain.PlacingPhase){
			
		}
	}
}
