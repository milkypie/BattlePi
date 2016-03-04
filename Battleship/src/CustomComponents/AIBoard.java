package CustomComponents;

import java.util.Random;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import Control.BattleshipMain;

public class AIBoard extends Board {
	
	public AIBoard(){
		super();
		this.NameLabel = new JLabel();
		this.NameLabel.setLocation(50, 0);
		this.NameLabel.setForeground(Color.BLACK);
		this.NameLabel.setText("AI Board");
		this.NameLabel.setSize(100, 50);
		this.add(this.NameLabel);
	}
	
	@Override
	public void PlacePieces() {
		// TODO Auto-generated method stub
		Random RandGen = new Random();
		
		for(int looper = 0;looper<5;looper++){
			while(true){
				try{
					int Orientation = RandGen.nextInt(4);
					int XSquare = RandGen.nextInt(12);
					int YSquare = RandGen.nextInt(12);
					this.Ships[looper] = new Ship(this,(looper),new Location(50+(20*XSquare),50+(20*YSquare)),Orientation);
					break;
				}catch(CustomException e){
					System.out.println("found a custom exception");
				}catch(Exception e){
					System.out.println("found a different error");
				}
			}
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
