

public class Programmtest {

	public static void main(String[] args) {
		String mitteilung = "Beispieltext";// Würde hier nur "" stehen, wird die Schleife nicht ausgeführt. Der Wert ist da nämlich schon 
		//unter null, weswegen ein Ausführen der Scxhleife laut der Programmierung keinen Sinn mehr machen würde. 
		while (mitteilung.length() > 0 )
		{System.out.println(mitteilung);
		mitteilung = mitteilung.substring(0,mitteilung.length()-1);
		}

	}

}
