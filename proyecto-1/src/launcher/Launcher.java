package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student prueba = new Student(130334, "Pineiro", "Gonzalo", "GonzaloPineiro.uni@mail.com", "https://github.com/MightyPercival", "/proyecto-1/src/images/Foto el 25-8-22 a la(s) 1.32 p. m.-2-2.jpg");
            	SimplePresentationScreen prueba1 = new SimplePresentationScreen(prueba);
            	prueba1.setVisible(true);
            }
        });
    }
}