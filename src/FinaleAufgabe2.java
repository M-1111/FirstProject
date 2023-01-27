
import java.util.Scanner;
public class FinaleAufgabe2 {
	

	public static void main(String[] args) {
		System.out.println("Bitte zwei Werte zur Ausrechnung eingeben.");
		Scanner eingabeScanner = new Scanner(System.in);
		String eingabeDesAnwenders = eingabeScanner.next();
		String eingabeDesAnwenders2 = eingabeScanner.next();
		int wert = Integer.valueOf(eingabeDesAnwenders);
	    int wert4 = Integer.valueOf(eingabeDesAnwenders2);
	    System.out.println(""+eingabeDesAnwenders+" und "+eingabeDesAnwenders2);
	    int ergebnis= wert+wert4;
		System.out.println("Ergibt zusammen den Wert "+ergebnis);
		// TODO Auto-generated method stub

	}

}
