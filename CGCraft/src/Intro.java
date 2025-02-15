import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Intro extends JFrame {
    private JPanel INTRO;
    private JLabel L1;
    private JButton GOTITTButton;

    Intro ()
    {
        setSize(540,770);
        setTitle("Guide");
        setLocationRelativeTo(null);

        GOTITTButton.setFocusable(false);

        GOTITTButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main_form m = new Main_form();
                dispose();
            }
        });


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(INTRO);
    }

    public static void main(String[] args) {
        new Intro();
    }
}
