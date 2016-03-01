package CustomComponents;


public class Location{
	int XPos,YPos;
	public Location(int InitialX,int InitialY){
		this.XPos = InitialX;
		this.YPos = InitialY;
	}
	public void setLocation(int NewX,int NewY){
		this.XPos = NewX;
		this.YPos = NewY;
	}
	public int[] getLocation(){
		int[] returnArray = new int[] {this.XPos,this.YPos};
		return returnArray;
	}
	public int getXPos(){
		return this.XPos;
	}
	public int getYPos(){
		return this.YPos;
	}
	public void addXPos(int change){
		this.XPos+=change;
	}
	public void addYPos(int change){
		this.YPos+=change;
	}
}
