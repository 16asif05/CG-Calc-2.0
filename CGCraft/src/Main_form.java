import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main_form extends JFrame {

    private JPanel MainPannel;
    private JLabel l1;
    private JButton AIUBButton;
    private JButton NSUButton;
    private JButton IUBButton;
    private JButton GUIDETORIZZButton;

    Main_form (){
        setSize(300,400);
        setTitle("Ghatpar gangz");
        setLocationRelativeTo(null);

        AIUBButton.setFocusable(false);
        NSUButton.setFocusable(false);
        IUBButton.setFocusable(false);
        GUIDETORIZZButton.setFocusable(false);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        NSUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NSU n = new NSU();
                dispose();
            }
        });

        AIUBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AIUB A = new AIUB();
            }
        });


        IUBButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IUB i = new IUB();
                dispose();
            }
        });

        GUIDETORIZZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Intro i = new Intro();
            }
        });

        setContentPane(MainPannel);
    }

    public static void main(String[] args) {
        new Main_form();
    }
}



