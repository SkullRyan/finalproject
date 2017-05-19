import javax.swing.JOptionPane;

public class Converter {

	public String changeToHex(int intBase10) {
		char[] hexlist = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		int remain = 0;
		String tempanswer = "";
		boolean x = true;
		int divided = 0;
		int divme = intBase10;

		// code for you to complete
		if (intBase10 < 0 || intBase10 > 255) {
			JOptionPane.showMessageDialog(null, "Error: Integer Must Be Between 0 & 255, Try Again.");
		} else {
			
			while (x == true) {
				divided = divme / 16;
				remain = divme % 16;
				tempanswer += hexlist[remain];
				if (divided == 0) {
					x = false;
				}
				divme=divided;
			}
			

		}
		return new StringBuilder(tempanswer).reverse().toString();

	}

}
