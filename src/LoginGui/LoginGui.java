package LoginGui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGui implements ActionListener {

	private static JFrame frame;
	private static JPanel panel;
	private static JButton button;
	private static JLabel success, passWordLabel, userlabel;
	private static JPasswordField passwordText;
	private static JTextField userText;

	public static void main(String[] args) {
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("LoginGui");
		frame.add(panel);

		// khung user
		userlabel = new JLabel("User");
		userlabel.setBounds(10, 20, 80, 25);
		panel.add(userlabel);

		userText = new JTextField();
		userText.setBounds(100, 20, 165, 25);
		panel.add(userText);

		
		//khung password 
		passWordLabel = new JLabel("Password");
		passWordLabel.setBounds(10, 50, 80, 25);
		panel.add(passWordLabel);

		passwordText = new JPasswordField();
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		
		//button Login 
		button = new JButton("Login");
		button.setBounds(10, 80, 80, 25);
		button.addActionListener(new LoginGui());
		panel.add(button);

		success = new JLabel("");
		success.setBounds(10, 110, 300, 25);
		panel.add(success);

		panel.setLayout(null);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String user = userText.getText();
		String password = passwordText.getText();
		System.out.println(user + " , " + password);

		if (user.equals("Mai") && (password.equals("9999"))) {
			success.setText("login successful");

		}
	}

}
