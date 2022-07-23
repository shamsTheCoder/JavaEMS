
package javaems;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Splash extends JFrame implements ActionListener {

    Splash() {
        setLayout(null);

        getContentPane().setBackground(Color.LIGHT_GRAY);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(175, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.darkGray);
        add(heading);

        ImageIcon splashImage = new ImageIcon(ClassLoader.getSystemResource("img/splash-img.png"));
        Image i2 = splashImage.getImage().getScaledInstance(500, 394, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(30, 70, 1050, 500);
        add(image);

        JButton start = new JButton("Start");
        start.setBounds(400, 530, 300, 50);
        start.setFont(new Font("serif", Font.PLAIN, 25));
        start.setFocusPainted(false);
        start.setForeground(Color.WHITE);
        start.setBackground(Color.darkGray);
        start.addActionListener(this);
        add(start);

        setSize(1170, 650);
        setLocation(50, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Splash();
    }
}
