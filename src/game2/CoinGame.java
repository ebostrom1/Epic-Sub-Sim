package game2;

import javax.swing.JOptionPane;

public class CoinGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coins = 20;
		int whoseTurn = 2;

		String GameModeOption = JOptionPane.showInputDialog(
				" type 1 for player vs player \n type 2 for player vs easy AI \n type 3 for player vs hard AI");
		int GameMode = Integer.parseInt(GameModeOption);

		if (GameMode == 1) {

			do {
				whoseTurn = 3 - whoseTurn;

				String response = JOptionPane
						.showInputDialog("player " + whoseTurn + " take 1 or 2 coins there are " + coins + " left");
				int playerChoice = Integer.parseInt(response);
				if (playerChoice > 2) {
					JOptionPane.showInputDialog("don't cheat");
					whoseTurn = 3 - whoseTurn;
				} else
					coins = coins - playerChoice;

			} while (coins != 0);

			JOptionPane.showInputDialog("player " + whoseTurn + "wins");
		}

		if (GameMode == 2) {
			do {
				int AIChoice = 0;
				String response = JOptionPane
						.showInputDialog("take 1 or 2 coins \n coins left " + coins + "cumputer took" + AIChoice);
				int playerChoice = Integer.parseInt(response);
				if (playerChoice > 2) {
					JOptionPane.showInputDialog("don't cheat");
				} else if (coins != 0) {
					AIChoice = (int) (1 + (Math.random() * 2));
				}
				coins = coins - playerChoice - AIChoice;

			} while (coins != 0);
			JOptionPane.showInputDialog("player " + whoseTurn + "wins");
		}
		if (GameMode == 3) {
			System.out.println("not avaliable");
		}

	}

}