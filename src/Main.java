import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator implements ActionListener {

    /* Created the Instance */
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    // setting font size

    Font myFont = new Font("Ink Free",Font.BOLD,30);

    double num1=0, num2=0, result = 0;
    char operator;

    Calculator() {
        // constructor code
        // Initialising the Jframe
        frame = new JFrame("Sample Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,550);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    public void actionPerformed(ActionEvent e) {
        // implementation code for handling the action event
    }
}
