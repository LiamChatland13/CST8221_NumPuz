package game;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.awt.event.ActionEvent;
@SuppressWarnings({ "unused", "serial", "rawtypes" })

public class GameView extends JFrame{
	
	//Declaring Container and both Panels
	Container c = getContentPane();
	JPanel Grid, menu = new JPanel();
    
    //Declaring all Components
    private JLabel label, lbl, lbl2, lType, moves, points, time, input1;
    private JRadioButton design, play;
	private JComboBox dim, type;
	private JButton show, hide, save, load, rand, finish, reset;
	private JButton[] buttons;
	private JTextArea move, point, console, timeV, input;
	
	//Declaring Grid dimensions & Grid
	public static final int HEIGHT = 800; 
	public static final int WIDTH = 650;
	
	
    public void setup(){
    	setTitle("NumPuz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        //setting the bounds for the JFrame
        setBounds(100,100,1000,800);
        this.Grid = new JPanel();
        this.menu.setLayout(null);
        
        //Adding Title of the game to menu
        label = new JLabel("NUMPUZ");
        label.setForeground(Color.white);;
        label.setBounds(150,0,300,50);
        this.menu.add(label);
        
        //Adding Mode (Design or Play)
        design = new JRadioButton();
        design.setSelected(true);
        design.setBounds(135, 30, 120, 50);
        design.setText("Design");
        design.setForeground(Color.white);
        design.setBackground(Color.black);

      	play = new JRadioButton();
      	play.setBounds(250, 30, 80, 50);
      	play.setText("Play");
      	play.setForeground(Color.white);
      	play.setBackground(Color.black);
        
        ButtonGroup group = new ButtonGroup();
        group.add(this.play);
        group.add(this.design);

        this.menu.add(play);
      	this.menu.add(design);

        lbl = new JLabel("Mode");
        lbl.setForeground(Color.white);
        lbl.setBounds(40, 30, 150, 50);
        this.menu.add(lbl);
        
        //Adding dimension options
        lbl2 = new JLabel("Dim:");
        lbl2.setForeground(Color.white);
        lbl2.setBounds(40, 85, 150, 50);
        this.menu.add(lbl2);
        
        String d[] = {"3", "4", "5"};
        dim = new JComboBox(d);
        dim.setBounds(90, 90, 70, 40);
        dim.setForeground(Color.black);
        dim.setBackground(Color.white);
        this.menu.add(dim);

        
        //Adding Show and Hide buttons
        show = new JButton("Show");
        show.setBounds(170, 90, 70, 40);
        show.setForeground(Color.black);
        this.menu.add(show);
        hide = new JButton("Hide");
        hide.setBounds(250, 90, 70, 40);
        hide.setForeground(Color.black);
        this.menu.add(hide);
        
        //Adding Save, Load, and Rand buttons
        save = new JButton("Save");
        save.setBounds(90, 140, 70, 40);
        save.setForeground(Color.black);
        this.menu.add(save);
        load = new JButton("Load");
        load.setBounds(170, 140, 70, 40);
        load.setForeground(Color.black);
        this.menu.add(load);
        rand = new JButton("Rand");
        rand.setBounds(250, 140, 70, 40);
        rand.setForeground(Color.black);
        this.menu.add(rand);
        
        //Adding Type options
        lType = new JLabel("Type:");
        lType.setForeground(Color.white);
        lType.setBounds(40, 185, 150, 50);
        this.menu.add(lType);
        String t[] = {"Number", "Text"};
        type = new JComboBox(t);
        type.setBounds(90, 190, 110, 40);
        type.setForeground(Color.black);
        type.setBackground(Color.white);
        this.menu.add(type);
        
        //Adding Finish button
        finish = new JButton("Finish");
        finish.setBounds(220, 190, 100, 40);
        finish.setForeground(Color.black);
        this.menu.add(finish);
        
        //Adding Moves and Points text areas
        move = new JTextArea();
        move.setBounds(90, 240, 80, 40);
        this.menu.add(move);
        moves = new JLabel("Moves:");
        moves.setForeground(Color.white);
        moves.setBounds(30,250,60,15);
        this.menu.add(moves);
        
        
        input1 = new JLabel("Enter String:");
        input1.setBounds(65, 295, 80, 40);
        input1.setForeground(Color.white);
        this.menu.add(input1);
        input = new JTextArea();
        input.setBounds(150, 295, 150, 40);
        this.menu.add(input);
        
        point = new JTextArea();
        point.setBounds(240, 240, 80, 40);
        this.menu.add(point);
        points = new JLabel("Points:");
        points.setForeground(Color.white);
        points.setBounds(180,250,60,15);
        this.menu.add(points);
    
        //Adding Console text Area
        console = new JTextArea();
        console.setBounds(70, 350, 250, 300);
        this.menu.add(console);
        
        //Adding time text area
        timeV = new JTextArea("0");
        timeV.setBounds(190, 700, 40, 20);
        this.menu.add(timeV);
        
        //Adding Time label
        time = new JLabel("Time:");
        time.setForeground(Color.white);
        time.setBounds(140,700,60,15);
        this.menu.add(time);
        
        //Adding reset button
        reset = new JButton("Reset");
        reset.setBounds(155, 735, 70, 20);
        reset.setForeground(Color.black);
        this.menu.add(reset);
        
        // changing the background color of the panel to yellow
        this.menu.setBackground(Color.black);
        this.menu.setBounds(650,0,350,1000); 
        c.add(createGrid(3,3));
        c.add(this.menu);
        setVisible(true);
    }
    
	
	
	/**
	 * Method to create the grid for the Grid JPanel using dimension parameters h & w
	 * @param h
	 * @param w
	 * @return Grid
	 */
	public JPanel createGrid(int h, int w) {
		GridLayout layout = new GridLayout(w, h);
        this.Grid.setLayout(layout);
        this.Grid.setBounds(0, 0, WIDTH, HEIGHT);
        buttons = new JButton[h*w];
        String count;
        for(int i=1;i<(h*w);i++)
        {

           count = String.valueOf(i);

           buttons[i]=new JButton();
           buttons[i].setText(count);
           buttons[i].setBackground(Color.LIGHT_GRAY);
        }


       for(int i=1;i<(h*w);i++)
        {
           this.Grid.add(buttons[i]);
        }
		return this.Grid;
	}
	
	public void rand(int d) {
		this.Grid.removeAll();
      	this.Grid.revalidate();
      	this.Grid.repaint();
        Collections.shuffle(Arrays.asList(buttons));
        GridLayout layout = new GridLayout(d, d);
        this.Grid.setLayout(layout);
        this.Grid.setBounds(0, 0, WIDTH, HEIGHT);
        for(int i=1;i<(d*d);i++)
        {
           this.Grid.add(buttons[i]);
        }
      	this.c.add(this.Grid);
	}
	
	
	/**
	 * Adds action Listener from Controller to the Dim component
	 * @param actionListener
	 */
	public void initDim(ActionListener actionListener) {
        this.dim.addActionListener(actionListener);
        
	}
	
	public void initrand(ActionListener actionListener) {
		this.rand.addActionListener(actionListener);
	}
	
	public void initMode(ActionListener actionListener) {
        this.play.addActionListener(actionListener);
        this.design.addActionListener(actionListener);
	}
	
	public boolean mode() {
		if(this.design.isSelected()) {
			this.play.setSelected(false);
			return false;
		}else {
			this.design.setSelected(false);
			return true;
		}
	}
	
	
	/**
	 * Updates the grid with the value selected by the dim component
	 */
	public int updateGrid() {
		String s = (String) dim.getSelectedItem();
		  switch (s) {
          case "3":
          	Grid.removeAll();
          	Grid.revalidate();
          	Grid.repaint();
          	this.c.add(createGrid(3,3));
          	break;

         case "4":
         		Grid.removeAll();
      	    Grid.revalidate();
         	    Grid.repaint();
      	    this.c.add(createGrid(4,4));
             	break;
             
         case "5":
         		Grid.removeAll();
         		Grid.revalidate();
         		Grid.repaint();
      	    this.c.add(createGrid(5,5));
              break;
          }
		  return Integer.parseInt(s);
	}
	
	//String splitter
    /*for(int i=0;i<data.length();i++){
        System.out.println(data.charAt(i));
    }*/
}
