package com.ibik.pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.ibik.pbo.praktikum.dao.Student;
import com.ibik.pbo.praktikum.dao.StudentDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registerr extends JFrame {

	private JPanel contentPane;
	private JTextField field_Email;
	private JTextField field_Fullname;
	private JTextField field_Phone;
	private JLabel label_Gender;
	private JTextField field_Password;
	String gender = "";
	String citizenship = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setTitle("Register");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 284);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel label_Fullname = new JLabel("Fullname");
		label_Fullname.setBounds(26, 11, 46, 14);
		contentPane.add(label_Fullname);
		
		field_Email = new JTextField();
		field_Email.setBounds(82, 39, 133, 20);
		contentPane.add(field_Email);
		field_Email.setColumns(10);
		
		final JLabel label_Email = new JLabel("Email");
		label_Email.setBounds(26, 42, 46, 14);
		contentPane.add(label_Email);
		
		field_Fullname = new JTextField();
		field_Fullname.setColumns(10);
		field_Fullname.setBounds(82, 8, 133, 20);
		contentPane.add(field_Fullname);
		
		final JLabel label_Phone = new JLabel("Phone");
		label_Phone.setBounds(26, 73, 46, 14);
		contentPane.add(label_Phone);
		
		field_Phone = new JTextField();
		field_Phone.setColumns(10);
		field_Phone.setBounds(82, 70, 133, 20);
		contentPane.add(field_Phone);
		
		label_Gender = new JLabel("Gender");
		label_Gender.setBounds(26, 101, 46, 14);
		contentPane.add(label_Gender);
		
		final JRadioButton rb_Female = new JRadioButton("Female");
		rb_Female.setBounds(82, 97, 59, 23);
		contentPane.add(rb_Female);
		
		final JRadioButton rb_Male = new JRadioButton("Male");
		rb_Male.setBounds(156, 97, 59, 23);
		contentPane.add(rb_Male);
		
		ButtonGroup gender_group = new ButtonGroup();
		gender_group.add(rb_Male);
		gender_group.add(rb_Female);
		
		final JLabel label_Citizenship = new JLabel("Citizenship");
		label_Citizenship.setBounds(21, 129, 51, 14);
		contentPane.add(label_Citizenship);
		
		final JComboBox cb_Citizenship = new JComboBox();
		cb_Citizenship.setModel(new DefaultComboBoxModel(new String[] {"Indonesia", "Malaysia", "Singapore", "Laos", "Cambodia"}));
		cb_Citizenship.setToolTipText("");
		cb_Citizenship.setBounds(82, 127, 133, 22);
		contentPane.add(cb_Citizenship);
		
		JButton button_Submit = new JButton("SUBMIT");
		button_Submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (field_Fullname.getText().equals("") || field_Email.getText().equals("") || field_Phone.getText().equals("") || (rb_Female.isSelected() == false && rb_Male.isSelected() == false) || cb_Citizenship.getSelectedItem().equals("")) {
					JOptionPane.showMessageDialog(null, "Data tidak boleh kosong. Silakan periksa kembali\r\n"
							+ "isian anda","Error",JOptionPane.ERROR_MESSAGE);
				}else {
					if (rb_Female.isSelected() == true) {
						gender = "Female";
					}else {
						gender = "Male";
					}
					JOptionPane.showMessageDialog(null, label_Fullname.getText() + " : " + field_Fullname.getText() + "\n" + label_Email.getText() + " : " + field_Email.getText() +  "\n" + label_Phone.getText() + " : " + field_Phone.getText()  +  "\n" + label_Gender.getText() + " : " + gender + "\n" + label_Citizenship.getText() + " : " + cb_Citizenship.getSelectedItem());
					citizenship = (String) cb_Citizenship.getSelectedItem();
					
					try {
						Insert();
						JOptionPane.showMessageDialog(null, "Berhasil Disimpan!");
						new Login().setVisible(true);
						dispose();
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Gagal Menyimpan!"+e1.getMessage());
						e1.printStackTrace();
					}
				}
			}
		});
		
		button_Submit.setBounds(82, 191, 136, 30);
		contentPane.add(button_Submit);
		
		JLabel label_Password = new JLabel("Password");
		label_Password.setBounds(26, 163, 46, 14);
		contentPane.add(label_Password);
		
		field_Password = new JTextField();
		field_Password.setColumns(10);
		field_Password.setBounds(82, 160, 133, 20);
		contentPane.add(field_Password);
	}
	
	private void Insert() throws Exception {
		Student student1 = new Student();
		student1.setFullname(field_Fullname.getText());
		student1.setEmail(field_Email.getText());
		student1.setPhone(field_Phone.getText());
		student1.setGender(gender);
		student1.setCitizenship(citizenship);
		student1.setPassword(field_Password.getText());
		
		StudentDao studentdao1 = new StudentDao();
		studentdao1.saved(student1);
	}
}


