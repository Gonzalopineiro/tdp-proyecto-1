package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.time.LocalDateTime;    
import java.time.format.DateTimeFormatter;  

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField textField_LU;
	private JTextField textField_Apellido;
	private JTextField textField_Nombre;
	private JTextField textField_Email;
	private JTextField textField_Github;
	private JLabel lblLU;
	private JLabel lblApellido;
	private JLabel lblNombre;
	private JLabel lblEmail;
	private JLabel lblGHURL;
	private JLabel lblCrecionVentana;
	private JLabel lblNewLabel;

	public SimplePresentationScreen(Student studentData) {
		
		//Preguntar imagen y gitignore
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png"))); 
		this.studentData = studentData;
		ImageIcon pic = new ImageIcon("/proyecto-1/src/images/tdp.png");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(new JLabel(pic));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		
		//Time information
		DateTimeFormatter formatoDia = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");  
		LocalDateTime tiempoDeCreacion = LocalDateTime.now(); 
		
		 
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 446, 212);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		tabInformation.setLayout(null);
		
		textField_LU = new JTextField();
		textField_LU.setBounds(92, 16, 312, 26);
		tabInformation.add(textField_LU);
		textField_LU.setColumns(10);
		textField_LU.setText(Integer.toString(studentData.getId()));
		
		textField_Apellido = new JTextField();
		textField_Apellido.setBounds(92, 43, 312, 26);
		tabInformation.add(textField_Apellido);
		textField_Apellido.setColumns(10);
		textField_Apellido.setText(studentData.getLastName());
		
		textField_Nombre = new JTextField();
		textField_Nombre.setBounds(92, 69, 312, 26);
		tabInformation.add(textField_Nombre);
		textField_Nombre.setColumns(10);
		textField_Nombre.setText(studentData.getFirstName());
		
		textField_Email = new JTextField();
		textField_Email.setBounds(92, 96, 312, 26);
		tabInformation.add(textField_Email);
		textField_Email.setColumns(10);
		textField_Email.setText(studentData.getMail());
		
		textField_Github = new JTextField();
		textField_Github.setBounds(92, 123, 312, 26);
		tabInformation.add(textField_Github);
		textField_Github.setColumns(10);
		textField_Github.setText(studentData.getGithubURL());
		
		lblLU = new JLabel("LU");
		lblLU.setBounds(19, 21, 61, 16);
		tabInformation.add(lblLU);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(19, 48, 61, 16);
		tabInformation.add(lblApellido);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(19, 74, 61, 16);
		tabInformation.add(lblNombre);
		
		lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(19, 101, 61, 16);
		tabInformation.add(lblEmail);
		
		lblGHURL = new JLabel("GitHub URL");
		lblGHURL.setBounds(19, 128, 72, 16);
		tabInformation.add(lblGHURL);
		contentPane.add(tabbedPane);
		
		lblCrecionVentana = new JLabel("Esta ventana fue generada el "+ formatoDia.format(tiempoDeCreacion) + " a las " + formatoHora.format(tiempoDeCreacion) );
		lblCrecionVentana.setBounds(15, 206, 436, 16);
		contentPane.add(lblCrecionVentana);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/Foto el 25-8-22 a la(s) 1.32 p. m.-2-2.jpg")));
		lblNewLabel.setBounds(451, 30, 158, 170);
		contentPane.add(lblNewLabel);
	}
}
