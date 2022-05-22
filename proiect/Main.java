package proiect;

import java.io.*;
import java.util.*;

public class Main implements Serializable {

	public static void main(String[] args) {
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

		System.out.println(c5);

		System.out.println("Medie elev " + e1.getNume() + " " + e1.getPrenume() + " la materia " + m1.getDenumire()
				+ ": " + m1.getNote() + ": " + calcMedieMaterieDupaElev(e1, m1));

		System.out.println(
				"Medie generala elev " + e1.getNume() + " " + e1.getPrenume() + ": " + calcMedieGeneralaDupaElev(e1));

		System.out.println("Media clasei " + c5.getNume() + ": " + calcMedieClasa(c5));

		
		
		

		
		
		
		
	}

	public static double calcMedieMaterieDupaElev(Elev elev, Materie materie) {
		double suma = 0;
		for (Materie m : elev.getMaterii()) {
			if (m.getDenumire().equals(materie.getDenumire())) {
				for (int nota : materie.getNote()) {
					suma += nota;
				}
			}
		}
		return suma / materie.getNote().size();
	}

	public static double calcMedieGeneralaDupaElev(Elev elev) {
		double suma = 0;
		List<Double> medii = new ArrayList<Double>();
		for (Materie m : elev.getMaterii()) {
			double medie = calcMedieMaterieDupaElev(elev, m);
			medii.add(medie);
		}
		for (double med : medii) {
			suma += med;
		}
		return suma / medii.size();
	}

	public static double calcMedieClasa(Clasa clasa) {
		double suma = 0;
		List<Double> medii = new ArrayList<Double>();
		for (Elev e : clasa.getElevi()) {
			double medie = calcMedieGeneralaDupaElev(e);
			medii.add(medie);
		}
		for (double med : medii) {
			suma += med;
		}
		return suma / medii.size();
	}

	// sortare clasa dupa medii
}
