package CustomComponents;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visuals.VisualControl;
import Control.BattleshipMain;

public class PlayerBoard extends Board implements ActionListener{
	private int ShipToPlace = 0,PlacingRotation = 0;
	public PlayerBoard(){
		super();
	}

	@Override
	public void PlacePieces() {
		// TODO Auto-generated method stub
		
		try{
			this.Ships[1] = new Ship(this, 1,new Location(110,110),2);
			this.Ships[2] = new Ship(this,2,new Location(170,170),3);
		}catch(CustomException e){
			e.printStackTrace();
		}
		
	}
	public void setPlaceShip(int NewShip){
		if(NewShip<5){
			this.ShipToPlace = NewShip;	
		}
	}
	public void setShipRotation(int NewRotation){
		if(NewRotation<5){
			this.PlacingRotation = NewRotation;
		}
	}
	public void RemoveShip(int ShipToRemove){
		for(int Looper = 0;Looper<6;Looper++){
			Location CurrentLocation = this.Ships[ShipToRemove].GetPosition(Looper);
			if(CurrentLocation!=null){
				try {
					int[] CurrentSquare = FindSquare(CurrentLocation);
					this.Squares[CurrentSquare[0]][CurrentSquare[1]].setBackground(Color.GRAY);
				} catch (CustomException e) {
					e.printStackTrace();
				}
			}else{
				Looper = 6;
			}
		}
	}
	
	public void ClickAction(int SquareX,int SquareY){
		if(BattleshipMain.PlacingPhase){
			if(this.Ships[this.ShipToPlace]!=null){
				RemoveShip(this.ShipToPlace);
			}
			try {
				this.Ships[this.ShipToPlace] = new Ship(this,this.ShipToPlace, new Location(50+(20*SquareX),50+(20*SquareY)),this.PlacingRotation);
			} catch (CustomException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void MakeMove() {
		if(!BattleshipMain.PlacingPhase){
			
		}
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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("recieved button press");
		if(e.getSource()==VisualControl.DestroyerButton){
			this.ShipToPlace = 0;
		}else if(e.getSource()==VisualControl.CruiserButton){
			this.ShipToPlace = 1;
		}else if(e.getSource()==VisualControl.BattleshipButton){
			this.ShipToPlace = 2;
		}else if(e.getSource()==VisualControl.HoverButton){
			this.ShipToPlace = 3;
		}else if(e.getSource()==VisualControl.CarrierButton){
			this.ShipToPlace = 4;
		}else if(e.getSource()==VisualControl.RotationButton){
			if(this.PlacingRotation==3){
				this.PlacingRotation = 0;
			}else{
				this.PlacingRotation += 1;
			}
		}else{
			System.out.println("Failed to find source");
		}
		VisualControl.UpdatePlacingIcons(this.ShipToPlace,this.PlacingRotation);
		
	}
}
