package game;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;
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
        label.setBounds(150,0,300,50);
        menu.add(label);
        
        //Adding Mode (Design or Play)
        JRadioButton RB1 = new JRadioButton();
        RB1.setBounds(135, 30, 120, 50);
        RB1.setText("Design");
        RB1.setForeground(Color.white);
        RB1.setBackground(Color.black);
        menu.add(RB1);
        JRadioButton RB2 = new JRadioButton();
        RB2.setBounds(250, 30, 80, 50);
        RB2.setText("Play");
        RB2.setForeground(Color.white);
        RB2.setBackground(Color.black);
        menu.add(RB2);
        JLabel lbl = new JLabel("Mode");
        lbl.setForeground(Color.white);
        lbl.setBounds(40, 30, 150, 50);
        menu.add(lbl);
        
        //Adding dimension options
        JLabel lbl2 = new JLabel("Dim:");
        lbl2.setForeground(Color.white);
        lbl2.setBounds(40, 85, 150, 50);
        menu.add(lbl2);
        String d[] = {"3", "4", "5"};
        JComboBox dim = new JComboBox(d);
        dim.setBounds(90, 90, 70, 40);
        dim.setForeground(Color.black);
        dim.setBackground(Color.white);
        menu.add(dim);
        
        //Adding Show and Hide buttons
        JButton show = new JButton("Show");
        show.setBounds(170, 90, 70, 40);
        show.setForeground(Color.black);
        menu.add(show);
        JButton hide = new JButton("Hide");
        hide.setBounds(250, 90, 70, 40);
        hide.setForeground(Color.black);
        menu.add(hide);
        
        //Adding Save, Load, and Rand buttons
        JButton save = new JButton("Save");
        save.setBounds(90, 140, 70, 40);
        save.setForeground(Color.black);
        menu.add(save);
        JButton load = new JButton("Load");
        load.setBounds(170, 140, 70, 40);
        load.setForeground(Color.black);
        menu.add(load);
        JButton rand = new JButton("Rand");
        rand.setBounds(250, 140, 70, 40);
        rand.setForeground(Color.black);
        menu.add(rand);
        
        //Adding Type options
        JLabel lbl3 = new JLabel("Type:");
        lbl3.setForeground(Color.white);
        lbl3.setBounds(40, 185, 150, 50);
        menu.add(lbl3);
        String t[] = {"Number", "Text"};
        JComboBox type = new JComboBox(t);
        type.setBounds(90, 190, 110, 40);
        type.setForeground(Color.black);
        type.setBackground(Color.white);
        menu.add(type);
        
        //Adding Finish button
        JButton finish = new JButton("Finish");
        finish.setBounds(220, 190, 100, 40);
        finish.setForeground(Color.black);
        menu.add(finish);
        
        //Adding Moves and Points text areas
        JTextArea  move = new JTextArea();
        move.setBounds(90, 240, 80, 40);
        menu.add(move);
        JLabel moves = new JLabel("Moves:");
        moves.setForeground(Color.white);
        moves.setBounds(30,250,60,15);
        menu.add(moves);
        JTextArea point = new JTextArea();
        point.setBounds(240, 240, 80, 40);
        menu.add(point);
        JLabel points = new JLabel("Points:");
        points.setForeground(Color.white);
        points.setBounds(180,250,60,15);
        menu.add(points);
    
        //Adding Console text Area
        JTextArea console = new JTextArea();
        console.setBounds(70, 350, 250, 300);
        menu.add(console);
        
        //Adding time text area
        JTextArea timeV = new JTextArea("0");
        timeV.setBounds(155, 685, 100, 40);
        menu.add(timeV);
        
        //Adding Time label
        JLabel time = new JLabel("Time:");
        time.setForeground(Color.white);
        time.setBounds(110,695,60,15);
        menu.add(time);
        
        //Adding reset button
        JButton reset = new JButton("Reset");
        reset.setBounds(155, 740, 100, 40);
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