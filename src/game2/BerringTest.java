package game2;

import javax.swing.JOptionPane;

public class BerringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sub = 2;
		int sub1x = (int) (Math.random() * 11);
		int sub1y = (int) (Math.random() * 11);
		int sub2x = (int) (Math.random() * 11);
		int sub2y = (int) (Math.random() * 11);
		int player1shot;
		int player2shot;
		int playerturn = 2;
		double theta = Math.atan2(sub1x + sub2x, sub1y + sub2y);
		double sinD1 = 360 * (theta / (2 * Math.PI));
		sinD1 = (int) (90 - sinD1);
		double theta2 = Math.atan2(sub2x + sub1x, sub2y + sub1y);
		double sinD2 = 360 * (theta2 / (2 * Math.PI));
		sinD2 = (int) (90 - sinD2);
		String direction = "null";
		double degrees = 0;
		String responsey;
		String responsex;

		do {
			playerturn = 3 - playerturn;
			if (playerturn == 1) {
				if (sub1x > sub2x && sub1y > sub2y) {
					direction = "Southwest";
					degrees = 180 + sinD1;
				}
				if (sub1x < sub2x && sub1y < sub2y) {
					direction = "Northeast";
					degrees = sinD1;
				}
				if (sub1x > sub2x && sub1y < sub2y) {
					direction = "Northwest";
					degrees = 270 + sinD1;
				}
				if (sub1x < sub2x && sub1y > sub2y) {
					direction = "Southeast";
					degrees = 90 + sinD1;
				}
				responsey = JOptionPane.showInputDialog("your ship is on cordanetes " + sub1x + ", " + sub1y
						+ " we have intersepted a meassge of russian sub of is " + degrees + " " + direction
						+ " .\n which direction should we fire (degress)");
				player1shot = Integer.parseInt(responsey);

				if (player1shot == degrees) {
					JOptionPane.showInputDialog("we have sunk the Russian sub");

					sub = sub - 1;
				} else {
					JOptionPane.showInputDialog("We have missed");
				}

			}

			if (playerturn == 2) {
				if (sub2x > sub1x && sub2y > sub1y) {
					direction = "Southwest";
					degrees = 180 + sinD2;
				}

				if (sub2x < sub1x && sub2y < sub1y) {
					direction = "Northeast";
					degrees = sinD2;
				}
				if (sub2x > sub1x && sub2y < sub1y) {
					direction = "Northwest";
					degrees = 270 + sinD2;
				}
				if (sub2x < sub1x && sub2y > sub1y) {
					direction = "Southeast";
					degrees = 90 + sinD2;
				}
				responsey = JOptionPane.showInputDialog("your ship is on cordanetes " + sub2x + ", " + sub2y
						+ " we have intersepted a meassge of American sub of are " + degrees + " " + direction
						+ "  .\n which direction should we fire (degress)");
				player2shot = Integer.parseInt(responsey);

				if (player2shot == degrees) {
					JOptionPane.showInputDialog("we have sunk the American sub");

					sub = sub - 1;
				} else {
					JOptionPane.showInputDialog("We have missed");
				}
			}
		} while (sub == 2);

	}

}
