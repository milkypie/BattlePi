package CustomComponents;

import java.util.Random;
import java.awt.Color;
import javax.swing.JLabel;
import Control.BattleshipMain;

public class AIBoard extends Board{
	
	public AIBoard(){
		super();
		this.NameLabel = new JLabel();
		this.NameLabel.setLocation(50, 0);
		this.NameLabel.setForeground(Color.BLACK);
		this.NameLabel.setText("AI Board");
		this.NameLabel.setSize(100, 50);
		this.add(this.NameLabel);
	}

	private int[] RandomCoords= new int[3];
	
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
		
		
		
		//try {
			//Randomize(0);
			//this.Ships[0] = new Ship(this,0,new Location(RandomCoords[0],RandomCoords[1]),RandomCoords[2]);
			//Randomize(1);
			//this.Ships[1] = new Ship(this,1,new Location(RandomCoords[0],RandomCoords[1]),RandomCoords[2]);
			//this.Ships[2] = new Ship(this,2,new Location(170,170),3);
		//} catch (CustomException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		//}
		
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
	
	public void Randomize(int shipno) {
		Random generator = new Random();
		int i = generator.nextInt(4);
		RandomCoords[2] = i;
		if (shipno == 0) { //Destroyer
			switch(i) {
			case 0: //Should work
				i = (generator.nextInt(12) + 1);
				RandomCoords[0] = (50+(i*20));
				i = (generator.nextInt(11) + 1);
				RandomCoords[1] = (50+(i*20));
				break;
			case 2: //Should work
				i = (generator.nextInt(12) + 1);
				RandomCoords[0] = (50+(i*20));
				i = (generator.nextInt(11) + 1);
				RandomCoords[1] = (70+(i*20));
				break;
			case 1: //Should work
				i = (generator.nextInt(11) + 1);
				RandomCoords[0] = (70+(i*20));
				i = (generator.nextInt(12) + 1);
				RandomCoords[1] = (50+(i*20));
				break;
			case 3: //Should work
				i = (generator.nextInt(11) + 1);
				RandomCoords[0] = (50+(i*20));
				i = (generator.nextInt(12) + 1);
				RandomCoords[1] = (50+(i*20));
				break;
			}
		}
		else if (shipno == 1) { //Cruiser
			switch(i) {
				case 0: //Should work
					i = (generator.nextInt(10) + 1);
					RandomCoords[0] = (90+(i*20));
					i = (generator.nextInt(10) + 1);
					RandomCoords[1] = (50+(i*20));
					break;
				case 2: //Should work
					i = (generator.nextInt(10) + 1);
					RandomCoords[0] = (50+(i*20));
					i = (generator.nextInt(10) + 1);
					RandomCoords[1] = (90+(i*20));
					break;
				case 1:  //Should work
					i = (generator.nextInt(10) + 1);
					RandomCoords[0] = (90+(i*20));
					i = (generator.nextInt(12) + 1);
					RandomCoords[1] = (50+(i*20));
					break;
				case 3: //Should work
					i = (generator.nextInt(10) + 1);
					RandomCoords[0] = (50+(i*20));
					i = (generator.nextInt(12) + 1);
					RandomCoords[1] = (50+(i*20));
					break;
				}
			}
	}
	
}
