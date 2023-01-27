

import javax.swing.JOptionPane;

public class GrafischeBenutzeroberfläche4 {

	public static void main(String[] args) {
		int gewaehlteOption = JOptionPane.showOptionDialog
				(null, "Dies ist ein Optionsdialog", "Optionsdialog",  
						JOptionPane.YES_NO_CANCEL_OPTION,  JOptionPane.WARNING_MESSAGE, 
						null, new String[]{"A", "B", "C"}, "B");
		// TODO Auto-generated method stub

	}

}
