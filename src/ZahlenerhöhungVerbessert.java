

import javax.swing.JOptionPane;

public class ZahlenerhĂ¶hungVerbessert {

	public static void main(String[] args) {
		
		int wert1 = 0;
		int abfrage = 1;
		
		
		
		do
		{
			wert1 = wert1+1;
			System.out.println(""+wert1);
		    abfrage =	JOptionPane.showConfirmDialog(null, "Wollen Sie das Programm beenden?");
		}
		while(abfrage==1);
		
		

	}

}
