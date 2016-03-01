package Visuals;

import java.awt.Color;

import javax.swing.*;

public class VisualControl {
	public static JFrame Window = new JFrame("[=] BattlePi [=]");
	public static JPanel BasePanel = new JPanel();
	public static final Color ShipColour = Color.PINK;
	
	public static void SetupVisuals(){
		GenerateVisuals.CreateWindow();
	}

}
