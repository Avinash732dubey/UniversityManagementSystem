package university.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Project1 extends JFrame implements ActionListener{
    Project1() {
        setSize(1920, 1080);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1880, 980, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        // New Information

        JMenuBar mb=new JMenuBar();
        JMenu newInformation=new JMenu("New Info");
        mb.add(newInformation);

        // New Faculty Information

        JMenuItem facultyInfo=new JMenuItem("New Faculty Info");
        facultyInfo.setBackground(Color.white);
        facultyInfo.addActionListener(this);
        newInformation.add(facultyInfo);

        // New Student Information

        JMenuItem studentInfo=new JMenuItem("New Student Info");
        studentInfo.setBackground(Color.white);
        studentInfo.addActionListener(this);
        newInformation.add(studentInfo);

        // Details

        JMenu details=new JMenu("View Details");
        mb.add(details);

        JMenuItem facultydetails=new JMenuItem("View Faculty Details");
        facultydetails.setBackground(Color.white);
        facultydetails.addActionListener(this);
        details.add(facultydetails);

        JMenuItem studentdetails=new JMenuItem("View Student Details");
        studentdetails.setBackground(Color.white);
        studentdetails.addActionListener(this);
        details.add(studentdetails);

        // Leave Apply

        JMenu leave=new JMenu("Apply Leave");
        mb.add(leave);

        JMenuItem facultyleave=new JMenuItem("Faculty Leave");
        facultyleave.setBackground(Color.white);
        facultyleave.addActionListener(this);
        leave.add(facultyleave);

        

        // Leave Details

        JMenu leaveDetails=new JMenu("Leave Details");
        mb.add(leaveDetails);

        JMenuItem facultyleavedetails=new JMenuItem(" Faculty Leave Details");
        facultyleavedetails.setBackground(Color.white);
         facultyleavedetails.addActionListener(this);
        leaveDetails.add(facultyleavedetails);

        JMenuItem studentleavedetails=new JMenuItem("Student Leave Details");
        studentleavedetails.setBackground(Color.white);
         studentleavedetails.addActionListener(this);
        leaveDetails.add(studentleavedetails);

        // Exam

        JMenu exam=new JMenu("Examination");
        mb.add(exam);

        JMenuItem examinationdetails=new JMenuItem("Examination Results");
        examinationdetails.setBackground(Color.white);
        examinationdetails.addActionListener(this);
        exam.add(examinationdetails);

        JMenuItem entermarks=new JMenuItem("Enter Marks");
       entermarks.setBackground(Color.white);
       entermarks.addActionListener(this);
        exam.add(entermarks);

        // UpdateInfo

        JMenu updateInfo=new JMenu("Update Details");
        mb.add(updateInfo);

        JMenuItem updatefacultyinfo=new JMenuItem("Update Faculty Details ");
        updatefacultyinfo.setBackground(Color.white);
          updatefacultyinfo.addActionListener(this);
        updateInfo.add(updatefacultyinfo);

        JMenuItem updateStudentinfo=new JMenuItem("Update Student Details ");
       updateStudentinfo.setBackground(Color.white);
       updateStudentinfo.addActionListener(this);
        updateInfo.add(updateStudentinfo);

        // FEE

        JMenu fee=new JMenu("Fee Details");
        mb.add(fee);

        JMenuItem feestructure=new JMenuItem("Fee Structure");
        feestructure.setBackground(Color.white);
        feestructure.addActionListener(this);
        fee.add(feestructure);

        JMenuItem feeform=new JMenuItem("Student Fee Form");
        feeform.setBackground(Color.white);
        feeform.addActionListener(this);
        fee.add(feeform);

        // Utility

        JMenu utility=new JMenu("Utility");
        mb.add(utility);

        JMenuItem notepad=new JMenuItem("notepad");
        notepad.setBackground(Color.white);
        notepad.addActionListener(this);
        utility.add(notepad);

        JMenuItem calc=new JMenuItem("Calculator");
        calc.setBackground(Color.white);
        calc.addActionListener(this);
        utility.add(calc);

        // About

        JMenu about=new JMenu("About");
        mb.add(about);

        JMenuItem ab=new JMenuItem("About");
        ab.setBackground(Color.white);
        ab.addActionListener(this);
        about.add(ab);
        
        
        // exit

        JMenu exit=new JMenu("Exit");
        mb.add(exit);

        JMenuItem ex=new JMenuItem("Exit");
        ex.setBackground(Color.white);
        ex.addActionListener(this);
        exit.add(ex);
     
        setJMenuBar(mb);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String msg= ae.getActionCommand();
        if(msg.equals("Exit")){
            setVisible(false);
        }
        else if(msg.equals("Calculator")){
            try {
                Runtime.getRuntime().exec("Calc.exe");
            } catch (Exception e) {
               
            }
        }
        else if(msg.equals("notepad")){
            try {
                Runtime.getRuntime().exec("notepad.exe");
            } catch (Exception e) {
               
            } 
        } else if(msg.equals("New Faculty Info")){
                    new AddTeacher();
                    }
        else if(msg.equals("New Student Info")){
            new AddStudent();
        } 
        else if(msg.equals("View Faculty Details")){
            new TeacherDetails();
        }
        
        else if(msg.equals("View Student Details")){
            new StudentDetails();
        }
         
        else if(msg.equals("Faculty Leave")){
            new TeacherLeave();
        }
        
     
        
         else if(msg.equals("Student Leave Details")){
            new StudentLeaveDetails();
        }
        
         else if(msg.equals(" Faculty Leave Details")){
            new TeacherLeaveDetails();
        }
        else if(msg.equals("Update Faculty Details ")){
            new UpdateTeacher();
        }
        else if(msg.equals("Update Student Details ")){
            new UpdateStudent();
        }
        else if(msg.equals("Enter Marks")){
         new EnterMarks();   
    }
        else if(msg.equals("Examination Results")){
         new ExaminationDetails();   
    }
    
                else if(msg.equals("Fee Structure")){
         new FeeStructure();   
    }
        else if(msg.equals("About")){
         new About();   
    }
        else if(msg.equals("Student Fee Form")){
         new StudentFeeForm();   
    }
    
    }
    public static void main(String[] args) {
        new Project1();
    }
}
