package Control;

import Visuals.VisualControl;
import CustomComponents.Action;
import CustomComponents.Board;

import javax.swing.JOptionPane;

import CustomComponents.AIBoard;
import CustomComponents.PlayerBoard;
import Input.MouseInput;

public class BattleshipMain {
	/*TODO
	 * 	custom JPanels
	 *  Action Listeners (for initial placing)
	 *  
	 */
	public static Boolean GameWon = false,PlayerWon = false, PlacingPhase = true;
	public static MouseInput PlayerMouseHandler,AIMouseHandler;
	public static AIBoard AIBoard;
	public static PlayerBoard PlayerBoard;

	public static void main(String[] args) { 
		AIBoard = new AIBoard();
		PlayerBoard = new PlayerBoard();
		
		AIBoard.setOtherPlayer(PlayerBoard);
		
		PlayerMouseHandler = new MouseInput(PlayerBoard);
		AIMouseHandler = new MouseInput(AIBoard);
		
		PlayerBoard.addMouseListener(PlayerMouseHandler);
		AIBoard.addMouseListener(AIMouseHandler);
		
		PlayerBoard.setLocation(10, 10);
		AIBoard.setLocation(330, 10);

		VisualControl.SetupVisuals();
		VisualControl.BasePanel.updateUI();
		PlayerBoard.PlacePieces();
		AIBoard.PlacePieces();
		
	}
	public static void PlayerWin(){
		JOptionPane.showMessageDialog(
			    null, "Player 1 wins!");
	}
	public static void AIWin(){
		JOptionPane.showMessageDialog(
			    null, "The Magnificent AI wins!");
	}

}
