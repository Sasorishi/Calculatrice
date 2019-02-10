import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculatrice extends JFrame implements ActionListener
{
	private JTextField valeur1 = new JTextField();
	private JTextField valeur2 = new JTextField();
	
	private JPanel background = new JPanel();
	
	//Button
	private JButton btAide = new JButton("Aide");
	private JButton btAddition = new JButton("+");
	private JButton btSoustraction = new JButton("-");
	private JButton btDivision = new JButton("÷");
	private JButton btMultiplication = new JButton("x");
	private JButton btVirgule = new JButton(",");
	private JButton btEffacer = new JButton("C");
	private JButton btPourcentage = new JButton("%");
	private JButton btCos = new JButton("cos");
	private JButton btSin = new JButton("sin");
	private JButton btTan = new JButton("tan");
	private JButton btResultat = new JButton("=");
	private JButton bt1 = new JButton("1");
	private JButton bt2 = new JButton("2");
	private JButton bt3 = new JButton("3");
	private JButton bt4 = new JButton("4");
	private JButton bt5 = new JButton("5");
	private JButton bt6 = new JButton("6");
	private JButton bt7 = new JButton("7");
	private JButton bt8 = new JButton("8");
	private JButton bt9 = new JButton("9");
	private JButton bt0 = new JButton("0");
	private JButton btG = new JButton("(");
	private JButton btD = new JButton(")");
	private JButton btRacine = new JButton("Ѵ");
	private JButton btExposant = new JButton("x²");
	private JButton btPi = new JButton("π");
	private JButton btNegate = new JButton("+-");
	
	//Menu
	private ImageIcon Menu = new ImageIcon("img/list.png");
	private JButton btMenu = new JButton(Menu);
	private boolean menu = false;
	
	//Menu Bar
	private JMenuBar uneBarre = new JMenuBar();
	
	private JMenu mnAide = new JMenu("Aide");
	
	private JMenuItem itemAide = new JMenuItem("Aide");
	
	//Calcul
	private double calcul = 0.0;
	private double value1 = 0.0;
	private double value2 = 0.0;
	private boolean newCalcul = false;
	
	//Conversion decimal format
	DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.US);
	DecimalFormat df = new DecimalFormat("#.##########", otherSymbols);
	
	public Calculatrice()
	{
		this.setTitle("Ma calculatrice");
		this.setBounds(700, 200, 426, 752);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		this.setJMenuBar(this.uneBarre);
		this.uneBarre.add(this.mnAide);
		
		this.mnAide.add(this.itemAide);
		this.itemAide.addActionListener(this);
		
		//Button 1 - 0
		bt1.setBackground(new java.awt.Color(255,255,255));
		this.bt1.addActionListener(this);
		this.bt1.setBounds(50, 400, 60, 60);
		this.add(this.bt1);
		
		bt2.setBackground(new java.awt.Color(255,255,255));
		this.bt2.addActionListener(this);
		this.bt2.setBounds(115, 400, 60, 60);
		this.add(this.bt2);
		
		bt3.setBackground(new java.awt.Color(255,255,255));
		this.bt3.addActionListener(this);
		this.bt3.setBounds(180, 400, 60, 60);
		this.add(this.bt3);
		
		bt4.setBackground(new java.awt.Color(255,255,255));
		this.bt4.addActionListener(this);
		this.bt4.setBounds(50, 465, 60, 60);
		this.add(this.bt4);
		
		bt5.setBackground(new java.awt.Color(255,255,255));
		this.bt5.addActionListener(this);
		this.bt5.setBounds(115, 465, 60, 60);
		this.add(this.bt5);
		
		bt6.setBackground(new java.awt.Color(255,255,255));
		this.bt6.addActionListener(this);
		this.bt6.setBounds(180, 465, 60, 60);
		this.add(this.bt6);
		
		bt7.setBackground(new java.awt.Color(255,255,255));
		this.bt7.addActionListener(this);
		this.bt7.setBounds(50, 530, 60, 60);
		this.add(this.bt7);
		
		bt8.setBackground(new java.awt.Color(255,255,255));
		this.bt8.addActionListener(this);
		this.bt8.setBounds(115, 530, 60, 60);
		this.add(this.bt8);
		
		bt9.setBackground(new java.awt.Color(255,255,255));
		this.bt9.addActionListener(this);
		this.bt9.setBounds(180, 530, 60, 60);
		this.add(this.bt9);
		
		bt0.setBackground(new java.awt.Color(255,255,255));
		this.bt0.addActionListener(this);
		this.bt0.setBounds(50, 600, 190, 60);
		this.add(this.bt0);
		
		//Button Math
		this.btAddition.setBackground(new java.awt.Color(217, 217, 217));
		this.btAddition.addActionListener(this);
		this.btAddition.setBounds(245, 530, 60, 60);
		this.add(this.btAddition);
		
		this.btSoustraction.setBackground(new java.awt.Color(217, 217, 217));
		this.btSoustraction.addActionListener(this);
		this.btSoustraction.setBounds(245, 465, 60, 60);
		this.add(this.btSoustraction);
		
		this.btMultiplication.setBackground(new java.awt.Color(217, 217, 217));
		this.btMultiplication.addActionListener(this);
		this.btMultiplication.setBounds(245, 400, 60, 60);
		this.add(this.btMultiplication);
		
		this.btDivision.setBackground(new java.awt.Color(217, 217, 217));
		this.btDivision.addActionListener(this);
		this.btDivision.setBounds(245, 335, 60, 60);
		this.add(this.btDivision);
		
		this.btVirgule.setBackground(new java.awt.Color(217, 217, 217));
		this.btVirgule.addActionListener(this);
		this.btVirgule.setBounds(245, 600, 60, 60);
		this.add(this.btVirgule);
		
		this.btEffacer.setBackground(new java.awt.Color(217, 217, 217));
		this.btEffacer.addActionListener(this);
		this.btEffacer.setBounds(180, 335, 60, 60);
		this.add(this.btEffacer);
		
		this.btPourcentage.setBackground(new java.awt.Color(217, 217, 217));
		this.btPourcentage.addActionListener(this);
		this.btPourcentage.setBounds(245, 270, 60, 60);
		this.add(this.btPourcentage);
		
		this.btCos.setBackground(new java.awt.Color(217, 217, 217));
		this.btCos.addActionListener(this);
		this.btCos.setBounds(50, 270, 60, 60);
		this.add(this.btCos);
		
		this.btSin.setBackground(new java.awt.Color(217, 217, 217));
		this.btSin.addActionListener(this);
		this.btSin.setBounds(115, 270, 60, 60);
		this.add(this.btSin);
		
		this.btTan.setBackground(new java.awt.Color(217, 217, 217));
		this.btTan.addActionListener(this);
		this.btTan.setBounds(180, 270, 60, 60);
		this.add(this.btTan);
		
		this.btResultat.setBackground(new java.awt.Color(217, 217, 217));
		this.btResultat.addActionListener(this);
		this.btResultat.setBounds(310, 400, 60, 260);
		this.add(this.btResultat);
		
		this.btRacine.setBackground(new java.awt.Color(217, 217, 217));
		this.btRacine.addActionListener(this);
		this.btRacine.setBounds(310, 335, 60, 60);
		this.add(this.btRacine);
		
		this.btExposant.setBackground(new java.awt.Color(217, 217, 217));
		this.btExposant.addActionListener(this);
		this.btExposant.setBounds(310, 270, 60, 60);
		this.add(this.btExposant);
		
		Font unePolice = new Font("Arial", Font.BOLD, 50);
		this.valeur1.setFont(unePolice);
		this.valeur1.setBounds(20, 70, 380, 100);
		this.add(this.valeur1);
		
		this.valeur2.setFont(unePolice);
		this.valeur2.setBounds(20, 70, 380, 100);
		this.add(this.valeur2);
		
		this.btG.setBackground(new java.awt.Color(217, 217, 217));
		this.btG.addActionListener(this);
		this.btG.setBounds(50, 335, 60, 60);
		this.add(this.btG);
		
		this.btD.setBackground(new java.awt.Color(217, 217, 217));
		this.btD.addActionListener(this);
		this.btD.setBounds(115, 335, 60, 60);
		this.add(this.btD);
		
		this.btPi.setBackground(new java.awt.Color(217, 217, 217));
		this.btPi.addActionListener(this);
		this.btPi.setBounds(310, 205, 60, 60);
		this.add(this.btPi);
		
		this.btNegate.setBackground(new java.awt.Color(217, 217, 217));
		this.btNegate.addActionListener(this);
		this.btNegate.setBounds(245, 205, 60, 60);
		this.add(this.btNegate);
		
		this.btMenu.setBackground(new java.awt.Color(255, 255, 255));
		this.btMenu.addActionListener(this);
		this.btMenu.setBounds(5, 5, 38, 38);
		this.add(this.btMenu);
		
		this.background.setBounds(0, 0, 420, 700);
		this.background.setBackground(new Color(220, 220, 220));
		this.background.setBorder(BorderFactory.createLineBorder(Color.black));
		this.add(this.background);
		
		System.out.println("TEST");
		
		this.setVisible(true);
	}
	
	public static void main(String args[])
	{
		new Calculatrice();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		if(e.getSource() == this.btAide || e.getSource() == this.itemAide)
		{
			JOptionPane.showMessageDialog(this, "Logiciel réalisé par l'école IRIS"
			+ "\n Janvier 2019"
			+ "\n Sasorishi",
			"Tout Droit réserver par IRIS",
			JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == this.bt1)
		{
			valeur1.setText(valeur1.getText() + "1");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "1");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt2)
		{
			valeur1.setText(valeur1.getText() + "2");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "2");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt3)
		{
			valeur1.setText(valeur1.getText() + "3");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "3");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt4)
		{
			valeur1.setText(valeur1.getText() + "4");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "4");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt5)
		{
			valeur1.setText(valeur1.getText() + "5");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "5");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt6)
		{
			valeur1.setText(valeur1.getText() + "6");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "6");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt7)
		{
			valeur1.setText(valeur1.getText() + "7");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "7");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt8)
		{
			valeur1.setText(valeur1.getText() + "8");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "8");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt9)
		{
			valeur1.setText(valeur1.getText() + "9");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "9");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.bt0)
		{
			valeur1.setText(valeur1.getText() + "0");
			System.out.println(this.value1);
			
			if(newCalcul == true)
			{
				valeur1.setText("");
				valeur1.setText(valeur1.getText() + "0");
				System.out.println(this.value1);
				this.newCalcul = false;
			}
		}
		
		if(e.getSource() == this.btAddition)
		{
			valeur1.setText(valeur1.getText() + "+");
			System.out.println("+");
		}
		
		if(e.getSource() == this.btSoustraction)
		{
			valeur1.setText(valeur1.getText() + "-");
			System.out.println("-");
		}
		
		if(e.getSource() == this.btDivision)
		{
			valeur1.setText(valeur1.getText() + "÷");
			System.out.println("÷");
		}
		
		if(e.getSource() == this.btMultiplication)
		{
			valeur1.setText(valeur1.getText() + "*");
			System.out.println("x");
		}
		
		if(e.getSource() == this.btVirgule)
		{
			valeur1.setText(valeur1.getText() + ".");
			System.out.println(",");
		}
		
		if(e.getSource() == this.btRacine)
		{
			valeur1.setText(valeur1.getText() + "Ѵ");
			System.out.println("V");
		}
		
		if(e.getSource() == this.btExposant)
		{
			valeur1.setText(valeur1.getText() + "^");
			System.out.println("^");
		}
		
		if(e.getSource() == this.btPourcentage)
		{
			valeur1.setText(valeur1.getText() + "%");
			System.out.println("%");
		}
		
		if(e.getSource() == this.btCos)
		{
			valeur1.setText(valeur1.getText() + "cos");
			System.out.println("cos");
		}
		
		if(e.getSource() == this.btSin)
		{
			valeur1.setText(valeur1.getText() + "sin");
			System.out.println("sin");
		}
		
		if(e.getSource() == this.btTan)
		{
			valeur1.setText(valeur1.getText() + "tan");
			System.out.println("tan");
		}
		
		if(e.getSource() == this.btResultat)
		{
			String valeur = valeur1.getText();
			String[] parts = valeur.split("[\\+ \\- \\÷ \\* \\^ \\Ѵ \\% \\= cos sin tan]");
			System.out.println(valeur);
			
			if(valeur.contains("+"))
			{
				int split = valeur.split("\\+",-1).length-1;
				System.out.println("split = " + split);
				
				String part1 = parts[0];
				this.value1 = Float.parseFloat(part1);
				
				for(int i = 1; i <= split; i++)
				{
					String part2 = parts[i];
					this.value2 = Float.parseFloat(part2);
					System.out.println(this.value2);
					this.value1 += this.value2;
				}
				this.calcul = this.value1;
				valeur1.setText(valeur1.getText() + "=" + df.format(this.calcul));
				System.out.println(valeur + "=" + df.format(this.calcul));
				this.newCalcul = true;
			}
			
			if(valeur.contains("-"))
			{
				int split = valeur.split("\\-",-1).length-1;
				System.out.println("split = " + split);
				
				String part1 = parts[0];
				this.value1 = Float.parseFloat(part1);
				
				for(int i = 1; i <= split; i++)
				{
					String part2 = parts[i];
					this.value2 = Float.parseFloat(part2);
					System.out.println(this.value2);
					this.value1 -= this.value2;
				}
				
				this.calcul = this.value1;
				valeur1.setText(valeur1.getText() + "=" + df.format(this.calcul));
				System.out.println(valeur + "=" + df.format(this.calcul));
				this.newCalcul = true;
			}
			
			if(valeur.contains("*"))
			{
				int split = valeur.split("\\*",-1).length-1;
				System.out.println("split = " + split);
				
				String part1 = parts[0];
				this.value1 = Float.parseFloat(part1);
				
				for(int i = 1; i <= split; i++)
				{
					String part2 = parts[i];
					this.value2 = Float.parseFloat(part2);
					System.out.println(this.value2);
					this.value1 *= this.value2;
				}
				
				this.calcul = this.value1;
				valeur1.setText(valeur1.getText() + "=" + df.format(this.calcul));
				System.out.println(valeur + "=" + df.format(this.calcul));
				this.newCalcul = true;
			}
			
			if(valeur.contains("÷"))
			{
				int split = valeur.split("\\÷",-1).length-1;
				System.out.println("split = " + split);
				
				String part1 = parts[0];
				this.value1 = Float.parseFloat(part1);
				
				for(int i = 1; i <= split; i++)
				{
					String part2 = parts[i];
					this.value2 = Float.parseFloat(part2);
					System.out.println(this.value2);
					this.value1 /= this.value2;
				}
				
				this.calcul = this.value1;
				valeur1.setText(valeur1.getText() + "=" + df.format(this.calcul));
				System.out.println(valeur + "=" + df.format(this.calcul));
				this.newCalcul = true;
			}
			
			if(valeur.contains("Ѵ"))
			{
				String part2 = parts[1];
				System.out.println(part2);
				this.value2 = Float.parseFloat(part2);

				this.calcul = Math.sqrt(this.value2);
				valeur1.setText(valeur1.getText() + "=" + df.format(this.calcul));
				System.out.println("Ѵ" + part2 + "=" + df.format(this.calcul));
				this.newCalcul = true;
			}
			
			if(valeur.contains("^"))
			{
				String part1 = parts[0];
				String part2 = parts[1];
				System.out.println(part1);
				System.out.println(part2);
				this.value1 = Float.parseFloat(part1);
				this.value2 = Float.parseFloat(part2);

				this.calcul = java.lang.Math.pow(this.value1, this.value2);
				valeur1.setText(valeur1.getText() + "=" + df.format(this.calcul));
				System.out.println(part1 + "^" + part2 + "=" + df.format(this.calcul));
				this.newCalcul = true;
			}
			
			if(valeur.contains("%"))
			{
				String part1 = parts[0];
				System.out.println(part1);
				this.value1 = Float.parseFloat(part1);

				this.calcul = this.value1 / 100;
				valeur1.setText(valeur1.getText() + "=" + this.calcul);
				System.out.println(part1 + "=" + this.calcul);
				this.newCalcul = true;
			}
			
			if(valeur.contains("cos"))
			{
				String part1 = parts[0];
				System.out.println(part1);
				this.value1 = Double.parseDouble(part1);

				double angleRadian = Math.toRadians(value1);
				this.calcul = Math.cos(angleRadian);
				valeur1.setText(valeur1.getText() + "=cos(" + this.calcul + ")");
				System.out.println(part1 + "=cos" + this.calcul);
			}
			
			if(valeur.contains("sin"))
			{
				String part1 = parts[0];
				System.out.println(part1);
				this.value1 = Double.parseDouble(part1);

				double angleRadian = Math.toRadians(value1);
				this.calcul = Math.sin(angleRadian);
				valeur1.setText(valeur1.getText() + "=sin(" + this.calcul + ")");
				System.out.println(part1 + "=sin" + this.calcul);
			}
			
			if(valeur.contains("tan"))
			{
				String part1 = parts[0];
				System.out.println(part1);
				this.value1 = Double.parseDouble(part1);

				double angleRadian = Math.toRadians(value1);
				this.calcul = Math.tan(angleRadian);
				valeur1.setText(valeur1.getText() + "=tan(" + this.calcul + ")");
				System.out.println(part1 + "=tan(" + this.calcul + ")");
			}
		}
		
		if(e.getSource() == this.btEffacer)
		{
			valeur1.setText("");
			System.out.println("C");
			this.calcul = 0;
			this.newCalcul = false;
		}
		
		if(e.getSource() == this.btG)
		{
			valeur1.setText(valeur1.getText() + "(");
			System.out.println("(");
		}
		
		if(e.getSource() == this.btD)
		{
			valeur1.setText(valeur1.getText() + ")");
			System.out.println(")");
		}
		
		if(e.getSource() == this.btPi)
		{
			this.calcul = Math.PI;
			valeur1.setText(valeur1.getText() + this.calcul);
			System.out.println(this.calcul);
			this.newCalcul = true;
		}
		
		if(e.getSource() == this.btMenu)
		{
			if(this.menu == false)
			{
				System.out.println("Open");
				this.menu = true;	
			}
			else
			{
				System.out.println("Close");
				this.menu = false;
			}
		}
	}
}
