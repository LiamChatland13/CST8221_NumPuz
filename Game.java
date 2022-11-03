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

@SuppressWarnings("unused")
public class Game {
	public static void main() {
		GameModel model = new GameModel();
		GameView view = new GameView();
		GameController contoller = new GameController(model,view);
	}
}
