package Login;

import java.awt.Color;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messageLabel = new JLabel("Welcome home");
    HashMap<String, String> logininfo = new HashMap();

    LoginPage(HashMap<String, String> loginInfoOriginal) {
        this.logininfo = loginInfoOriginal;
        this.userIDLabel.setBounds(50, 100, 75, 25);
        this.userPasswordLabel.setBounds(50, 150, 75, 25);
        this.messageLabel.setBounds(125, 250, 250, 35);
        this.messageLabel.setFont(new Font((String)null, 2, 25));
        this.userIDField.setBounds(125, 100, 200, 25);
        this.userPasswordField.setBounds(125, 150, 200, 25);
        this.loginButton.setBounds(125, 200, 100, 25);
        this.loginButton.setFocusable(false);
        this.loginButton.addActionListener(this);
        this.resetButton.setBounds(225, 200, 100, 25);
        this.resetButton.setFocusable(false);
        this.resetButton.addActionListener(this);
        this.frame.add(this.userIDLabel);
        this.frame.add(this.userPasswordLabel);
        this.frame.add(this.messageLabel);
        this.frame.add(this.userIDField);
        this.frame.add(this.userPasswordField);
        this.frame.add(this.loginButton);
        this.frame.add(this.resetButton);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setSize(420, 420);
        this.frame.setLayout((LayoutManager)null);
        this.frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.loginButton) {
            String userID = this.userIDField.getText();
            String password = String.valueOf(this.userPasswordField.getPassword());
            if (this.logininfo.containsKey(userID)) {
                if (((String)this.logininfo.get(userID)).equals(password)) {
                    this.messageLabel.setForeground(Color.green);
                    this.messageLabel.setText("Login successful");
                    this.frame.dispose();
                    new WelcomePage(userID);
                } else {
                    this.messageLabel.setForeground(Color.red);
                    this.messageLabel.setText("Wrong Password");
                }
            } else {
                this.messageLabel.setForeground(Color.red);
                this.messageLabel.setText("Username not found");
            }
        }

        if (e.getSource() == this.resetButton) {
            this.userIDField.setText("");
            this.userPasswordField.setText("");
        }

    }
}