package proiect;

import java.awt.*;
import javax.swing.*;

public class GUI {

	String materie[] = { "Alege materie", "Matematica", "Romana", "Engleza", "Biologie", "Geografie", "Franceza",
			"TIC" };

	public GUI() {
		JLabel labelMaterie = new JLabel("Materii:");
		labelMaterie.setBounds(10, 20, 80, 25);
		JLabel labelProfesor = new JLabel("Profesor:");
		labelProfesor.setBounds(10, 50, 80, 25);
		JLabel labelNote = new JLabel("Note:");
		labelNote.setBounds(10, 80, 80, 25);
		JLabel labelNume = new JLabel("Nume:");
		labelNume.setBounds(10, 110, 80, 25);
		JLabel labelPrenume = new JLabel("Prenume:");
		labelPrenume.setBounds(10, 140, 80, 25);
		JLabel labelVarsta = new JLabel("Varsta:");
		labelVarsta.setBounds(10, 170, 80, 25);
		JLabel labelClasa = new JLabel("Clasa:");
		labelClasa.setBounds(10, 200, 80, 25);
		JLabel labelDiriginte = new JLabel("Diriginte:");
		labelDiriginte.setBounds(10, 230, 80, 25);
		
		SpinnerListModel listaMaterii = new SpinnerListModel(materie);
		JSpinner materii = new JSpinner(listaMaterii);
		materii.setBounds(100, 20, 165,25);
		JTextField profesor = new JTextField();
		profesor.setBounds(100, 50, 165,25);
		JTextField note = new JTextField();
		note.setBounds(100, 80, 165,25);
		JTextField nume = new JTextField();
		nume.setBounds(100, 110, 165, 25);
		JTextField prenume = new JTextField();
		prenume.setBounds(100, 140, 165, 25);
		JTextField varsta = new JTextField();
		varsta.setBounds(100, 170, 165, 25);
		JTextField clasa = new JTextField();
		clasa.setBounds(100, 200, 165, 25);
		JTextField diriginte = new JTextField();
		diriginte.setBounds(100, 230, 165, 25);
		
		JTextField textFieldMedieMaterie = new JTextField();
		textFieldMedieMaterie.setBounds(600, 20, 165, 25);
		
		JTextField textFieldMedieGenerala = new JTextField();
		textFieldMedieGenerala.setBounds(600, 60, 165, 25);
		
		JTextField textFieldMedieClasa = new JTextField();
		textFieldMedieClasa.setBounds(600, 100, 165, 25);
		
		
		
		JButton butonAdauga = new JButton();
		butonAdauga.setBounds(100, 260, 165, 25);
		butonAdauga.setText("Adauga Elev:");
		
		JButton butonCalcMedieMaterie = new JButton();
		butonCalcMedieMaterie.setBounds(400, 20, 165, 25);
		butonCalcMedieMaterie.setText("Medie materie:");
		
		JButton butonCalcMedieGenerala = new JButton();
		butonCalcMedieGenerala.setBounds(400, 60, 165, 25);
		butonCalcMedieGenerala.setText("Medie Generala:");
		
		JButton butonCalcMedieClasa = new JButton();
		butonCalcMedieClasa.setBounds(400, 100, 165, 25);
		butonCalcMedieClasa.setText("Medie Clasa:");
		
		
		
		

		JPanel panel = new JPanel();
		// panel.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.setLayout(null);
		panel.add(labelMaterie);
		panel.add(materii);
		panel.add(labelProfesor);
		panel.add(profesor);
		panel.add(labelNote);
		panel.add(note);
		panel.add(labelNume);
		panel.add(nume);
		panel.add(labelPrenume);
		panel.add(prenume);
		panel.add(labelVarsta);
		panel.add(varsta);
		panel.add(labelClasa);
		panel.add(clasa);
		panel.add(labelDiriginte);
		panel.add(diriginte);
		panel.add(butonAdauga);
		panel.add(butonCalcMedieMaterie);
		panel.add(textFieldMedieMaterie);
		panel.add(butonCalcMedieGenerala);
		panel.add(textFieldMedieGenerala);
		panel.add(butonCalcMedieClasa);
		panel.add(textFieldMedieClasa);
		
		
		JFrame frame = new JFrame();
		frame.setSize(900, 700);
		frame.setTitle("School Management");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);

		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new GUI();

	}

}
