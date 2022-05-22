package proiect;
import java.util.*;

public class Clasa {
	private String nume;
	private String diriginte;
	private List<Elev> elevi = new ArrayList<Elev>();
	
	
	public Clasa(String nume, String diriginte) {
		this.nume = nume;
		this.diriginte = diriginte;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getDiriginte() {
		return diriginte;
	}

	public void setDiriginte(String diriginte) {
		this.diriginte = diriginte;
	}

	public List<Elev> getElevi() {
		return elevi;
	}

	public void adaugaElev(Elev elev) {
		if (elevi.contains(elev)) {
			System.out.println("Elevul exista deja in lista.");
		} else {
			elevi.add(elev);
		}
	}

	@Override
	public String toString() {
		return "Clasa [nume=" + nume + ", diriginte=" + diriginte + ", elevi=" + elevi + "]";
	}

}
