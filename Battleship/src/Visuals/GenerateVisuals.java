package Visuals;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Control.BattleshipMain;
import CustomComponents.BoardSquare;
import CustomComponents.CustomPanel;
import Visuals.VisualControl;
public class GenerateVisuals {
	public static void CreateWindow(){
		VisualControl.Window.setSize(700, 500);
		VisualControl.Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VisualControl.Window.setVisible(true);
		VisualControl.Window.setContentPane(CreateContentPane());
	}
	
	public static JPanel CreateContentPane(){
		VisualControl.BasePanel.setLayout(null);
		VisualControl.BasePanel.setSize(300, 300);
		VisualControl.BasePanel.setLocation(0, 0);
		
		VisualControl.BasePanel.add(BattleshipMain.PlayerBoard);
		VisualControl.BasePanel.add(BattleshipMain.AIBoard);
		
		VisualControl.DestroyerButton = new JButton("Destroyer");
		VisualControl.DestroyerButton.setLocation(10, 400);
		VisualControl.DestroyerButton.setSize(80,50);
		VisualControl.DestroyerButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.CruiserButton = new JButton("Cruiser");
		VisualControl.CruiserButton.setLocation(100,400);
		VisualControl.CruiserButton.setSize(80,50);
		VisualControl.CruiserButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.BattleshipButton = new JButton("Battleship");
		VisualControl.BattleshipButton.setLocation(190,400);
		VisualControl.BattleshipButton.setSize(80,50);
		VisualControl.BattleshipButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.HoverButton = new JButton("Hover-Craft");
		VisualControl.HoverButton.setLocation(280,400);
		VisualControl.HoverButton.setSize(80, 50);
		VisualControl.HoverButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.CarrierButton = new JButton("Carrier");
		VisualControl.CarrierButton.setLocation(370,400);
		VisualControl.CarrierButton.setSize(80,50);
		VisualControl.CarrierButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.BasePanel.add(VisualControl.DestroyerButton);
		VisualControl.BasePanel.add(VisualControl.CruiserButton);
		VisualControl.BasePanel.add(VisualControl.BattleshipButton);
		VisualControl.BasePanel.add(VisualControl.HoverButton);	
		VisualControl.BasePanel.add(VisualControl.CarrierButton);
		
		VisualControl.RotationButton = new JButton("Rotate");
		VisualControl.RotationButton.setLocation(460, 400);
		VisualControl.RotationButton.setSize(80,50);
		VisualControl.RotationButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.BasePanel.add(VisualControl.RotationButton);
		
		VisualControl.PlacingIcons = new BoardSquare[4][4];
		for(int XLooper = 0; XLooper<4; XLooper++){
			for(int YLooper = 0; YLooper<4; YLooper++){
				VisualControl.PlacingIcons[XLooper][YLooper] = new BoardSquare(570+(20*XLooper),370+(20*YLooper),Color.PINK);
				if(XLooper==1&&(YLooper==1||YLooper==2)){
					VisualControl.PlacingIcons[XLooper][YLooper].setVisible(true);
				}else{
					VisualControl.PlacingIcons[XLooper][YLooper].setVisible(false);
				}
				VisualControl.BasePanel.add(VisualControl.PlacingIcons[XLooper][YLooper]);
			}
		}
		
		return VisualControl.BasePanel;
		
	}
}
