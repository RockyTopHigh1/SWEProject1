import javax.swing.*;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton OKButton;
    private JButton clearButton;
    private JPanel MainPanel;

    public LoginScreen(){
        setContentPane(MainPanel);
        setTitle("Welcome! Please Log in");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                Menu myMenu = new Menu();
            }
        });
    }

}
