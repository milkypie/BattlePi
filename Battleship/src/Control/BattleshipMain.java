package Control;

import Visuals.VisualControl;
import CustomComponents.Action;
import CustomComponents.Board;
import CustomComponents.AIBoard;
import CustomComponents.PlayerBoard;
import Input.MouseInput;

public class BattleshipMain {
	/*TODO
	 * 	custom JPanels
	 *  Action Listners (for initial placing)
	 *  
	 */
	public static Boolean GameWon = false,PlayerWon = false, PlacingPhase = true;
	public static MouseInput PlayerMouseHandler,AIMouseHandler;
	public static AIBoard AIBoard;
	public static PlayerBoard PlayerBoard;

	public static void main(String[] args) { 
		AIBoard = new AIBoard();
		PlayerBoard = new PlayerBoard();
		
		PlayerMouseHandler = new MouseInput(PlayerBoard);
		AIMouseHandler = new MouseInput(AIBoard);
		
		PlayerBoard.addMouseListener(PlayerMouseHandler);
		AIBoard.addMouseListener(AIMouseHandler);
		
		PlayerBoard.setLocation(0, 0);
		AIBoard.setLocation(320, 0);

		VisualControl.SetupVisuals();
		
		PlayerBoard.PlacePieces();
		AIBoard.PlacePieces();
		
		while(!GameWon){
			PlayerBoard.MakeMove();
			if(!GameWon){
				AIBoard.MakeMove();
			}
		}
		if(PlayerWon){
			PlayerWin();		
		}else{
			AIWin();
		}
	}
	public static void PlayerWin(){
		
	}
	public static void AIWin(){
		
	}

}
