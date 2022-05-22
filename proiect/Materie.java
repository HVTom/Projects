package proiect;
import java.util.*;

//Materie
public class Materie {
	private String denumire;
	private String profesor;
	private List<Integer> note = new ArrayList<Integer>();

	
	public Materie(String denumire, String profesor) {
		this.denumire = denumire;
		this.profesor = profesor;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public String getProfesor() {
		return profesor;
	}

	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}

	public List<Integer> getNote() {
		return note;
	}

	public void adaugaNota(String n) {
		String[] split = n.split(",");
		for (String s : split) {
			int nota = Integer.parseInt(s);
			note.add(nota);
		}
	}

	@Override
	public String toString() {
		return "Materie [denumire=" + denumire + ", profesor=" + profesor + ", note=" + note + "]";
	}

}
