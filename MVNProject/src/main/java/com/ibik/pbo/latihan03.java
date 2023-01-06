package com.ibik.pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class latihan03 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField field_Email;
	private JTextField field_Password;
	private JButton button_Login;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					latihan03 frame = new latihan03();
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
	public latihan03() {
		setResizable(false);
		setTitle("Login Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 258, 182);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label_Email = new JLabel("Email");
		label_Email.setBounds(10, 14, 46, 14);
		contentPane.add(label_Email);
		
		field_Email = new JTextField();
		field_Email.setColumns(10);
		field_Email.setBounds(99, 11, 133, 20);
		contentPane.add(field_Email);
		
		JLabel label_Password = new JLabel("Password");
		label_Password.setBounds(10, 42, 79, 14);
		contentPane.add(label_Password);
		
		field_Password = new JTextField();
		field_Password.setColumns(10);
		field_Password.setBounds(99, 39, 133, 20);
		contentPane.add(field_Password);
		
		JCheckBox cb_RemPassword = new JCheckBox("Remember Password");
		cb_RemPassword.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cb_RemPassword.setBounds(99, 66, 125, 23);
		contentPane.add(cb_RemPassword);
		
		button_Login = new JButton("LOGIN");
		button_Login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (field_Email.getText().equals("") || field_Password.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Silakan mengisi data dengan benar", "Error", JOptionPane.ERROR_MESSAGE);
				}else if (field_Email.getText().equals("test@gmail.com") && field_Password.getText().equals("123")) {
					JOptionPane.showMessageDialog(null, "Selamat Datang Ferdy");
				}else {
					JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button_Login.setBounds(99, 96, 133, 30);
		contentPane.add(button_Login);
	}


}
