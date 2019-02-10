import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculatrice2 extends JFrame implements ActionListener{
	
	private JButton btPourcent = new JButton("%");
	private JButton btRacine = new JButton("âˆš");
	private JButton btXCarre = new JButton("XÂ²");
	private JButton bt1surX = new JButton("1/X");
	private JButton btCE = new JButton("CE");
	private JButton btC = new JButton("C");
	private JButton btErr = new JButton("<");
	private JButton btDivise = new JButton("Ã·");
	private JButton bt7 = new JButton("7");
	private JButton bt8 = new JButton("8");
	private JButton bt9 = new JButton("9");
	private JButton btX = new JButton("X");
	private JButton bt4 = new JButton("4");
	private JButton bt5 = new JButton("5");
	private JButton bt6 = new JButton("6");
	private JButton btMoins = new JButton("-");
	private JButton bt1 = new JButton("1");
	private JButton bt2 = new JButton("2");
	private JButton bt3 = new JButton("3");
	private JButton btPlus = new JButton("+");
	private JButton btPlusMoins = new JButton("Â±");
	private JButton bt0 = new JButton("0");
	private JButton btVirgule = new JButton(",");
	private JButton btEgal = new JButton("=");
	
	private JPanel background = new JPanel();
	
	private JTextField txtOperation = new JTextField();
	private JTextField txtResultat = new JTextField();
	
	private JLabel lbTitre = new JLabel("Calculatrice");
	private float valeur;
	private String valeurOperateur;
	private String operateur;
	private ArrayList <Float> tableau = new ArrayList <Float>();
	private String tableauOperateur[];
	
	private String affichage;
	
	public Calculatrice2() {
		// c'est le constructeur de la classe
		this.valeur = (float) 0;
		this.txtResultat.setText("0");
		
		this.setTitle("Calculatrice");
		this.setBounds(200, 200, 340, 534);
		// longueur, largeur d'apparition,
		// dimensions largeur, dimensions longueur
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		// placement des objets graphiques
//		this.lbTitre.setBounds(50, 40, 350, 30);
//		Font unePolice = new Font("Arial", Font.ITALIC, 30);
//		this.lbTitre.setFont(unePolice);
//		this.add(this.lbTitre);
		
		this.txtOperation.setBounds(1, 95, 333, 21);
		Font Operation = new Font("Calibri", Font.ROMAN_BASELINE, 17);
		this.txtOperation.setFont(Operation);
		this.txtOperation.setBackground(Color.lightGray);
		this.txtOperation.setHorizontalAlignment(JTextField.RIGHT);
		this.add(this.txtOperation);
		
		this.txtResultat.setBounds(1, 124, 333, 45);
		Font Resultat = new Font("Calibri Corp", Font.BOLD, 45);
		this.txtResultat.setFont(Resultat);
		this.txtResultat.setBackground(Color.lightGray);
		this.txtResultat.setHorizontalAlignment(JTextField.RIGHT);
		this.add(this.txtResultat);
		
		this.btPourcent.setBounds(1,  187,  82, 52);
		Font Pourcent = new Font("Calibri", Font.BOLD, 20);
		this.btPourcent.setFont(Pourcent);
		this.btPourcent.setBackground(Color.lightGray);
		this.add(this.btPourcent);
		
		this.btRacine.setBounds(84,  187,  82, 52);
		Font Racine = new Font("Calibri", Font.BOLD, 20);
		this.btRacine.setFont(Racine);
		this.btRacine.setBackground(Color.lightGray);
		this.add(this.btRacine);
		
		this.btXCarre.setBounds(167, 187, 82, 52);
		Font XCarre = new Font("Calibri", Font.BOLD, 20);
		this.btXCarre.setFont(XCarre);
		this.btXCarre.setBackground(Color.lightGray);
		this.add(this.btXCarre);
		
		this.bt1surX.setBounds(250, 187, 82, 52);
		Font UnsurX = new Font("Calibri", Font.BOLD, 20);
		this.bt1surX.setFont(UnsurX);
		this.bt1surX.setBackground(Color.lightGray);
		this.add(this.bt1surX);
		
		this.btCE.setBounds(1, 240, 82, 52);
		Font CE = new Font("Calibri", Font.BOLD, 20);
		this.btCE.setFont(CE);
		this.btCE.setBackground(Color.lightGray);
		this.add(this.btCE);
		
		this.btC.setBounds(84, 240, 82, 52);
		Font C = new Font("Calibri", Font.BOLD, 20);
		this.btC.setFont(C);
		this.btC.setBackground(Color.lightGray);
		this.add(this.btC);
		
		this.btErr.setBounds(167, 240, 82, 52);
		Font Err = new Font("Calibri", Font.BOLD, 20);
		this.btErr.setFont(Err);
		this.btErr.setBackground(Color.lightGray);
		this.add(this.btErr);
		
		this.btDivise.setBounds(250, 240, 82, 52);
		Font Divise = new Font("Calibri", Font.BOLD, 20);
		this.btDivise.setFont(Divise);
		this.btDivise.setBackground(Color.lightGray);
		this.add(this.btDivise);
		
		this.bt7.setBounds(1, 293, 82, 52);
		Font Sept = new Font("Calibri", Font.BOLD, 20);
		this.bt7.setFont(Sept);
		this.bt7.setBackground(Color.WHITE);
		this.add(this.bt7);
		
		this.bt8.setBounds(84, 293, 82, 52);
		Font Huit = new Font("Calibri", Font.BOLD, 20);
		this.bt8.setFont(Huit);
		this.bt8.setBackground(Color.WHITE);
		this.add(this.bt8);
		
		this.bt9.setBounds(167, 293, 82, 52);
		Font Neuf = new Font("Calibri", Font.BOLD, 20);
		this.bt9.setFont(Neuf);
		this.bt9.setBackground(Color.WHITE);
		this.add(this.bt9);
		
		this.btX.setBounds(250, 293, 82, 52);
		Font X = new Font("Calibri", Font.BOLD, 20);
		this.btX.setFont(X);
		this.btX.setBackground(Color.lightGray);
		this.add(this.btX);
		
		this.bt4.setBounds(1, 346, 82, 52);
		Font Quatre = new Font("Calibri", Font.BOLD, 20);
		this.bt4.setFont(Quatre);
		this.bt4.setBackground(Color.WHITE);
		this.add(this.bt4);
		
		this.bt5.setBounds(84, 346, 82, 52);
		Font Cinq = new Font("Calibri", Font.BOLD, 20);
		this.bt5.setFont(Cinq);
		this.bt5.setBackground(Color.WHITE);
		this.add(this.bt5);
		
		this.bt6.setBounds(167, 346, 82, 52);
		Font Six = new Font("Calibri", Font.BOLD, 20);
		this.bt6.setFont(Six);
		this.bt6.setBackground(Color.WHITE);
		this.add(this.bt6);
		
		this.btMoins.setBounds(250, 346, 82, 52);
		Font Moins = new Font("Calibri", Font.BOLD, 20);
		this.btMoins.setFont(Moins);
		this.btMoins.setBackground(Color.lightGray);
		this.add(this.btMoins);
		
		this.bt1.setBounds(1, 399, 82, 52);
		Font Un = new Font("Calibri", Font.BOLD, 20);
		this.bt1.setFont(Un);
		this.bt1.setBackground(Color.WHITE);
		this.add(this.bt1);
		
		this.bt2.setBounds(84, 399, 82, 52);
		Font Deux = new Font("Calibri", Font.BOLD, 20);
		this.bt2.setFont(Deux);
		this.bt2.setBackground(Color.WHITE);
		this.add(this.bt2);
		
		this.bt3.setBounds(167, 399, 82, 52);
		Font Trois = new Font("Calibri", Font.BOLD, 20);
		this.bt3.setFont(Trois);
		this.bt3.setBackground(Color.WHITE);
		this.add(this.bt3);
		
		this.btPlus.setBounds(250, 399, 82, 52);
		Font Plus = new Font("Calibri", Font.BOLD, 20);
		this.btPlus.setFont(Plus);
		this.btPlus.setBackground(Color.lightGray);
		this.add(this.btPlus);
		
		this.btPlusMoins.setBounds(1, 452, 82, 52);
		Font PlusMoins = new Font("Calibri", Font.BOLD, 20);
		this.btPlusMoins.setFont(PlusMoins);
		this.btPlusMoins.setBackground(Color.lightGray);
		this.add(this.btPlusMoins);
		
		this.bt0.setBounds(84, 452, 82, 52);
		Font Zero = new Font("Calibri", Font.BOLD, 20);
		this.bt0.setFont(Zero);
		this.bt0.setBackground(Color.WHITE);
		this.add(this.bt0);
		
		this.btVirgule.setBounds(167, 452, 82, 52);
		Font Virgule = new Font("Calibri", Font.BOLD, 20);
		this.btVirgule.setFont(Virgule);
		this.btVirgule.setBackground(Color.lightGray);
		this.add(this.btVirgule);
		
		this.btEgal.setBounds(250, 452, 82, 52);
		Font Egal = new Font("Calibri", Font.BOLD, 20);
		this.btEgal.setFont(Egal);
		this.btEgal.setBackground(Color.lightGray);
		this.add(this.btEgal);
		
		this.background.setBounds(0, 0, 340, 534);
		this.background.setBackground(Color.lightGray);
		this.add(this.background);
		
		
		// Rendre les boutons cliquables
		
		this.btPourcent.addActionListener(this);
		this.btRacine.addActionListener(this);
		this.btXCarre.addActionListener(this);
		this.bt1surX.addActionListener(this);
		
		this.btCE.addActionListener(this);
		this.btC.addActionListener(this);
		this.btErr.addActionListener(this);
		this.btDivise.addActionListener(this);
		
		this.btX.addActionListener(this);
		
		this.btMoins.addActionListener(this);
		
		this.btPlus.addActionListener(this);
		
		this.btPlusMoins.addActionListener(this);
		
		this.btVirgule.addActionListener(this);
		this.btEgal.addActionListener(this);
		
		this.bt0.addActionListener(this);
		this.bt1.addActionListener(this);
		this.bt2.addActionListener(this);
		this.bt3.addActionListener(this);
		this.bt4.addActionListener(this);
		this.bt5.addActionListener(this);
		this.bt6.addActionListener(this);
		this.bt7.addActionListener(this);
		this.bt8.addActionListener(this);
		this.bt9.addActionListener(this);
		
//		this.valeur = Float.parseFloat(affichage);			Pour convertir en float
//		this.valeur = Integer.parseInt(affichage);			pour convertir en Int
//		this.valeur = String.parseString(affichage);		pour convertir en String
		
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Calculatrice2();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//this.affichage = this.txtOperation.getText();
		this.operateur = "";
		
		if (e.getSource() == this.btPourcent) {
			this.txtOperation.setText(this.txtOperation.getText() + " % ");
		} else if (e.getSource() == this.btRacine) {
			this.txtOperation.setText(this.txtOperation.getText() + " âˆš ");
		} else if (e.getSource() == this.btXCarre) {
			this.txtOperation.setText(this.txtOperation.getText() + " XÂ² ");
		} else if (e.getSource() == this.bt1surX) {
			this.txtOperation.setText(this.txtOperation.getText() + " 1/X ");
		} else if (e.getSource() == this.btCE) {
			this.txtOperation.setText("");
			this.txtResultat.setText("0");
		} else if (e.getSource() == this.btC) {
			this.txtOperation.setText("");
			this.txtResultat.setText("0");
		} else if (e.getSource() == this.btErr) {
			this.txtOperation.setText("");
		} else if (e.getSource() == this.btDivise) {
			this.txtOperation.setText(this.txtOperation.getText() + " / ");
		} 
		else if (e.getSource() == this.bt7) 
		{
			this.txtOperation.setText(this.txtOperation.getText() + "7");
			this.affichage = this.txtOperation.getText();
			this.valeur = Float.parseFloat(this.affichage);
			
			this.tableau.add(this.valeur);
			
			for(float valeur : tableau)
			{
				System.out.println(valeur + "-");
			}
		} 
		else if (e.getSource() == this.bt8) {
			this.txtOperation.setText(this.txtOperation.getText() + "8");
		} else if (e.getSource() == this.bt9) {
			this.txtOperation.setText(this.txtOperation.getText() + "9");
		} else if (e.getSource() == this.btX) {
			this.txtOperation.setText(this.txtOperation.getText() + " * ");
			int j = 0;
			this.tableauOperateur[j] += this.valeurOperateur;
			System.out.println(this.tableauOperateur[0]); // ajout faisant une erreur
		} else if (e.getSource() == this.bt4) {
			this.txtOperation.setText(this.txtOperation.getText() + "4");
		} else if (e.getSource() == this.bt5) {
			this.txtOperation.setText(this.txtOperation.getText() + "5");
		} else if (e.getSource() == this.bt6) {
			this.txtOperation.setText(this.txtOperation.getText() + "6");
		} else if (e.getSource() == this.btMoins) {
			this.txtOperation.setText(this.txtOperation.getText() + " - ");
		} else if (e.getSource() == this.bt1) {
			this.txtOperation.setText(this.txtOperation.getText() + "1");
		} else if (e.getSource() == this.bt2) {
			this.txtOperation.setText(this.txtOperation.getText() + "2");
		} else if (e.getSource() == this.bt3) {
			this.txtOperation.setText(this.txtOperation.getText() + "3");
		} else if (e.getSource() == this.btPlus) {
			this.txtOperation.setText(this.txtOperation.getText() + " + ");
		} else if (e.getSource() == this.btPlusMoins) {
			this.txtOperation.setText(this.txtOperation.getText() + " Â± ");
		} else if (e.getSource() == this.bt0) {
			this.txtOperation.setText(this.txtOperation.getText() + "0");
		} else if (e.getSource() == this.btVirgule) {
			this.txtOperation.setText(this.txtOperation.getText() + ",");
		} else if (e.getSource() == this.btEgal) {

			this.txtResultat.setText("- 0");

		}
	}
}
