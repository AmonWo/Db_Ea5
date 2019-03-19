package customer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {

    public static void main(String[] args){
        System.out.println("Bitte geben Sie Ihre Daten ein\n");
        Customer kundenDaten = new Customer(getUserInput(0), getUserInput(1), getUserInput(2), Integer.parseInt(getUserInput(3)), getUserInput(4), Integer.parseInt(getUserInput(5)), getUserInput(6), getUserInput(7));
    }
    private static String getUserInput(int count){
        /*in2 Bezeichnung des vom BufferedReader reservierten Speicherbereichs für die "getUserInput" Methode*/
        BufferedReader in2 = new BufferedReader (new InputStreamReader(System.in));
        /*input In diesem String wird die Nutzereingabe des jeweiligen "case" gespeichert.*/
        String input = null;
        /*Der Try-Catch Block fängt eine Exception ab*/
        try{
            switch(count){
                case 0: System.out.print("\n\tName:\n\n\t"); break;
                case 1: System.out.print("\n\tVorname:\n\n\t"); break;
                case 2: System.out.print("\n\tStrasse:\n\n\t"); break;
                case 3: System.out.print("\n\tHausnummer:\n\n\t"); break;
                case 4: System.out.print("\n\tStadt:\n\n\t"); break;
                case 5: System.out.print("\n\tPostleitzahl:\n\n\t"); break;
                case 6: System.out.print("\n\tTelefon:\n\n\t"); break;
                case 7: System.out.print("\n\tEmail:\n\n\t"); break;
            }
            input = in2.readLine();
        }catch(Exception e){
            System.out.println("Fehlerhafte Eingabe");
        }
        /*Der Wert von "input" wird an die Methode, welche "getUserInput" aufgerufen hat zurückgegeben*/
        return input;
    }
}
