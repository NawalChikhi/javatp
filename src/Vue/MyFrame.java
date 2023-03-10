package Vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{

	
	JMenuBar menubar;
	JMenu  fileMenu,helpMenu,editMenu ;
	JMenuItem LoadItem , saveItem , exitItem;
	ImageIcon LoadIcon , saveIcon , exitIcon;
	
	MyFrame(){
		
		
		this.setTitle("BANQUE");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(500,500);	
		this.setLocationRelativeTo(null);	
		
		
		ImageIcon image= new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(200,200,200));
		
		LoadIcon=new ImageIcon("file.png");
		saveIcon=new ImageIcon("enrg.png");
		//exitIcon=new ImageIcon("exit.png");
		
		menubar = new JMenuBar() ;
		
		fileMenu = new JMenu("File");
		  editMenu = new JMenu("Edit");
		 helpMenu = new JMenu("Help");
		
		LoadItem = new  JMenuItem("Load");
		saveItem = new  JMenuItem("Save");
	    exitItem = new  JMenuItem("Exit");
		
		LoadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		LoadItem.setIcon(LoadIcon);
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		LoadItem.setMnemonic(KeyEvent.VK_L);
		saveItem.setMnemonic(KeyEvent.VK_S);
		exitItem.setMnemonic(KeyEvent.VK_E);
		fileMenu.setMnemonic(KeyEvent.VK_F);
		  editMenu.setMnemonic(KeyEvent.VK_E);
		 helpMenu.setMnemonic(KeyEvent.VK_H);
		
		fileMenu.add(LoadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menubar.add(fileMenu);
		menubar.add(editMenu);
		menubar.add(helpMenu);
		
		this.setJMenuBar(menubar);
		this.setVisible(true);
		
		//////////////////////////////////////////////////////////////////
		
		   // Crée un panneau pour contenir les boutons CRUD
        JPanel panel = new JPanel();

        // Configure le layout du panneau pour être orienté vers l'ouest (West)
        panel.setLayout(new GridLayout(6, 1)); // 4 rangées pour les 4 boutons CRUD

        // Crée les boutons CRUD
        JButton createButton = new JButton("Ajouter");
        JButton readButton = new JButton("Afficher");
        JButton updateButton = new JButton("Modifier");
        JButton deleteButton = new JButton("Supprimer");

        // Ajoute les boutons au panneau
        panel.add(createButton);
        panel.add(readButton);
        panel.add(updateButton);
        panel.add(deleteButton);

        // Ajoute le panneau à la fenêtre principale
        this.add(panel, BorderLayout.WEST);

        
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	VuClient vuclient= new VuClient();
                
            }
        });
        
        readButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Tbl tbl =new Tbl();
                
            }
        });
    }
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==LoadItem) {
			System.out.println("load");
			
		}
		if (e.getSource()==saveItem) {
			System.out.println("save all");
			
		}
		if (e.getSource()==exitItem) {
			System.exit(0);
			System.out.println("exit");
		}
		
	}
	
	
	
	
	
	
}
