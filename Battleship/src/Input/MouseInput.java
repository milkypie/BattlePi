package Input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Control.BattleshipMain;
import CustomComponents.Action;
import CustomComponents.Board;
import CustomComponents.CustomException;
import CustomComponents.Location;
import Visuals.VisualControl;

public class MouseInput implements MouseListener {
	private Board SuperBoard;
	public MouseInput(Board UseBoard){
		this.SuperBoard = UseBoard;
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("\nMouse click detected");
		System.out.print("XPos: "+arg0.getX()+" \nYPos: "+arg0.getY());
		Location EventLocation = new Location(arg0.getX(),arg0.getY());
		System.out.print("\n"+arg0.getSource());
		int[] EventSquare = new int[2];
		try{
			EventSquare = SuperBoard.FindSquare(EventLocation);
			System.out.print("\n"+EventSquare[0]+" "+EventSquare[1]);
		}catch(CustomException e){
			System.out.println("something failed in finding click location");
			e.printStackTrace();
		}
		SuperBoard.ClickAction(EventSquare[0]+1,EventSquare[1]+1);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
