

import javax.swing.JOptionPane;

public class Zahlenerhöhung {

	
	public static void main(String[] args)
	{
		int wert1 = 0;
		int wert2 = 1;
		int wert3 = 1;
		int auswahlVonAnwender = JOptionPane.showConfirmDialog(null, "Wollen Sie das Programm beenden?");
		System.out.println(""+auswahlVonAnwender);   //nur optional um die Ergebnisse des Befehls abzufragen!
		
		if(	auswahlVonAnwender==1)
		{
			
		
		System.out.println(""+wert1+" und "+wert2);
		int ergebnis= wert1+wert2;
		System.out.println("Der Anfangswert beträgt: "+ergebnis);
		int ergebnis2=ergebnis+wert3;
		
		System.out.println("Dieser Wert mit 1 addiert ergibt:" + ergebnis2);
		
		
		}

		else
			
		{
			
			System.out.println("Das Programm ist nun fertig.");
		}
		
	
	}																																																																																																																																																																														
	
	

}

