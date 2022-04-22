import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter extends JFrame{
    private JPanel mainPanel;
    private JTextField cTextFeild;
    private JLabel cLable;
    private JButton convertButton;
    private JLabel farenheit;

    public Converter(String title) {
        super(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.setSize(300, 500);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tempFahr = (int)((Double.parseDouble(cTextFeild.getText()))
                        * 1.8 +32);
                farenheit.setText(tempFahr + " Fahrenheit");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Converter("Celsius Converter");
        frame.setVisible(true);
    }
}
