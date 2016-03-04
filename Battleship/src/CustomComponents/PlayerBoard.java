package CustomComponents;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import Visuals.VisualControl;
import Control.BattleshipMain;

public class PlayerBoard extends Board implements ActionListener{
	private int ShipToPlace = 0,PlacingRotation = 0;
	public PlayerBoard(){
		super();
		this.NameLabel = new JLabel();
		this.NameLabel.setLocation(50, 0);
		this.NameLabel.setForeground(Color.BLACK);
		this.NameLabel.setText("Player Board");
		this.NameLabel.setSize(100, 50);
		this.add(this.NameLabel);
	}

	@Override
	public void PlacePieces() {
		// TODO Auto-generated method stub
		
		
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
					this.Squares[CurrentSquare[0]][CurrentSquare[1]].SetHasShip(false);
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
		}else if(e.getSource()==VisualControl.DoneButton){
			
		}else{
			System.out.println("Failed to find source");
		}
		VisualControl.UpdatePlacingIcons(this.ShipToPlace,this.PlacingRotation);
		
	}
}
