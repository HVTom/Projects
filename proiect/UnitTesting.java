package proiect;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnitTesting {

	
	@Test
	public void adaugaNota() {
		Materie m1 = new Materie("Engleza", "Pop"); 
		m1.adaugaNota("5,8");
		Assertions.assertFalse(m1.getNote().isEmpty());
		Assertions.assertEquals(2, m1.getNote().size());
	}
	
	@Test
	void adaugaMaterie() {
		Materie m1 = new Materie("Engleza", "Pop"); 
		m1.adaugaNota("5,8");
		Elev e1 = new Elev("Andrei", "Andr", 12, "Cls. a V-a");
		e1.adaugaMaterie(m1);
		Assertions.assertEquals(1, e1.getMaterii().size());
	}
	
	@Test
	void adaugaElev() {
		Materie m1 = new Materie("Engleza", "Pop"); 
		m1.adaugaNota("5,8");
		Materie m2 = new Materie("Mate", "Emilia");
		m2.adaugaNota("7,7");
		Elev e1 = new Elev("Andrei", "Andr", 12, "Cls. a V-a");
		e1.adaugaMaterie(m1);
		Elev e2 = new Elev("Cosmin", "Miron", 12, "Cls. a V-a");
		e2.adaugaMaterie(m2);
		Clasa c5 = new Clasa("Cls. a V-a", "Dirig");
		c5.adaugaElev(e1); c5.adaugaElev(e2);
		Assertions.assertFalse(c5.getElevi().isEmpty());
		Assertions.assertEquals(2, c5.getElevi().size());
	}
	
	
	@Test
	void CalcMedieMaterieDupaElev() {
		Main test = new Main();
		Materie m1 = new Materie("Engleza", "Pop"); m1.adaugaNota("5,8");
		Materie m2 = new Materie("Mate", "Emilia"); m2.adaugaNota("7,7");
		Materie m3 = new Materie("Romana", "Roxan"); m3.adaugaNota("6,2");
		Materie m4 = new Materie("Biologie", "Clain"); m4.adaugaNota("10,10");

		Elev e1 = new Elev("Andrei", "Andr", 12, "Cls. a V-a");
		e1.adaugaMaterie(m1); e1.adaugaMaterie(m2);	e1.adaugaMaterie(m3); e1.adaugaMaterie(m4);
		double rezultat = test.calcMedieMaterieDupaElev(e1, m1);
		assertEquals(6.5, rezultat);
	}

	

	@Test
	void testCalcMedieGeneralaDupaElev() {
		Main test = new Main();
		Materie m1 = new Materie("Engleza", "Pop"); m1.adaugaNota("5,8");
		Materie m2 = new Materie("Mate", "Emilia");	m2.adaugaNota("7,7");
		Materie m3 = new Materie("Romana", "Roxan"); m3.adaugaNota("6,2");
		Materie m4 = new Materie("Biologie", "Clain"); m4.adaugaNota("10,10");

		Elev e1 = new Elev("Andrei", "Andr", 12, "Cls. a V-a");
		e1.adaugaMaterie(m1);
		e1.adaugaMaterie(m2);
		e1.adaugaMaterie(m3);
		e1.adaugaMaterie(m4);

		assertEquals(6.875, test.calcMedieGeneralaDupaElev(e1));
	}

	@Test
	void testCalcMedieClasa() {
		Main test = new Main();
		Materie m1 = new Materie("Engleza", "Pop");
		m1.adaugaNota("5,8");
		Materie m2 = new Materie("Mate", "Emilia");
		m2.adaugaNota("7,7");
		Materie m3 = new Materie("Romana", "Roxan");
		m3.adaugaNota("6,2");
		Materie m4 = new Materie("Biologie", "Clain");
		m4.adaugaNota("10,10");

		Elev e1 = new Elev("Andrei", "Andr", 12, "Cls. a V-a");
		e1.adaugaMaterie(m1);
		e1.adaugaMaterie(m2);
		e1.adaugaMaterie(m3);
		e1.adaugaMaterie(m4);

		Materie m11 = new Materie("Engleza", "Pop");
		m11.adaugaNota("5,3");
		Materie m12 = new Materie("Mate", "Emilia");
		m12.adaugaNota("4,4");
		Materie m13 = new Materie("Romana", "Roxan");
		m13.adaugaNota("6,7");
		Materie m14 = new Materie("Biologie", "Clain");
		m14.adaugaNota("6,8");

		Elev e2 = new Elev("Cosmin", "Miron", 12, "Cls. a V-a");
		e2.adaugaMaterie(m11);
		e2.adaugaMaterie(m12);
		e2.adaugaMaterie(m13);
		e2.adaugaMaterie(m14);

		Clasa c5 = new Clasa("Cls. a V-a", "Dirig");
		c5.adaugaElev(e1);
		c5.adaugaElev(e2);
		
		assertEquals(6.125, test.calcMedieClasa(c5));
	}

}
