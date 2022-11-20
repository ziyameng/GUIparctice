import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //JLabel =  a GUI display area for a string of text, an image, or both
        ImageIcon image = new ImageIcon("mario.png");//4.import the icon image
        Border border = BorderFactory.createLineBorder(Color.green, 3);//create a border

        JLabel label = new JLabel();//1.create a label
        label.setText("Bro, do you even code?");//2.set text of label
        label.setIcon(image);//5.set image for the icon
        label.setHorizontalTextPosition(JLabel.CENTER);// set text LEFT, CENTER, RIGHT of imageicon
        label.setVerticalTextPosition(JLabel.TOP);//set text TOP, CENTER, BOTTOM of imageicon;
        label.setForeground(new Color(0x00ff00)); //Color.green / new Color(0,0,0) => set color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));// set font of text
        label.setIconTextGap(-25); //set gap of text to image
        label.setBackground(Color.black);// set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);/// set a border of label not (image+text)
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
//        label.setBounds(0,0,350,350);//set x,y position with frame as well as dimensions



        //JFrame create a frame
        JFrame frame = new JFrame();
        frame.add(label); //3.add label to frame

//        frame.setLayout(null);// for setBounds

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.pack();//adjust to accomondate the content automatically, pack should be used at the end u got all ur components ready




    }
}