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

}
