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
		
		VisualControl.HoverButton = new JButton("Hover-Craft");
		VisualControl.HoverButton.setLocation(300,400);
		VisualControl.HoverButton.setSize(80, 50);
		VisualControl.HoverButton.addActionListener(BattleshipMain.PlayerBoard);
		
		VisualControl.BasePanel.add(VisualControl.HoverButton);
		
				
		return VisualControl.BasePanel;
		
	}
}
