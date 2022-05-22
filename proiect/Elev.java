package proiect;
import java.util.*;

//Elev
public class Elev {
	private String nume;
	private String prenume;
	private int varsta;
	private String clasa;
	private List<Materie> materii = new ArrayList<Materie>();
	
	public Elev(String nume, String prenume, int varsta, String clasa) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.clasa = clasa;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public String getClasa() {
		return clasa;
	}

	public void setClasa(String clasa) {
		this.clasa = clasa;
	}

	public List<Materie> getMaterii() {
		return materii;
	}

	public void adaugaMaterie(Materie m) {
		if (materii.contains(m)) {
			System.out.println(m + " exista deja in lista.");
		} else {
			materii.add(m);
		}
	}

	@Override
	public String toString() {
		return "Elev [nume=" + nume + ", prenume=" + prenume + ", varsta=" + varsta + ", clasa=" + clasa + ", materii="
				+ materii + "]";
	}

}
