import javax.swing.*;

public class MainPizzaFrame extends JFrame{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton OKButton;
    private JButton clearButton;
    private JPanel MainPanel;

    public MainPizzaFrame(){
        setContentPane(MainPanel);
        setTitle("Welcome! Please Log in");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args){
        MainPizzaFrame myFrame = new MainPizzaFrame();
    }
}
