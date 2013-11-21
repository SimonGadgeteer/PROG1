import java.util.Scanner;

/**
 * Dieser Parser liest Benutzereingaben und wandelt sie in Befehle um. Bei jedem
 * Aufruf liest er eine Zeile von der Konsole und versucht, diese als einen
 * Befehl aus bis zu zwei Woertern zu interpretieren. Er liefert den Befehl als
 * ein Objekt der Klasse Befehl zurueck.
 * 
 * Der Parser verfuegt ueber einen Satz an bekannten Befehlen. Er
 * vergleicht die Eingabe mit diesen Befehlen. Wenn die Eingabe
 * keinen bekannten Befehl enthaelt, dann liefert der Parser ein als 
 * unbekannter Befehl gekennzeichnetes Objekt zurueck.
 * 
 * @author Dave Kramer, Simon Schwarz
<<<<<<< HEAD
 * @version 1.0
=======
 * @version 1.9
>>>>>>> branch 'master' of https://github.com/SimonGadgeteer/PROG1.git
 */
class Parser {
    // Lieferant fuer eingegebene Befehle
    private Scanner leser = new Scanner(System.in);

    /**
     * @return Der naechste Befehl des Benutzers.
     */
    public Befehl liefereBefehl() {
        Befehl befehl;
        String eingabezeile; // fuer die gesamte Eingabezeile

        System.out.print("> "); // Eingabeaufforderung
        eingabezeile = leser.nextLine();
        String[] woerter = eingabezeile.split(" ");

        if (woerter.length >= 2) {
            befehl = new Befehl(woerter[0], woerter[1]);
        } else {
            befehl = new Befehl(woerter[0], null);
        }
        return befehl;
    }

}
