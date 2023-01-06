package com.ibik.pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class maven7Latihan1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maven7Latihan1 frame = new maven7Latihan1();
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
	public maven7Latihan1() {
		setTitle("maven7Latihan 1");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 114);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JButton button_Hello = new JButton("Hello");
		button_Hello.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop = new JOptionPane();
				
				jop.showMessageDialog(null, "Hello" ,"You Just Clicked " + button_Hello.getText(), jop.INFORMATION_MESSAGE);
			}
		});
		button_Hello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Hello.setBounds(138, 10, 63, 23);
		contentPane.add(button_Hello);
		
		final JButton button_IBIK = new JButton("IBIK");
		button_IBIK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop = new JOptionPane();
				
				jop.showMessageDialog(null, "IBIK" ,"You Just Clicked " + button_IBIK.getText(), jop.INFORMATION_MESSAGE);
			}
		});
		button_IBIK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_IBIK.setBounds(162, 39, 89, 23);
		contentPane.add(button_IBIK);
		
		final JButton button_Everyone = new JButton("Everyone");
		button_Everyone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane jop = new JOptionPane();
				
				jop.showMessageDialog(null, "Everyone" ,"You Just Clicked " + button_Everyone.getText(), jop.INFORMATION_MESSAGE);
			}
		});
		button_Everyone.setBounds(214, 10, 100, 23);
		contentPane.add(button_Everyone);
	}

}
