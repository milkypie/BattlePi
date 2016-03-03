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
			PositionHit[looper] = false;
		}
		this.Positions[0] = InitialPosition;
		int[] InitialSquare = BoardContainer.FindSquare(InitialPosition);
		BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]].setBackground(VisualControl.ShipColour);
		BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]].SetHasShip(true);
		try{
			switch(InitialType){
			case 0: // destroyer
				this.Health = 2;
				switch(InitialRotation){
				case 0:
					this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+20); //lower
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].SetHasShip(true);
				break;
				case 1:
					this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()); //lefter
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].SetHasShip(true);
				break;
				case 2:
					this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20); //higher
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].SetHasShip(true);		
				break;
				case 3:
					this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()); //righter	
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].SetHasShip(true);	
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
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+40);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+2].SetHasShip(true);
				break;
				case 1:
					this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].SetHasShip(true);
				break;
				case 2:
					this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-40);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-2].SetHasShip(true);
				break;
				case 3:
					this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]].SetHasShip(true);
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
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+40);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+2].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+60);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+3].SetHasShip(true);
				break;
				case 1:
					this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]].SetHasShip(true);
				break;
				case 2:
					this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-40);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-2].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-60);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-3].SetHasShip(true);
				break;
				case 3:
					this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]].SetHasShip(true);
				break;
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
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+40);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+2].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+40);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+2].SetHasShip(true);
				break;
				case 1:
					this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]+1].SetHasShip(true);
				break;
				case 2:
					this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-40);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-2].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-40);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-2].SetHasShip(true);
				break;
				case 3:
					this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]-1].SetHasShip(true);
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
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+40);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+2].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()+60);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]+3].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()+60);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]+3].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()+60);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]+3].SetHasShip(true);
				break;
				case 1:
					this.Positions[1] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()-40,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-2][InitialSquare[1]].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()-60,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-3][InitialSquare[1]-1].SetHasShip(true);
				break;
				case 2:
					this.Positions[1] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-1].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-40);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-2].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-2].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos(),InitialPosition.getYPos()-60);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]][InitialSquare[1]-3].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos()-60);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]-3].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()-20,InitialPosition.getYPos()-60);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-3].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]-1][InitialSquare[1]-3].SetHasShip(true);
				break;
				case 3:
					this.Positions[1] = new Location(InitialPosition.getXPos()+20,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+1][InitialSquare[1]].SetHasShip(true);
					this.Positions[2] = new Location(InitialPosition.getXPos()+40,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+2][InitialSquare[1]].SetHasShip(true);
					this.Positions[3] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos());
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]].SetHasShip(true);
					this.Positions[4] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos()+20);
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]+1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]+1].SetHasShip(true);
					this.Positions[5] = new Location(InitialPosition.getXPos()+60,InitialPosition.getYPos()-20);
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]-1].setBackground(VisualControl.ShipColour);
					BoardContainer.Squares[InitialSquare[0]+3][InitialSquare[1]-1].SetHasShip(true);
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
