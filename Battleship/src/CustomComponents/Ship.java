package CustomComponents;

import java.awt.Color;

import Visuals.VisualControl;

public class Ship {
	private int Health;
	private Board CurrentBoard;
	private Boolean[] PositionHit = new Boolean[6];
	protected int Type,Rotation;
	protected Location[] Positions = new Location[6];
	
	public Ship(Board BoardContainer,int InitialType,Location InitialPosition,int InitialRotation) throws CustomException{
		this.Type = InitialType;
		this.Rotation = InitialRotation;
		this.CurrentBoard  = BoardContainer;
		for(int looper = 0;looper<6;looper++){
			this.PositionHit[looper] = false;
			this.Positions[looper] = null;
		}
		this.Positions[0] = InitialPosition;
		int[] InitialSquare = BoardContainer.FindSquare(InitialPosition);
		switch(InitialType){
		case 0: // destroyer
			this.Health = 2;
			switch(InitialRotation){
			case 0:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+20); //lower
			break;
			case 1:
				this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()); //lefter
			break;
			case 2:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20); //higher
			break;
			case 3:
				this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()); //righter
			break;
			default:
				System.out.println("Rotaion index out of bounds");
				throw new CustomException("Rotaion index out of bounds");
			}
		break;
		case 1: // cruiser
			this.Health = 3;
			switch(InitialRotation){
			case 0:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+20);
				this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+40);
			break;
			case 1:
				this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos());
			break;
			case 2:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
				this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-40);
			break;
			case 3:
				this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos());
			break;
			default:
				System.out.println("Rotaion index out of bounds");
				throw new CustomException("Rotaion index out of bounds");
			}
		break;
		case 2: // battleship
			this.Health = 4;
			switch(InitialRotation){
			case 0:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+20);
				this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+40);
				this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+60);
			break;
			case 1:
				this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos());
				this.Positions[3] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos());
			break;
			case 2:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
				this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-40);
				this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-60);
			break;
			case 3:
				this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos());
				this.Positions[3] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos());				break;
			default:
				System.out.println("Rotaion index out of bounds");
				throw new CustomException("Rotaion index out of bounds");
			}
		break;
		case 3: // hover-craft
			this.Health = 6;
			switch(InitialRotation){
			case 0:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+20);
				this.Positions[2] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+20);
				this.Positions[3] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+20);
				this.Positions[4] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+40);
				this.Positions[5] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+40);
			break;
			case 1:
				this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-20);
				this.Positions[3] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+20);
				this.Positions[4] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos()-20);
				this.Positions[5] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos()+20);
			break;
			case 2:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
				this.Positions[2] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-20);
				this.Positions[3] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-20);
				this.Positions[4] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-40);
				this.Positions[5] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-40);
			break;
			case 3:
				this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+20);
				this.Positions[3] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-20);
				this.Positions[4] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos()+20);
				this.Positions[5] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos()-20);
			break;
			default:
				System.out.println("Rotaion index out of bounds");
				throw new CustomException("Rotaion index out of bounds");
			}
		break;
		case 4: // carrier
			this.Health = 6;
			switch(InitialRotation){
			case 0:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+20);
				this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+40);
				this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+60);
				this.Positions[4] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+60);
				this.Positions[5] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+60);
			break;
			case 1:
				this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos());
				this.Positions[3] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos());
				this.Positions[4] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos()+20);
				this.Positions[5] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos()-20);
			break;
			case 2:
				this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
				this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-40);
				this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-60);
				this.Positions[4] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-60);
				this.Positions[5] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-60);
			break;
			case 3:
				this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
				this.Positions[2] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos());
				this.Positions[3] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos());
				this.Positions[4] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos()+20);
				this.Positions[5] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos()-20);
			break;
			default:
				System.out.println("Rotaion index out of bounds");
				throw new CustomException("Rotaion index out of bounds");
			}
		break;
		default:
			System.out.println("something went wrong in the definition of a ship");
			throw new CustomException("Ship type out of bounds");
		}
		for(int looper = 0;looper<6;looper++){
			if(this.Positions[looper] == null){
				looper = 6;
			}else{
				int[] XY = BoardContainer.FindSquare(this.Positions[looper]);
				if(BoardContainer.Squares[XY[0]][XY[1]].HasShip()){
					throw new CustomException("There is already a ship there");
				}
			}
		}
		
		try{
			for(int looper = 0;looper<6;looper++){
				if(this.Positions[looper]==null){
					looper = 6;
				}else{
					int[] XY = BoardContainer.FindSquare(this.Positions[looper]);
					BoardContainer.Squares[XY[0]][XY[1]].SetHasShip(true);
					BoardContainer.Squares[XY[0]][XY[1]].setBackground(Color.PINK);
				}
			}
		} catch (ArrayIndexOutOfBoundsException e){
			int[] Square = new int[2];
			for(int PosLooper = 0;PosLooper<6;PosLooper++){
				if(this.Positions[PosLooper]!=null){
					Square = BoardContainer.FindSquare(this.Positions[PosLooper]);
					BoardContainer.Squares[Square[0]][Square[1]].setBackground(Color.GRAY);
					BoardContainer.Squares[Square[0]][Square[1]].SetHasShip(false);
					this.Positions[PosLooper] = null;
				}else{
					PosLooper = 6;
				}
			}
		}
		for(int looper = this.Health;looper<6;looper++){
			PositionHit[looper] = true;
		}
		System.out.println("\nship created successfully"+this);
		
	}

	public Boolean Shoot(Location ShotLocation) throws CustomException{
		for(int looper = 0;looper<this.Positions.length;looper++){
			if(Positions[looper].getXPos()==ShotLocation.getXPos()
				&&Positions[looper].getYPos()==ShotLocation.getYPos()){
				if(PositionHit[looper]){
					throw new CustomException("Position has been shot twice");
				}else{
					PositionHit[looper] = true;
					Health--;
					if(Health == 0){
						CurrentBoard.ShipSunk();	
					}
					return true;
				}
			}
		}
		return false;
	}
	public Location GetPosition(int PositionNum){
		return this.Positions[PositionNum];
	}
	public String toString(){
		String returnString = "\n";
		returnString = returnString + "\n" + "Ship Type: " + this.Type;
		returnString = returnString + "\n" + "Ship Rotation: " + this.Rotation;
		returnString = returnString + "\n" + "Ship Positions: ";
		for(int x = 0;x<6;x++){
			returnString = returnString + "\n" + this.Positions[x] + " , " + this.PositionHit[x];
		}
		
		return returnString;
	}
}
