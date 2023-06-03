package university.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JButton login1,login2, cancel;
    JTextField tfusername, tfpassword;
    
    Login () {
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);
        
        JLabel lblpassword = new JLabel("Password");
        lblpassword.setBounds(40, 70, 100, 20);
        add(lblpassword);
        
        tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);
        
        login1 = new JButton("Login as Student");
        login1.setBounds(80, 140, 200, 30);
        login1.setBackground(Color.BLACK);
        login1.setForeground(Color.WHITE);
        login1.addActionListener(this);
        login1.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login1);
        
        login2 = new JButton("Login as Teacher");
        login2.setBounds(80, 180, 200, 30);
        login2.setBackground(Color.BLACK);
        login2.setForeground(Color.WHITE);
        login2.addActionListener(this);
        login2.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(login2);
        
//        cancel = new JButton("Cancel");
//        cancel.setBounds(180, 140, 120, 30);
//        cancel.setBackground(Color.BLACK);
//        cancel.setForeground(Color.WHITE);
//        cancel.addActionListener(this);
//        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
//        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 200, 200);
        add(image);
        
        setSize(600, 300);
        setLocation(500, 250);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login1) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from studLogin where username='"+username+"' and password='"+password+"'";
            
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project2();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
              
                
            } catch (Exception e) {
                e.printStackTrace();
            }
//        } else if (ae.getSource() == cancel) {
//            setVisible(false);
        }
        
          if (ae.getSource() == login2) {
            String username = tfusername.getText();
            String password = tfpassword.getText();
            
            String query = "select * from teachLogin where username='"+username+"' and password='"+password+"'";
            
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                
                if (rs.next()) {
                    setVisible(false);
                    new Project1();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                    setVisible(false);
                }
              
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } //else if (ae.getSource() == cancel) {
//            setVisible(false);
//        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
