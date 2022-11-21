import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JPanel = a GUI component that functions as a container to hold other components
        ImageIcon icon = new ImageIcon("mario.png");

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
//        label.setVerticalAlignment((JLabel.BOTTOM));//2
//        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(0,0,75,75);// #place components in this area og your panel container


        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.setLayout(null);// nothing displayed in this panel

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.setLayout(null);

        //JFrame create a frame
        JFrame frame = new JFrame();
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);

        bluePanel.add(label);//#

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

    }
}