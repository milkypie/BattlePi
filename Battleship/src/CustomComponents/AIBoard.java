package CustomComponents;

import java.util.Random;
<<<<<<< HEAD
=======

import java.awt.Color;

import javax.swing.JLabel;
>>>>>>> branch 'working' of https://github.com/milkypie/BattlePi.git

import Control.BattleshipMain;

public class AIBoard extends Board{
	public AIBoard(){
		super();
	}

	private int O, i, H, W;
	private int[] HW= new int[2];
	@Override
	public void PlacePieces() {
		// TODO Auto-generated method stub
		
		try {
			O = RandomO();
			Randomize(0,O);
			this.Ships[0] = new Ship(this,0,new Location(HW[0],HW[1]),O);
			//O = RandomO();
			//Randomize(1,O);
			//this.Ships[1] = new Ship(this,1,new Location(290,290),2);
			//O = RandomO();
			//Randomize(2,O);
			//this.Ships[2] = new Ship(this,2,new Location(170,170),3);
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
	
	public int[] Randomize(int shipno, int orientation) {
		Random generator = new Random();
		if (shipno == 0) { //Destroyer
			switch(orientation) {
			case 0: //Should work
				i = (generator.nextInt(12) + 1);
				H = (50+(i*20));
				i = (generator.nextInt(11) + 1);
				W = (50+(i*20));
			case 2: //Should work
				i = (generator.nextInt(12) + 1);
				H = (50+(i*20));
				i = (generator.nextInt(11) + 1);
				W = (70+(i*20));
			case 1: //Should work
				i = (generator.nextInt(11) + 1);
				H = (70+(i*20));
				i = (generator.nextInt(12) + 1);
				W = (50+(i*20));
			case 3: //Should work
				i = (generator.nextInt(11) + 1);
				H = (50+(i*20));
				i = (generator.nextInt(12) + 1);
				W = (50+(i*20));
			}
		}
		else if (shipno == 1) { //Cruiser
			switch(orientation) {
				case 0: //Should work
					i = (generator.nextInt(12) + 1);
					H = (50+(i*20));
					i = (generator.nextInt(10) + 1);
					W = (50+(i*20));
				case 2: //Should work
					i = (generator.nextInt(12) + 1);
					H = (50+(i*20));
					i = (generator.nextInt(10) + 1);
					W = (90+(i*20));
				case 1: 
					i = (generator.nextInt(11) + 1);
					H = (70+(i*20));
					i = (generator.nextInt(12) + 1);
					W = (50+(i*20));
				case 3: 
					i = (generator.nextInt(11) + 1);
					H = (50+(i*20));
					i = (generator.nextInt(12) + 1);
					W = (50+(i*20));
				}
			}
		HW[0] = H;
		HW[1] = W;
		return HW;
	}
	
	public int RandomO() {
		Random generator = new Random(); 
		int i = generator.nextInt(4);
		return i;
	}
}
