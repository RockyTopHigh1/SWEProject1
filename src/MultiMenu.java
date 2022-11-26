import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiMenu extends JFrame {
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button1;
    private JButton button2;
    private JPanel panel3;
    private JTable table1;
    private JTabbedPane tabbedPane1;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button14;
    private JButton button15;
    private JButton button13;
    private JButton button3;
    private JButton italianMeatsButton;
    private JButton cheesyAlfredoButton;
    private JButton veggieButton;
    private JButton chickenAlfredoButton;
    private JButton mozzarellaSticksButton;
    private JButton a6PieceWingsButton;
    private JButton breadSticksButton;
    private JButton cinnamonSticksButton;
    private JButton a3ChocoBrownieButton;
    private JButton a20OzPersonalBottleButton;
    private JButton a2LiterButton;
    private JButton parmesanPacketButton;
    private JButton redPepperPacketButton;
    private JButton garlicDipButton;
    private JButton ranchDipButton;
    private JButton button16;
    private JSpinner spinner1;
    private JButton button17;
    private JPanel panel1;
    private JButton placeOrderButton;
    private JPanel panel2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField8;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JPasswordField passwordField1;
    private JTextField textField7;
    private JPanel panel4;
    private JRadioButton fullTimeRadioButton;
    private JRadioButton partTimeRadioButton;
    private JTextField textField9;
    private JTextField textField10;
    private JButton loginButton;
    private JButton cancelButton;
    private JPanel panel5;
    private JPanel panel6;
    private JButton button18;
    private JButton button19;
    private JButton button20;
    private JList list1;
    private JList list2;
    private JTextField textField11;
    private JButton button21;
    private JButton button22;
    private JPanel panel7;


    public MultiMenu() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel2.setVisible(true);
                panel3.setVisible(false);
                panel4.setVisible(false);
                panel5.setVisible(false);
                panel6.setVisible(false);
                panel7.setVisible(false);
            }
        });
    }

    public static void main (String[] args){
        MultiMenu frame = new MultiMenu();
        frame.setContentPane(frame.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.panel1.setVisible(true);
        frame.panel2.setVisible(false);
        frame.panel3.setVisible(false);
        frame.panel4.setVisible(false);
        frame.panel5.setVisible(false);
        frame.panel6.setVisible(false);
        frame.panel7.setVisible(false);


    }

}

