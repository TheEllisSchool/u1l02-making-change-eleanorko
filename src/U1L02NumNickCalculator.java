//U1L02 NumNick Calculator
//Eleanor Barth Wu
//September 6, 2019

import javax.swing.JOptionPane;

public class U1L02NumNickCalculator {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "How many cents do you have?");
				int userMoney = Integer.parseInt(input);
				
				//System.out.println(UserMoney);
				
				int numQuart = userMoney / 25;
				userMoney =  userMoney % 25;
				int numDime = userMoney / 10;
				userMoney = userMoney % 10;
				int numNick = userMoney / 5;
				userMoney = userMoney % 5;
				int numPen = userMoney;
				JOptionPane.showMessageDialog(null, "You need " + numQuart + " quarter(s), " + numDime + 
						" dime(s), " + numNick + " nickel(s) and " + numPen + " pennies");
				
				
				
				
				//int numNick = (userMoney - numPen) / 5;
				//int numPen = userMoney % 5; 
				//JOptionPane.showMessageDialog(null, "You need " + numPen + " pennies and " + numNick + " nickels");
				
				//If number is divisible by 25 then find number of quarters
				//If number is divisible by 10 find number of dimes
				//program should opperate in the order of most valued coins to least
				
				//int numNick = userMoney / 5;
				//int numPen = userMoney - (numNick * 5);
				
				//JOptionPane.showMessageDialog(null, "You need " + numNick + " nickels and " + numPen + " pennies");


	}

}
