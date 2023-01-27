

import java.util.Scanner;

public class Testprogramm2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int zahl = -1;
		do
		{
			System.out.println("Geben sie eine Zahl von 0 bis 10 ein");//Frage wird solange wiederholt, bis der Benutzer einen gültigen Wert eingibt. 
			String eingabe = scanner.next();
			try
			{
				zahl = Integer.valueOf(eingabe);
				
			}
		       catch (Exception e)
			{
		    	   System.out.println("Es wurde keine gültige Zahl eingegeben");
		    	   zahl = -1;
		    	   
		    	   
			}
			
		}
		
	   while (zahl<1 || zahl>10);
		System.out.println("Es wurde eine gültige Zahl eingegeben.Somit ist der Vorgang gültig. Die Zahl lautet:" + zahl);
	}

}
