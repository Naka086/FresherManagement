package Login;

import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel();

    WelcomePage(String userID) {
        this.welcomeLabel.setBounds(0, 0, 200, 35);
        this.welcomeLabel.setFont(new Font((String)null, 0, 25));
        this.welcomeLabel.setText("Xinchao " + userID);
        this.frame.add(this.welcomeLabel);
        this.frame.setDefaultCloseOperation(3);
        this.frame.setSize(420, 420);
        this.frame.setLayout((LayoutManager)null);
        this.frame.setVisible(true);
    }
}
