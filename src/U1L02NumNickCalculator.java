//U1L02 NumNick Calculator
//Eleanor Barth Wu
//September 6, 2019

import javax.swing.JOptionPane;

public class U1L02NumNickCalculator {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "How many cents do you have?");
				int userMoney = Integer.parseInt(input);
				
				//System.out.println(UserMoney);
				
				int numNick = userMoney / 5;
				int numPen = userMoney - (numNick * 5);
				
				JOptionPane.showMessageDialog(null, "You need " + numNick + " nickels and " + numPen + " pennies");


	}

}
