package edu.citytech.connect4;
//edu.citytech.connect4.Connect4Controller

import java.net.URL;
import java.util.Arrays;
import java.util.Date;
import java.util.ResourceBundle;
import edu.citytech.connect4.service.Connect4Service;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class Connect4Controller implements Initializable {

	@FXML
	private GridPane gpConnect4;
	@FXML
	private FlowPane fpLayout;
	@FXML
	private Label lblMessage;
	@FXML
	private Button btnReset;

	@Override
	public void initialize(URL url, ResourceBundle resource) {

		int i = 0;
		for (int rows = 0; rows <= 5; rows++)
			for (int column = 0; column <= 6; column++) {
				Label l = new Label("?");
				labels[i] = l;
				l.getStyleClass().add("custom-label");
				l.setUserData(i);
				l.setOnMouseClicked((MouseEvent e) -> this.clickedEvent(e));
				gpConnect4.add(l, column, rows);
				i++;
			}
	}

	private boolean isX = true;

	private void clickedEvent(MouseEvent e) {
		Label l = (Label) e.getSource();
		if (!l.getText().equals("?")) {
			lblMessage.setText("Invalid move as of " + new Date());
			return;
		}

		String xOrO = "";
		if (isX) {
			xOrO = "X";
		} else {
			xOrO = "O";
		}
		isX = !isX;
		l.setText(xOrO);

		String[] moves = new String[42];
		for (int i = 0; i < labels.length; i++) {
			moves[i] = labels[i].getText();
		}

		int cellNumber = (int) l.getUserData();
		String newMove = l.getText();
		moves[cellNumber] = "?";
		l.setText("?");

		int nextMove = Connect4Service.getValidCellMoves(moves, cellNumber);

		labels[nextMove].setText(newMove);
		labels[nextMove].getStyleClass().add(xOrO);
		
		lblMessage.setText(
				"current index is " + cellNumber + " next valid move is " + nextMove + " clicked on " + new Date());
	}

	private Label[] labels = new Label[42];

	@FXML
	void resetLabel(ActionEvent event) {
		for (Label label : labels) {
			label.setText("?");
			label.getStyleClass().removeIf(e -> e.equals("X") || e.equals("O") );
		}
		isX = true;
		lblMessage.setText("");
		;
	}

	@FXML
	private Object nextMove(MouseEvent e) {

		Label currentLabel = (Label) e.getSource();
		currentLabel.setText("X");

		String[] moves = new String[42];
		int i = 0;
		for (Label lvl : labels) {
			moves[i++] = lvl.getText();
		}
		System.out.println(Arrays.toString(moves));
		int[] wc = Connect4Service.getWinner(moves);
		
		System.out.println("Stop touching me " + new Date());
		return null;
	}

}


/*
 * @FXML void resetLabel(ActionEvent event) { ObservableList<Node> items =
 * this.gpConnect4.getChildren(); items.forEach(e -> { Label l = (Label) e;
 * l.setText(""); }); }
 */
