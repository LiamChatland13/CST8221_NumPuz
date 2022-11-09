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
import game.GameView;
@SuppressWarnings("unused")

public class GameController{
	private GameView view; 
	private GameModel model;
	//GameView view = new GameView();
	GameController(GameView view, GameModel model){
		this.view = view;
		this.model = model;
		this.initViewActionListeners();
	}
	 private void initViewActionListeners()
	    {
	        view.initButtons(new DimListener());
	    }
	
	
	public class DimListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
        	view.createGrid(3,3);
    		       	/**String s = (String) dim.getSelectedItem();
    		        switch (s) {
    		        case "3":
    		        	Grid.removeAll();
    		        	Grid.revalidate();
    		        	Grid.repaint();
    		        	c.add(createGrid(3,3));
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
    		        }*/
    		    }
    		
    		/////////////////////////////////////////////////////////
        }
    }