import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.Container;
import java.awt.Insets;
import java.awt.GridBagConstraints;

public class Ventana{
	public Ventana(){
	//Declaracion de objetos;
	JFrame frame=new JFrame("Login");
	JButton ok=new JButton("OK");
	JButton cancel=new JButton("Cancel");
	JLabel user=new JLabel("User");
	JLabel pass=new JLabel("Password");
	JTextField usertext=new JTextField();
	JTextField passtext=new JTextField();


	//Contianer
	Container contentpane=frame.getContentPane();
	contentpane.setLayout(new GridBagLayout());

	//GridBagConstraints
	GridBagConstraints gbc=new GridBagConstraints();

	//Ajustar objetos
	gbc.gridx=0;
	gbc.gridy=0;
	gbc.insets=new Insets(10,10,10,10);
	gbc.anchor=GridBagConstraints.EAST;
	contentpane.add(user,gbc);

	gbc.gridy=1;
	contentpane.add(pass,gbc);

	gbc.gridx=1;
	gbc.fill=GridBagConstraints.HORIZONTAL;
	contentpane.add(usertext,gbc);

	gbc.gridy=0;
	contentpane.add(passtext,gbc);

	gbc.gridy=2;
	gbc.gridx=GridBagConstraints.REMAINDER;
	contentpane.add(cancel,gbc);
	
	gbc.gridx=GridBagConstraints.RELATIVE;
	gbc.gridy=2;
	contentpane.add(ok,gbc);


	//FRAME
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
	}
	public static void main(String[] args){
		new Ventana();
	}
}
