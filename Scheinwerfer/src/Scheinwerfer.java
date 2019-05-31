import GLOOP.*;

public class Scheinwerfer {
	//========================================================================
	// OBJEKTE DER KLASSE
	//========================================================================
	private GLQuader Koerper;
	private GLZylinder Licht;
	private GLPrismoid Stand1;
	private GLPrismoid Stand2;
	private GLPrismoid Stand3;
	private GLQuader Plattform;
	
	private GLObjekt[] bauteile;
	//========================================================================
	// ATTRIBUTE DER KLASSE
	//========================================================================

	
	//========================================================================
	// KONSTRUKTOREN
	//========================================================================	

	public Scheinwerfer(int pX, int pY, int pZ, double pGroeße) {
		//Parameter auf Attribute übertragen
		
		//Scheinwerfer aufbauen
		Koerper = new GLWuerfel(20, 150, 20, 100);
		
		Licht = new GLZylinder(20, 150, 15, 50, 250);
		
		Stand1 = new GLPrismoid(10, 10, 100, 10, 10, 10, 10);
		
		Stand2 = new GLPrismoid(40, 40, 400, 40, 40, 40, 40);
		
		Stand3 = new GLPrismoid(50, 50, 500, 50, 50, 50, 50);
		
		Plattform = new GLQuader(20, 95, 20, 150, 10, 150);
		
		//Array aufbauen und befüllen zur Verwaltung der Objekte
		bauteile = new GLObjekt[6];
		bauteile[0] = Koerper;
		bauteile[1] = Licht;
		bauteile[2] = Stand1;
		bauteile[3] = Stand2;
		bauteile[4] = Stand2;
		bauteile[5] = Plattform;
		

	}

	//========================================================================
	// METHODEN & DIENSTE: ANFRAGEN (ohne Getter)
	//========================================================================

	//========================================================================
	// METHODEN & DIENSTE: AUFTRÄGE (ohne Setter)
	//========================================================================
	
	public void rechts(){
		Koerper.verschiebe(2.5, 0, 0);
		Plattform.verschiebe(2.5, 0, 0);
		Licht.verschiebe(2.5, 0, 0);
	}
	
	public void links(){
		Koerper.verschiebe(-2.5, 0, 0);
		Plattform.verschiebe(-2.5, 0, 0);
		Licht.verschiebe(-2.5, 0, 0);
	}
	
	public void hoch(){
		Koerper.drehe(0, 1.25, 0);
		Licht.drehe(0, 1.25, 0);
		Licht.drehe(20, 150, 20, 0, 0, 0);
	}
	
	public void runter(){
		Koerper.drehe(0, -1.25, 0);
		Licht.drehe(0, -1.25, 0);
		Licht.drehe(20, 150, 20, 0, 0, 0);
	}
		

	//========================================================================
	// METHODEN & DIENSTE: GETTER
	//========================================================================	
	
	
	//========================================================================
	// METHODEN & DIENSTE: SETTER
	//========================================================================	
	

}//Ende der Klasse
