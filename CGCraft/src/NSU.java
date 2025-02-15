import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NSU extends JFrame {
    private JPanel MainNsu;
    private JLabel hdl;
    private JLabel CGL;
    private JFormattedTextField formattedTextField1;
    private JLabel GRL;
    private JFormattedTextField formattedTextField2;
    private JButton SMASHButton;
    private JButton PASSButton;
    private JButton knockItOffDUHButton;

    NSU (){
        setSize(500,400);
        setTitle("GANG NSU");
        setLocationRelativeTo(null);

        SMASHButton.setFocusable(false);
        PASSButton.setFocusable(false);
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
        setContentPane(MainNsu);
    }

    public static void main(String[] args) {
        new NSU();
    }


}
