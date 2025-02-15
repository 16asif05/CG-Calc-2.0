import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IUB extends JFrame {
    private JPanel MainIub;
    private JLabel l1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JLabel L4;
    private JLabel L5;
    private JButton PASSButton;
    private JButton SMASHButton;
    private JButton knockItOffDUHButton;

    IUB (){
        setSize(500,400);
        setTitle("GANG IUB");
        setLocationRelativeTo(null);

        PASSButton.setFocusable(false);
        SMASHButton.setFocusable(false);
        knockItOffDUHButton.setFocusable(false);

        knockItOffDUHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_form m = new Main_form();
                dispose();
            }
        });

        setVisible(true);
        setContentPane(MainIub);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new IUB();
    }
}
