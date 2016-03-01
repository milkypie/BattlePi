package CustomComponents;

import java.util.Random;

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
			//this.Ships[3] = new Ship(this,1,new Location(110,110),2)/;
			//this.Ships[4] = new Ship(this,4,new Location(170,170),3);
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
		if (shipno == 0) {
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
