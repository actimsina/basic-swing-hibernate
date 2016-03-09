package ooseguru.usermgmt.view;

import ooseguru.usermgmt.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by achyut on 3/9/16.
 */
public class StudentView implements ActionListener {

    JFrame studentFrame;
    JPanel studentPanel;

    JLabel studentNameLbl;
    JTextField studentNameTxtFld;

    JButton addStudentBtn;


    public void createStudentView(){
        studentFrame = new JFrame("Student View");
        studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentFrame.setSize(300,200);

        studentPanel = new JPanel();
        studentNameLbl = new JLabel("Full Name:");
        studentNameTxtFld = new JTextField(20);
        addStudentBtn = new JButton("Add!");

        addStudentBtn.addActionListener(this);

        studentPanel.add(studentNameLbl);
        studentPanel.add(studentNameTxtFld);

        studentFrame.getContentPane().add(BorderLayout.CENTER, studentPanel);
        studentFrame.getContentPane().add(BorderLayout.SOUTH, addStudentBtn);

        studentFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
//        System.out.println(studentNameTxtFld.getText());
        Student s1 = new Student();
        s1.setName(studentNameTxtFld.getText());
        studentNameTxtFld.setText("");

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();

        se.save(s1);

        se.getTransaction().commit();
        se.close();
    }
}
