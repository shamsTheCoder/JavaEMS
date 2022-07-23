package javaems;

import java.awt.*;
import javax.swing.*;

public class Login extends JFrame{

    Login() {
        setLayout(null);

        // getContentPane().setBackground(Color.LIGHT_GRAY);
        // windows title
        JLabel heading = new JLabel("Login");
        heading.setBounds(280, 10, 300, 50);
        heading.setFont(new Font("serif", Font.PLAIN, 22));
        add(heading);

        // form element
        JLabel lblUserName = new JLabel("User name: ");
        lblUserName.setBounds(30, 80, 80, 30);
        add(lblUserName);

        JTextField tUserName = new JTextField();
        tUserName.setBounds(140, 85, 200, 25);
        add(tUserName);

        JLabel lblPassword = new JLabel("Password: ");
        lblPassword.setBounds(30, 120, 80, 30);
        add(lblPassword);

        JTextField tPassword = new JTextField();
        tPassword.setBounds(140, 120, 200, 25);
        add(tPassword);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(140, 155, 90, 25);
        add(btnSubmit);

        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(250, 155, 89, 25);
        add(btnReset);

        ImageIcon loginImage = new ImageIcon(ClassLoader.getSystemResource("img/login-img.png"));
        Image i2 = loginImage.getImage().getScaledInstance(200, 157, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(360, 50, 200, 157);
        add(image);

        setSize(600, 300);
        setLocation(330, 200);
        setResizable(false);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Login();
    }
}

