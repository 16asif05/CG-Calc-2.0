import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AIUB extends JFrame{
    private JPanel MnAiub;
    private JLabel MAINL;
    private JButton PASSButton;
    private JButton SMASHButton;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JLabel L4;
    private JButton knockItOffDUHButton;

    AIUB ()
    {
        setSize(500,400);
        setTitle("GANG AIUB");
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

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(MnAiub);
    }

    public static void main(String[] args) {
        new AIUB();
    }

}
