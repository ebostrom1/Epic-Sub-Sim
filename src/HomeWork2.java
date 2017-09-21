import javax.swing.JOptionPane;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String response;
		int userNum, secret;
		int money= 10;
		do {
			secret = (int)(Math.random()*11);
			response = JOptionPane.showInputDialog("guess a number your money is " + money);
			userNum = Integer.parseInt(response);
			if (userNum != secret) {
				System.out.println("you're wrong");
				money= money-1;
			}else {
				System.out.println("you're right");
				money=money+3;
			}
			
		}while (money >0);
	}

}
