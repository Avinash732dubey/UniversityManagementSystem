

package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class AddTeacher extends JFrame implements ActionListener{
    
    JTextField tfname,tffname,tfaddress,tfphoneno,tfemail,tfx,tfxii,tfaadhar;
    JLabel labelempId;
    JDateChooser dcdob;
    JComboBox cbqualification,cbdepartment;
    JButton submit,cancel;
    Random ran=new Random();
    long first4=Math.abs((ran.nextLong()%9000L)+1000L);
    AddTeacher(){
        setSize(900,700);
        setLocation(350,50);
        setLayout(null);
        
        JLabel heading=new JLabel("New Teacher Details");
        heading.setBounds(310,30,500,50);
        heading.setFont(new Font("serif",Font.BOLD,30));
        add(heading);
        
            JLabel lblname=new JLabel("Name");
        lblname.setBounds(50,150,100,30);
        lblname.setFont(new Font("serif",Font.BOLD,20));
        add(lblname);
        
        tfname=new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
          JLabel lblfname=new JLabel("Father's Name");
      lblfname.setBounds(400,150,200,30);
        lblfname.setFont(new Font("serif",Font.BOLD,20));
        add(lblfname);
        
        tffname=new JTextField();
        tffname.setBounds(600, 150, 150, 30);
        add(tffname);
        
       JLabel lblempId=new JLabel("Employee Id");
      lblempId.setBounds(50,200,200,30);
        lblempId.setFont(new Font("serif",Font.BOLD,20));
        add(lblempId);
         
        
        labelempId=new JLabel("101"+first4);
        labelempId.setBounds(200, 200, 200, 30);
        labelempId.setFont(new Font("serif",Font.BOLD,20));
        add(labelempId);
        
         JLabel lbldob=new JLabel("Date of Birth");
      lbldob.setBounds(400,200,200,30);
        lbldob.setFont(new Font("serif",Font.BOLD,20));
        add(lbldob);
        dcdob= new JDateChooser();
        dcdob.setBounds(600,200,150,30);
        add(dcdob);
        
         JLabel lbladdress=new JLabel("Address");
      lbladdress.setBounds(50,250,200,30);
        lbladdress.setFont(new Font("serif",Font.BOLD,20));
        add(lbladdress);
        
        tfaddress=new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel lblphoneno=new JLabel("Phone Number");
      lblphoneno.setBounds(400,250,200,30);
        lblphoneno.setFont(new Font("serif",Font.BOLD,20));
        add(lblphoneno);
        
        tfphoneno=new JTextField();
        tfphoneno.setBounds(600, 250, 150, 30);
        add(tfphoneno);
          JLabel lblemail=new JLabel("Email Id");
      lblemail.setBounds(50,300,200,30);
        lblemail.setFont(new Font("serif",Font.BOLD,20));
        add(lblemail);
        
        tfemail=new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel lblx=new JLabel("Class X (%)");
      lblx.setBounds(400,300,200,30);
        lblx.setFont(new Font("serif",Font.BOLD,20));
        add(lblx);
        
        tfx=new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);
        
        JLabel lblxii=new JLabel("Class XII (%)");
      lblxii.setBounds(50,350,200,30);
        lblxii.setFont(new Font("serif",Font.BOLD,20));
        add(lblxii);
        
        tfxii=new JTextField();
        tfxii.setBounds(200, 350, 150, 30);
        add(tfxii);
    
        JLabel lblaadhar=new JLabel("Addhar Number");
      lblaadhar.setBounds(400,350,200,30);
        lblaadhar.setFont(new Font("serif",Font.BOLD,20));
        add(lblaadhar);
        
        tfaadhar=new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
         JLabel lbleducation=new JLabel("Qualification");
      lbleducation.setBounds(50,400,200,30);
        lbleducation.setFont(new Font("serif",Font.BOLD,20));
        add(lbleducation);
        
        String qualification[]={"B.Tech","BBA","BSC","MSC","MBA","MCA","B.E","MCOM","B.A","Pharmacy","Diploma"};
        cbqualification=new JComboBox(qualification);
        cbqualification.setBounds(200,400,150,30);
        cbqualification.setBackground(Color.WHITE);
        add(cbqualification);
        
        JLabel lbldepartment=new JLabel("Department");
      lbldepartment.setBounds(400,400,200,30);
        lbldepartment.setFont(new Font("serif",Font.BOLD,20));
        add(lbldepartment);
        
        String department[]={"CSE","EC","EX","EE","ME","CE","CSE-AIML","DS","Cyber Security","IT","CE"};
        cbdepartment=new JComboBox(department);
        cbdepartment.setBounds(600,400,150,30);
        cbdepartment.setBackground(Color.WHITE);
        add(cbdepartment);
        
        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
          setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String name=tfname.getText();
            String fname=tffname.getText();
            String empId=labelempId.getText();
            String dob=((JTextField)dcdob.getDateEditor().getUiComponent()).getText();
            String address=tfaddress.getText();
            String phone=tfphoneno.getText();
            String email=tfemail.getText();
            String x=tfx.getText();
            String xii=tfxii.getText();
            String aadhar=tfaadhar.getText();
            String qualification=(String)cbqualification.getSelectedItem();
            String department=(String)cbdepartment.getSelectedItem();
            
            try{
            String query="insert into teacher values('"+name+"','"+fname+"','"+empId+"','"+dob+"','"+address+"','"+phone+"','"+email+"','"+x+"','"+xii+"','"+aadhar+"','"+qualification+"','"+department+"')";
            Conn con=new Conn();
            con.s.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Teacher Details inserted Successfully");
            setVisible(false);
            }catch(Exception e){
             
                e.printStackTrace();
            }
            
            
        }else{
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new AddTeacher();
    }
}
