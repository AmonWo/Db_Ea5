package customer;

import java.io.*;
import java.lang.String;

/*
 *Einfuehrung in die Programmierung - Einsendeufgabe 6 - Kontaktliste
 *Dateiname: 	Contact.java
 *Beschreibung: 	Die Klasse "Contact" mit deklaration der Variablen, überladen des Konstruktors und toString-Methode zur Ausgabe der Werte.
 *				Die Klasse wird von der ebenfalls in diesem Ordner befindlichen Datei "TestContact.java" genutzt. Mit dieser lässt sich das Programm auf Funktion prüfen.
 *
 *Matrikelnummer: 300328
 *@author Amon Wondra (amon.wondra@stud.fh-luebeck.de)
 *@version 1.0, 11/2017
 *Java-Version: 1.8.0_151
 */
/*Deklaration von Variablen in welchen Nutzerdaten bzw. Default-Daten gespeichert werden sollen*/
public class Customer{

    protected String name;
    protected String vorname;
    protected String strasse;
    protected int hausNr;
    protected String stadt;
    protected int plz;
    protected String telefon;
    protected String email;

        public Customer(){
            this("Mustermann", "Max", "Musterstrasse", 9, "Musterstadt", 12345, "0123456789", "muster@mail.de");
        }
        /*Konstruktor, gleichnamig mit der Klasse. Wenn er von einer Methode aufgerufen wird, können Werte in den Variablen gespeichert werden.
         *@param name String zum speichern des Nachnamens
         *@param vorname String zum speichern des Vornamens
         *@param strasse String zum speichern des Strassennamens
         *@param hausNr Integer zum speichern der Hausnummer
         *@param stadt String zum speichern des Namens der Stadt
         *@param plz Integer zum speichern der Postleitzahl
         *@param telefon String zum speichern der Telefonnummer (Ich habe einen String genutzt, da die Ausgabe von Integern die "0" am Anfang der Nummer ausblendet
         *@param email String zum speichern der E-Mail Adresse
         */
        public Customer(String name, String vorname, String strasse, int hausNr, String stadt, int plz, String telefon, String email){
            this.name = name;
            this.vorname = vorname;
            this.strasse = strasse;
            this.hausNr = hausNr;
            this.stadt = stadt;
            this.plz = plz;
            this.telefon = telefon;
            this.email = email;
        }
        /*Mit dieser Methoden werden Datentypen in einen String umgewandelt und können dann zusammen ausgegeben werden*/
        public String toString(){
            return "\n\tKontaktdaten:\n\n\t\t"+"\n\t\tName:\t\t"+this.name+"\n\t\tVorname:\t"+this.vorname+"\n\t\tStrasse:\t"+this.strasse+"\n\t\tHausnummer:\t"+this.hausNr+"\n\t\tStadt:\t\t"+this.stadt+"\n\t\tPostleitzahl:\t"+this.plz+"\n\t\tTelefon:\t"+this.telefon+"\n\t\tEmail:\t\t"+this.email+"\n";
        }
}