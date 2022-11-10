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


public class GameModel {
	
	private String configStr;
	private int dim;
	private int[][] board;
	
	public void setConfigStr(String config) {
		this.configStr = config;
	}
	
	public void setDim(int dim) {
		this.dim = dim;
	}
	
	public void setBoard() {
		int[][] b = new int[getDim()][getDim()];
		this.board = b;
	}
	
	public String getConfigStr() {
		return configStr;
	}
	
	public int getDim() {
		return dim;
	}
	
	public int[][] getBoard() {
		return board;
	}
	
}