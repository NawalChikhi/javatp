package Vue;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class Tbl extends JFrame{
	
	   Tbl() {
	    //super("Tableau de données");
	    
	    // Créer un tableau de données avec des colonnes pour Nom, Prénom et ID
	    String[] entetes = {"Nom", "Prénom", "ID"};
	    Object[][] donnees = {
	      {"Dupont", "Jean", "123"},
	      {"Martin", "Marie", "456"},
	      {"Durand", "Pierre", "789"},
	    };
	    
	    // Créer un modèle de tableau avec les données et les entêtes
	    DefaultTableModel model = new DefaultTableModel(donnees, entetes);
	    
	    // Créer une table et lui assigner le modèle
	    JTable table = new JTable(model);
	    
	    // Ajouter la table à un panneau avec un défilement vertical
	    JPanel panel = new JPanel();
	    panel.add(new JScrollPane(table));
	    
	    // Ajouter le panneau à la fenêtre
	    add(panel);
	    
	    // Configurer la fenêtre
	   // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    pack();
	    
	    this.setTitle("BANQUE");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500,500);	
		this.setLocationRelativeTo(null);	
		setVisible(true);
		
		ImageIcon image= new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(200,200,200));
	  }

	

	public static void addRow(Object[] objects) {
		// TODO Auto-generated method stub
		
	}
	  
	  
	}



