package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton clientLoginButton;
    private JButton adminLoginButton;

    public Main() {
        super("Login");

        // Création des champs de saisie
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);

        // Création des boutons de connexion
        clientLoginButton = new JButton("Connexion client");
        clientLoginButton.addActionListener(this);

        adminLoginButton = new JButton("Connexion administrateur");
        adminLoginButton.addActionListener(this);

        // Ajout des composants à la fenêtre
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(new JLabel("Nom d'utilisateur :"));
        panel.add(usernameField);
        panel.add(new JLabel("Mot de passe :"));
        panel.add(passwordField);
        panel.add(clientLoginButton);
        panel.add(adminLoginButton);
        add(panel);

        // Affichage de la fenêtre
       /* pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);*/
        this.setTitle("BANQUE");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(400,400);	
		this.setLocationRelativeTo(null);
		
		
		
		ImageIcon image= new ImageIcon("logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(45,71,132,255));
		setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Récupération des valeurs des champs de saisie
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (e.getSource() == clientLoginButton) {
            // Vérification des identifiants du client
            if (username.equals("client") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Connexion client réussie !");
            } else {
                JOptionPane.showMessageDialog(this, "Identifiants client incorrects !");
            }
        } else if (e.getSource() == adminLoginButton) {
            // Vérification des identifiants de l'administrateur
            if (username.equals("admin") && password.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Connexion administrateur réussie !");
                MyFrame frame =new MyFrame();
            } else {
                JOptionPane.showMessageDialog(this, "Identifiants administrateur incorrects !");
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}


