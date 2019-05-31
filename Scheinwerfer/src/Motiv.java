import GLOOP.GLBoden;
import GLOOP.GLHimmel;

public class Motiv {
	//========================================================================
	// OBJEKTE DER KLASSE
	//========================================================================
	
	private GLHimmel derHimmel;
	private GLBoden derBoden;
	
	//========================================================================
	// ATTRIBUTE DER KLASSE
	//========================================================================

	//Hier werden alle Attribute der Klasse deklariert.

	
	//========================================================================
	// KONSTRUKTOREN
	//========================================================================	
	
	/*Hier stehen alle Kontruktoren der Klasse. Konstrukturen werden aufgerufen, wenn ein
	Objekt vom Typ dieser Klasse erzeugt werden soll. Dadurch wird der "Bauplan" quasi
	ausgeführt und ein konkretes Objekt erzeugt*/
	public Motiv() {
		derHimmel = new GLHimmel("gfx/Himmel.jpg");
		derBoden = new GLBoden("gfx/Gras.jpg");
	}

	//========================================================================
	// METHODEN & DIENSTE: ANFRAGEN (ohne Getter)
	//========================================================================

	/*Diese Klasse verfügt über keine Anfragen die kein Getter sind. Also
	 * muss an dieser Stelle nichts programmiert werden.*/
	
	//========================================================================
	// METHODEN & DIENSTE: AUFTRÄGE (ohne Setter)
	//========================================================================
	

	//========================================================================
	// METHODEN & DIENSTE: GETTER
	//========================================================================	

	
	//========================================================================
	// METHODEN & DIENSTE: SETTER
	//========================================================================	
	

	
}//Ende der Klasse Motiv
