package ooseguru.view;

import ooseguru.model.User;
import ooseguru.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by achyut on 3/13/16.
 */
public class UserView implements ActionListener {

    JFrame userFrame;
    JPanel userPanel;

    JLabel firstNameLbl;
    JTextField firstNameFld;

    JLabel lastNameLbl;
    JTextField lastNameFld;

    JButton addUserBtn;

    public void createUserView(){
        userFrame = new JFrame("UserView");
        userFrame.setSize(300, 200);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userFrame.setVisible(true);

        firstNameLbl = new JLabel("First Name:");
        firstNameFld = new JTextField(20);

        lastNameLbl = new JLabel("Last Name:");
        lastNameFld = new JTextField(20);

        addUserBtn = new JButton("Add User");
        addUserBtn.addActionListener(this);

        userPanel = new JPanel();
        userPanel.add(firstNameLbl);
        userPanel.add(firstNameFld);

        userPanel.add(lastNameLbl);
        userPanel.add(lastNameFld);
        userPanel.add(addUserBtn);

        userFrame.getContentPane().add(BorderLayout.CENTER,userPanel);
//        userFrame.getContentPane().add(BorderLayout.SOUTH, addUserBtn);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        User u1 = new User();
        u1.setFirstName(firstNameFld.getText());
        u1.setLastName(lastNameFld.getText());
        firstNameFld.setText("");
        lastNameFld.setText("");

        Session se = HibernateUtil.getSessionFactory().openSession();
        se.beginTransaction();

        se.save(u1);

        se.getTransaction().commit();
        se.close();
    }
}
