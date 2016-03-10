package CustomComponents;

import java.util.Random;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import Control.BattleshipMain;


public class AIBoard extends Board {

	private	int SquareX, SquareY;
	private int ShipsPlaced =  5;

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
					this.Ships[looper] = new Ship(this,(looper),new Location(50+(20*XSquare),50+(20*YSquare)),Orientation,false);//only true for testing, must be false on completion
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
		ShipsPlaced--;
		if (ShipsPlaced==0){
			BattleshipMain.PlayerWin();
		}
	}
	
	public void Shoot() {
		Random RandGen = new Random();
		do {
			SquareX = RandGen.nextInt(12);
			SquareY = RandGen.nextInt(12);
		}while (BattleshipMain.PlayerBoard.BeenShot[SquareX][SquareY]);
		
		System.out.println("AI shot at square :"+SquareX+", "+SquareY);
		
		if(BattleshipMain.PlayerBoard.Squares[SquareX][SquareY].HasShip!=-1){
			try {
				BattleshipMain.PlayerBoard.Ships[BattleshipMain.PlayerBoard.Squares[SquareX][SquareY].HasShip].Shoot(new Location(50+(20*SquareX),50+(20*SquareY)));
				BattleshipMain.PlayerBoard.BeenShot[SquareX][SquareY] = true;
			} catch (CustomException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			BattleshipMain.PlayerBoard.Squares[SquareX][SquareY].setBackground(Color.GREEN);
		}else{
			BattleshipMain.PlayerBoard.ShootEmptyPiece(SquareX,SquareY);
		}
	}

	@Override
	public void ClickAction(int SquareX, int SquareY){
		// TODO Auto-generated method stub
		if(!BattleshipMain.PlacingPhase){
			if(!this.BeenShot[SquareX][SquareY]){
				if(this.Squares[SquareX][SquareY].HasShip!=-1){
					try {
						this.Ships[this.Squares[SquareX][SquareY].HasShip].Shoot(new Location(50+(20*SquareX),50+(20*SquareY)));
					} catch (CustomException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.Squares[SquareX][SquareY].setBackground(Color.GREEN);
				}else{
					this.Squares[SquareX][SquareY].setBackground(Color.RED);
				}
				this.BeenShot[SquareX][SquareY] = true;
				this.Shoot();
			}else{
				System.out.println("square has already been shot");
			}
			
		}
	}

	@Override
	public void ShootEmptyPiece(int XPos, int YPos) {
		// TODO Auto-generated method stub
		
	}
	
}
