package game;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
@SuppressWarnings({ "unused", "serial" })

public class GameController extends GameView{
	GameController(GameModel model, GameView view){
		
		
		view.createGrid(3,3);
		
		//Action listener for dimension size/////////////////////
        dim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) dim.getSelectedItem();
                switch (s) {
                case "3":
                	Grid.removeAll();
                	Grid.revalidate();
                	Grid.repaint();
                	c.add(createGrid(3,3));;
                	break;

               case "4":
               		Grid.removeAll();
            	    Grid.revalidate();
               	    Grid.repaint();
            	    c.add(createGrid(4,4));
                   	break;
                   
               case "5":
               		Grid.removeAll();
               		Grid.revalidate();
               		Grid.repaint();
            	    c.add(createGrid(5,5));
                    break;
                }
            }
        });
        /////////////////////////////////////////////////////////
        
        
	}
}
