package Visuals;

import java.awt.Color;

import javax.swing.*;

import CustomComponents.BoardSquare;

public class VisualControl {
	public static JFrame Window = new JFrame("[=] BattlePi [=]");
	public static JPanel BasePanel = new JPanel();
	public static final Color ShipColour = Color.PINK;
	public static JButton HoverButton,DestroyerButton,CruiserButton,BattleshipButton,CarrierButton,RotationButton;
	public static BoardSquare[][] PlacingIcons;
	
	public static void SetupVisuals(){
		GenerateVisuals.CreateWindow();
	}
	
	public static void UpdatePlacingIcons(int PlacingShip,int PlacingRotation){
		//Clears old icon
		for(int XLooper = 0;XLooper <4;XLooper++){
			for(int YLooper = 0;YLooper<4;YLooper++){
				PlacingIcons[XLooper][YLooper].setVisible(false);
			}
		}
		//creates new icon
		switch(PlacingShip){
		case 0:
			switch(PlacingRotation){
			case 0:
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
			break;
			case 1:
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[1][1].setVisible(true);
			break;
			case 2:
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][0].setVisible(true);
			break;
			case 3:
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[3][1].setVisible(true);
			break;
			default:
				System.out.println("invalid rotaiton");
			break;
			}
		break;
		case 1:
			switch(PlacingRotation){
			case 0:
				PlacingIcons[2][0].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
			break;
			case 1:
				PlacingIcons[1][1].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[3][1].setVisible(true);
			break;
			case 2:
				PlacingIcons[2][0].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
			break;
			case 3:
				PlacingIcons[1][1].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[3][1].setVisible(true);
			break;
			default:
				System.out.println("invalid rotaiton");
			break;
			}
		break;
		case 2:
			switch(PlacingRotation){
			case 0:
				PlacingIcons[2][0].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[2][3].setVisible(true);
			break;
			case 1:
				PlacingIcons[0][2].setVisible(true);
				PlacingIcons[1][2].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[3][2].setVisible(true);
			break;
			case 2:
				PlacingIcons[2][0].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[2][3].setVisible(true);
			break;
			case 3:
				PlacingIcons[0][2].setVisible(true);
				PlacingIcons[1][2].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[3][2].setVisible(true);
			break;
			default:
				System.out.println("invalid rotaiton");
			break;
			}
		break;
		case 3:
			switch(PlacingRotation){
			case 0:
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[1][2].setVisible(true);
				PlacingIcons[3][2].setVisible(true);
				PlacingIcons[1][3].setVisible(true);
				PlacingIcons[3][3].setVisible(true);
			break;
			case 1:
				PlacingIcons[3][2].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][3].setVisible(true);
				PlacingIcons[1][1].setVisible(true);
				PlacingIcons[1][3].setVisible(true);
			break;
			case 2:
				PlacingIcons[2][3].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[1][2].setVisible(true);
				PlacingIcons[3][2].setVisible(true);
				PlacingIcons[1][1].setVisible(true);
				PlacingIcons[3][1].setVisible(true);
			break;
			case 3:
				PlacingIcons[1][2].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][3].setVisible(true);
				PlacingIcons[3][1].setVisible(true);
				PlacingIcons[3][3].setVisible(true);
			break;
			default:
				System.out.println("invalid rotaiton");
			break;
			}
		break;
		case 4:
			switch(PlacingRotation){
			case 0:
				PlacingIcons[2][0].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[2][3].setVisible(true);
				PlacingIcons[1][3].setVisible(true);
				PlacingIcons[3][3].setVisible(true);
			break;
			case 1:
				PlacingIcons[0][2].setVisible(true);
				PlacingIcons[1][2].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[3][2].setVisible(true);
				PlacingIcons[0][1].setVisible(true);
				PlacingIcons[0][3].setVisible(true);
			break;
			case 2:
				PlacingIcons[2][0].setVisible(true);
				PlacingIcons[2][1].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[2][3].setVisible(true);
				PlacingIcons[1][0].setVisible(true);
				PlacingIcons[3][0].setVisible(true);
			break;
			case 3:
				PlacingIcons[0][2].setVisible(true);
				PlacingIcons[1][2].setVisible(true);
				PlacingIcons[2][2].setVisible(true);
				PlacingIcons[3][2].setVisible(true);
				PlacingIcons[3][1].setVisible(true);
				PlacingIcons[3][3].setVisible(true);
			break;
			default:
				System.out.println("invalid rotaiton");
			break;
			}
		break;
		default:
			System.out.println("Invalid ship num");
		break;
		}
	}

}
