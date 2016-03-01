package Visuals;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Control.BattleshipMain;
import Visuals.VisualControl;
public class GenerateVisuals {
	public static void CreateWindow(){
		VisualControl.Window.setSize(650, 500);
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
		VisualControl.BattleshipButton.setLocation(200,400);
		VisualControl.BattleshipButton.setSize(80,50);
		VisualControl.BattleshipButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.HoverButton = new JButton("Hover-Craft");
		VisualControl.HoverButton.setLocation(300,400);
		VisualControl.HoverButton.setSize(80, 50);
		VisualControl.HoverButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.CarrierButton = new JButton("Carrier");
		VisualControl.CarrierButton.setLocation(400,400);
		VisualControl.CarrierButton.setSize(80,50);
		VisualControl.CarrierButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.BasePanel.add(VisualControl.DestroyerButton);
		VisualControl.BasePanel.add(VisualControl.CruiserButton);
		VisualControl.BasePanel.add(VisualControl.BattleshipButton);
		VisualControl.BasePanel.add(VisualControl.HoverButton);	
		VisualControl.BasePanel.add(VisualControl.CarrierButton);
		
		return VisualControl.BasePanel;
		
	}
}
