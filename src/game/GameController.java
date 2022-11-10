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

	GameController(GameView view, GameModel model){
		this.view = view;
		this.model = model;
		view.setup();
		this.initViewActionListeners();
	}
	
	/**
	 * Calls initButtons to provide them with their action Listener
	 */
	 private void initViewActionListeners(){
	        view.initDim(new dimlistener());
	    }
	
	/**
	 * Calls updateGrid from View when Dim is selected
	 * @author liamc & Youssef
	 *
	 */
	public class dimlistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e)
        {
        	model.setDim(view.updateGrid());
        	model.setBoard();
    		    }
    		
        }
	
	public class modelistener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
        	view.mode();
    		    }
    		
        }
    }