import GLOOP.*;
/*Dieser Import sorgt dafür, dass wir alle GLOOP Klassen verwenden können*/

public class Scheinwerferszene {
	// ========================================================================
	// OBJEKTE DER KLASSE
	// ========================================================================

	// Kamera und Licht
	private GLEntwicklerkamera dieKamera;
	private GLLicht dasLicht;
	
	private Scheinwerfer Scheinwerfer;

	// Das Motiv wurde als eigene Klasse programmiert von der man hier ein Objekt
	// deklariert.
	private Motiv dasSzenenbild;

	// Objekte
	private GLKugel kugel;

	/*
	 * Hilfklassen die GLOOP zur Verfügung stellt. Die Tastatur soll später mit
	 * Druck auf "esc" das Programm beenden
	 */
	private GLTastatur dieTastatur;

	// ========================================================================
	// ATTRIBUTE DER KLASSE
	// ========================================================================

	// Diese Szene benötigt keine speziellen Attribute

	// ========================================================================
	// KONSTRUKTOREN
	// ========================================================================

	/*
	 * Hier stehen alle Kontruktoren der Klasse. Konstrukturen werden aufgerufen,
	 * wenn ein Objekt vom Typ dieser Klasse erzeugt werden soll. Dadurch wird der
	 * "Bauplan" quasi ausgeführt und ein konkretes Objekt erzeugt
	 */
	public Scheinwerferszene() {
		// Motiv erzeugen (Szenenbild aufbauen)
		dasSzenenbild = new Motiv();

		// Kamera erzeugen und korrekt einstellen
		dieKamera = new GLEntwicklerkamera(1000, 1000);
		dieKamera.setzePosition(1000, 1000, -1000);
		dieKamera.setzeBlickpunkt(0, 0, 0);

		// Licht erzeugen und ausrichten
		dasLicht = new GLLicht();
		dasLicht.setzePosition(1000, 1000, -1000);
		
		// Objekte erzeugen
		Scheinwerfer = new Scheinwerfer(50, 50, 50, 50);

		// Tastatur erzeugen
		dieTastatur = new GLTastatur();
	}

	// ========================================================================
	// METHODEN & DIENSTE: ANFRAGEN (ohne Getter)
	// ========================================================================

	/*
	 * Diese Klasse verfügt über keine Anfragen die kein Getter sind. Also muss an
	 * dieser Stelle nichts programmiert werden.
	 */

	// ========================================================================
	// METHODEN & DIENSTE: AUFTRÄGE (ohne Setter)
	// ========================================================================

	public void fuehreAus() {
		// Dieser Auftrag wartet bis die ESC-Taste gedrückt wird.
		while(!dieTastatur.enter()) {
			if(dieTastatur.oben()) {
				Scheinwerfer.hoch();
				
			}
			if(dieTastatur.unten()) {
				Scheinwerfer.runter();
				
			}
			if(dieTastatur.links()) {
				Scheinwerfer.links();
				
			}
			if(dieTastatur.rechts()) {
				Scheinwerfer.rechts();
				
			}
			
			}

				
			
		}

	// ========================================================================
	// METHODEN & DIENSTE: GETTER
	// ========================================================================

	/*
	 * Da alle Objekte geheim bleiben sollen und auch von "außen" kein Zugriff
	 * erfolgen soll gibt es keine Getter.
	 */

	// ========================================================================
	// METHODEN & DIENSTE: SETTER
	// ========================================================================

	/*
	 * Da alle Objekte geheim bleiben sollen und auch von "außen" kein Zugriff
	 * erfolgen soll gibt es keine Setter.
	 */


}// Ende der Klasse Scheinwerferszene