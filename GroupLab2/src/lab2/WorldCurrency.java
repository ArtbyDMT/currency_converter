package lab2;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class WorldCurrency {

	public static void main(String[] args) {

		ImageIcon image = new ImageIcon(WorldCurrency.class.getResource("currency_logo_mini.png"));

		String countryNum = (String) JOptionPane.showInputDialog(null,
				"Enter the number of a country's currency you want to exchange to: " + "\n 1. Brazil" + "\n 2. Israel"
						+ "\n 3. United Arab Emirates" + "\n 4. Mexico" + "\n 5. Japan",
				"LET'S GET CONVERTING!", JOptionPane.PLAIN_MESSAGE, image, null, "");

		int countryNumber;
		try {
			do {
				countryNumber = Integer.parseInt(countryNum);

				switch (countryNumber) {
				case 1:

					String dollars = (String) JOptionPane.showInputDialog(null,
							"Enter US Dollars to convert to Reals: ", "LET'S GET CONVERTING!",
							JOptionPane.PLAIN_MESSAGE, image, null, "");
					double usDollars = Double.parseDouble(dollars);
					double brazilianReals = brazilianReal(usDollars);
					JOptionPane.showMessageDialog(null,
							"$" + String.format("%.2f", usDollars) + " US Dollars is equal to "
									+ String.format("%.2f", brazilianReals) + " Brazilian Reals",
							"US Dollars -> Brazilian Reals", JOptionPane.PLAIN_MESSAGE, image);

					break;
				case 2:
					String dollars1 = (String) JOptionPane.showInputDialog(null,
							"Enter US Dollars to convert to Shekels: ", "LET'S GET CONVERTING!",
							JOptionPane.PLAIN_MESSAGE, image, null, "");
					double usDollars1 = Double.parseDouble(dollars1);
					double israelNewShekels = israelShekel(usDollars1);
					JOptionPane.showMessageDialog(null,
							"$" + String.format("%.2f", usDollars1) + " US Dollars is equal to "
									+ String.format("%.2f", israelNewShekels) + " Israel New Shekels",
							"US Dollars -> Israel New Shekels", JOptionPane.PLAIN_MESSAGE, image);

					break;
				case 3:

					String dollars2 = (String) JOptionPane.showInputDialog(null,
							"Enter US Dollars to convert to Dirhams: ", "LET'S GET CONVERTING!",
							JOptionPane.PLAIN_MESSAGE, image, null, "");
					double usDollars2 = Double.parseDouble(dollars2);
					double dollarToDirham = convertDollarToDirham(usDollars2);
					JOptionPane.showMessageDialog(null,
							"$" + String.format("%.2f", usDollars2) + " US Dollars is equal to "
									+ String.format("%.2f", dollarToDirham) + " UAE Dirhams",
							"US Dollars -> UAE Dirhams", JOptionPane.PLAIN_MESSAGE, image);

					break;
				case 4:

					String dollars3 = (String) JOptionPane.showInputDialog(null,
							"Enter US Dollars to convert to Pesos: ", "LET'S GET CONVERTING!",
							JOptionPane.PLAIN_MESSAGE, image, null, "");
					double usDollars3 = Double.parseDouble(dollars3);
					double pesos = convertToPesos(usDollars3);
					JOptionPane.showMessageDialog(null,
							"$" + String.format("%.2f", usDollars3) + " US Dollars is equal to "
									+ String.format("%.2f", pesos) + " Mexican Pesos",
							"US Dollars -> Mexican Pesos", JOptionPane.PLAIN_MESSAGE, image);
					break;
				case 5:

					String dollars4 = (String) JOptionPane.showInputDialog(null, "Enter US Dollars to convert to Yen: ",
							"LET'S GET CONVERTING!", JOptionPane.PLAIN_MESSAGE, image, null, "");
					double usDollars4 = Double.parseDouble(dollars4);
					double japYen = convertToYen(usDollars4);
					JOptionPane.showMessageDialog(null,
							"$" + String.format("%.2f", usDollars4) + " US Dollars is equal to "
									+ String.format("%.2f", japYen) + " Japanese Yen",
							"US Dollars -> Japanese Yen", JOptionPane.PLAIN_MESSAGE, image);

					break;

				default:
					JOptionPane.showMessageDialog(null, "Try Again", "Repeat The Process", JOptionPane.PLAIN_MESSAGE,
							image);

				}

				countryNum = (String) JOptionPane.showInputDialog(null,
						"Let's Go Again \n\nEnter the number of a country's currency you want to exchange to: "
								+ "\n 1. Brazil" + "\n 2. Israel" + "\n 3. United Arab Emirates" + "\n 4. Mexico"
								+ "\n 5. Japan",
						"LET'S GET CONVERTING!", JOptionPane.PLAIN_MESSAGE, image, null, "");

				countryNumber = Integer.parseInt(countryNum);

			} while (countryNumber < 6);
		} catch (Exception e) {

		}
		System.exit(0);
	}

	public static double brazilianReal(double usdollars) {

		double brazilianReal = usdollars * 5.12075;
		return brazilianReal;
	}

	public static double israelShekel(double usdollars) {

		double israelNewShekels = usdollars / 0.31;
		return israelNewShekels;
	}

	public static double convertDollarToDirham(double usdollars) {

		double dollarToDirham = usdollars * 3.6725;
		return dollarToDirham;
	}

	public static double convertToPesos(double usdollars) {

		double pesos = usdollars * 19.9;
		return pesos;

	}

	public static double convertToYen(double usdollars) {
		double japYen = usdollars * 136.73;
		return japYen;
	}
}
