package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameBasics extends JFrame {
	GameBasics(){
		setTitle("NumPuz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //setting the bounds for the JFrame
        setBounds(100,100,1000,800);
        Container c = getContentPane();
        
//-----------      Grid     ------------------------
        //Creating Grid panel with grid a layout
        JPanel Grid = new JPanel();
        GridLayout grid = new GridLayout(3, 3);
        Grid.setLayout(grid);
        Grid.setBounds(0, 0, 650, 800);
        
        //Creating buttons for the Grid panel
        JButton B1 = new JButton("1");
        JButton B2 = new JButton("2");
        JButton B3 = new JButton("3");
        JButton B4 = new JButton("4");
        JButton B5 = new JButton("5");
        JButton B6 = new JButton("6");
        JButton B7 = new JButton("7");
        JButton B8 = new JButton("8");
        
        //Adding buttons to Grid panel
        Grid.add(B1);
        Grid.add(B2);
        Grid.add(B3);
        Grid.add(B4);
        Grid.add(B5);
        Grid.add(B6);
        Grid.add(B7);
        Grid.add(B8);
//--------------------------------------------------
        
//-----------      Menu     -------------------------
        //Creating a JPanel for the Menu
        JPanel menu = new JPanel();
        menu.setLayout(null);
        
        //Adding Title of the game to menu
        JLabel label = new JLabel("NUMPUZ");
        label.setForeground(Color.white);;
        label.setBounds(150,0,200,50);
        menu.add(label);
        
        //Adding Console text Area
        JTextArea console = new JTextArea();
        console.setBounds(50, 350, 250, 300);
        menu.add(console);
        
        //Adding time text area
        JTextArea timeV = new JTextArea("0");
        timeV.setBounds(190, 685, 30, 15);
        menu.add(timeV);
        
        //Adding Time label
        JLabel time = new JLabel("Time:");
        time.setForeground(Color.white);
        time.setBounds(150,685,60,15);
        menu.add(time);
        
        //Adding reset button
        JButton reset = new JButton("Reset");
        reset.setBounds(136, 740, 100, 20);
        reset.setForeground(Color.black);
        menu.add(reset);
        
        // changing the background color of the panel to yellow
        menu.setBackground(Color.black);
        menu.setBounds(650,0,350,1000);
//----------------------------------------------------
        
        //adding the panel to the Container of the JFrame
        c.add(menu);
        c.add(Grid);
       
        setVisible(true);
	}
	

	 public static void main(String[] args) {
		 new GameBasics();
	        
	       
	    }
	}