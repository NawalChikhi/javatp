package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VuClient extends JFrame {
	
	private JButton Ajouter,Effacer , Annuler;
	private JTextField  Id,Nom,Prenom,Login , Pass,ConfPass,CIN,Sexe,Tel,Adress;
	private JLabel  lbl_title,lbl_login,lbl_pass,lbl_passconf, lbl_nom,lbl_prenom,lbl_cin,lbl_tel,lbl_adress;
	private JPanel formPanel,buttonPanel,titlePanel;
	private Container mainContainer;
	
	private void initButtons() {
		
		
		Ajouter =new JButton("Ajouter");
		Ajouter.setFont(new Font("Optima",Font.BOLD,17));
		Ajouter.setForeground(new Color(45,71,132,255));
		Ajouter.setHorizontalAlignment(JLabel.CENTER);
		
		Effacer =new JButton("Effacer");
		Effacer.setFont(new Font("Optima",Font.BOLD,17));
		Effacer.setForeground(new Color(45,71,132,255));
		Effacer.setHorizontalAlignment(JLabel.CENTER);
		 
		 

		 Annuler =new JButton("Annuler");
		 Annuler.setFont(new Font("Optima",Font.BOLD,17));
		 Annuler.setForeground(new Color(45,71,132,255));
		 Annuler.setHorizontalAlignment(JLabel.CENTER);
		 
		}
	
	private void JTextField() {
		
		Nom =new JTextField("");
		Nom.setFont(new Font("Optima",Font.BOLD,30));
		Nom.setForeground(Color.BLUE);
		Nom.setHorizontalAlignment(JTextField.CENTER);
		
		Prenom =new JTextField("");
		Prenom.setFont(new Font("Optima",Font.BOLD,30));
		Prenom.setForeground(Color.BLUE);
		Prenom.setHorizontalAlignment(JTextField.CENTER);
		
		Login =new JTextField("");
		Login.setFont(new Font("Optima",Font.BOLD,30));
		Login.setForeground(Color.BLUE);
		Login.setHorizontalAlignment(JTextField.CENTER);

		Pass=new JPasswordField("");
		Pass.setFont(new Font("Optima",Font.BOLD,30));
		Pass.setForeground(Color.BLUE);
		Pass.setHorizontalAlignment(JTextField.CENTER);

	   	
	}
	
	private void initLabels(){
	    lbl_title =new JLabel("F O R M U L A I R E  C L I E N T");
	    lbl_title.setFont(new Font("Optima",Font.BOLD,30));
	    lbl_title.setForeground(Color.white);
	    lbl_title.setHorizontalAlignment(JLabel.CENTER);
	    
	    lbl_nom =new JLabel("Nom-U");
	    lbl_nom.setFont(new Font("Optima",Font.BOLD,30));
	    lbl_nom.setForeground(Color.BLUE);
	    lbl_nom.setHorizontalAlignment(JLabel.CENTER);

	    lbl_prenom =new JLabel("Prenom-U");
	    lbl_prenom.setFont(new Font("Optima",Font.BOLD,30));
	    lbl_prenom.setForeground(Color.BLUE);
	    lbl_prenom.setHorizontalAlignment(JLabel.CENTER);

	    lbl_login =new JLabel("Login-U");
	    lbl_login.setFont(new Font("Optima",Font.BOLD,30));
	    lbl_login.setForeground(Color.BLUE);
	    lbl_login.setHorizontalAlignment(JLabel.CENTER);

	    lbl_pass =new JLabel("Pass-U");
	    lbl_pass.setFont(new Font("Optima",Font.BOLD,30));
	    lbl_pass.setForeground(Color.BLUE);
	    lbl_pass.setHorizontalAlignment(JLabel.CENTER);
	}
	
	private void initPanel(){

	    initLabels();
	    initButtons();
	    JTextField();
	    ///////////////////////////////// FORM PANEL /////////////////////////////////////////

	    formPanel =new JPanel();
	    formPanel.setBackground(new Color(0xB0B0B0));
	    formPanel.setBorder(new EmptyBorder(15,0,15,0));
	    formPanel.setLayout(new BorderLayout());

	    JPanel WestPanel =new JPanel();
	    WestPanel.setLayout(new GridLayout(4,1,5,5));
	    WestPanel.setBackground(Color.gray);
	    WestPanel.add(lbl_nom);
	    WestPanel.add(lbl_prenom);
	    WestPanel.add(lbl_login);
	    WestPanel.add(lbl_pass);
	    WestPanel.setBorder(new EmptyBorder(70,20,70,20));
	    formPanel.add(WestPanel,BorderLayout.WEST);


	    JPanel CenterPanel =new JPanel();
	    CenterPanel.setLayout(new GridLayout(4,1,5,5));
	    CenterPanel.setBackground(Color.gray);
	    CenterPanel.add(Nom);
	    CenterPanel.add(Prenom);
	    CenterPanel.add(Login);
	    CenterPanel.add(Pass);
	    CenterPanel.setBorder(new EmptyBorder(70,20,70,20));
	    formPanel.add(CenterPanel,BorderLayout.CENTER);
	   


	    ///////////////////////////////// BUTTON PANEL /////////////////////////////////////////
	    buttonPanel =new JPanel();
	    buttonPanel.setBackground(new Color(45,71,132,255));
	    buttonPanel.setBorder(new EmptyBorder(15,0,15,0));
	    buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	    buttonPanel.add(Ajouter);
	    buttonPanel.add(Effacer);
	    buttonPanel.add(Annuler);




	    ////////////////////////////////  TITLE PANEL //////////////////////////////////////


	    titlePanel =new JPanel();
	    titlePanel.setBackground(new Color(45,71,132,255));
	    titlePanel.setBorder(new EmptyBorder(15,0,15,0));
	    titlePanel.add(lbl_title); 
	    
	}
	
	private void initContainer(){
	    initPanel();
	    mainContainer = getContentPane();

	    mainContainer.setLayout(new BorderLayout());
	    mainContainer.setBackground(new Color(0xDC5B5B));

	    mainContainer.add(titlePanel,BorderLayout.NORTH);
	    mainContainer.add(formPanel,BorderLayout.CENTER);
	    mainContainer.add(buttonPanel,BorderLayout.SOUTH);


	}
	
	
	
	//Constructeur
		/*public VuClient() {
			
		super("Client");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setSize(600,400);
		
		setLocationRelativeTo(null);
		
		
		getContentPane().setBackground(new Color(255,255,200));
		
		initContainer();
		
		}*/
	VuClient(){
		ImageIcon image1= new ImageIcon("AjouterC.png");
		JLabel label=new JLabel();
		label.setText("Ajouter Client");
		label.setIcon(image1);
		label.setIconTextGap(200);
		add(label);
		initContainer();
	this.setTitle("BANQUE");
	this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	this.setResizable(false);
	this.setSize(500,500);	
	this.setLocationRelativeTo(null);	
	this.setVisible(true);
	
	ImageIcon image= new ImageIcon("logo.jpg");
	this.setIconImage(image.getImage());
	this.getContentPane().setBackground(new Color(200,200,200));
	}
}
