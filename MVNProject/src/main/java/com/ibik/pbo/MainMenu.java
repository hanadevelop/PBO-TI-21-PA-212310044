package com.ibik.pbo;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends JFrame {
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu frame = new MainMenu();
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
	public MainMenu() {
		setTitle("Latihan 04");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 899, 614);
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu_File = new JMenu("File");
		menuBar.add(menu_File);
		
		JMenuItem new_MenuItem = new JMenuItem("New");
		menu_File.add(new_MenuItem);
		
		JMenuItem save_MenuItem = new JMenuItem("Save");
		menu_File.add(save_MenuItem);
		
		JMenuItem exit_MenuItem = new JMenuItem("Exit");
		menu_File.add(exit_MenuItem);
		
		JMenu menu_Edit = new JMenu("Edit");
		menuBar.add(menu_Edit);
		
		JMenu menu_Help = new JMenu("Help");
		menuBar.add(menu_Help);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(348, 88, 535, 454);
		getContentPane().add(scrollPane);
		
		table_2 = new JTable();
		table_2.setShowVerticalLines(false);
		table_2.setShowHorizontalLines(false);
		table_2.setShowGrid(false);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"212310018", "FATHURAHMAN AL FARIDZI", "B"},
				{"212310019", "MUHAMMAD RAFI ZUHAIR ARTA", "C"},
				{"212310020", "MUHAMAD SUBHAN RIZKI AFIA", "A"},
			},
			new String[] {
				"NPM", "Nama", "Nilai"
			}
		));
		table_2.getColumnModel().getColumn(0).setMaxWidth(150);
		scrollPane.setViewportView(table_2);
		
		JLabel lblNewLabel = new JLabel("FORM PENILAIAN MATA KULIAH PBO ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(164, 11, 553, 58);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("NPM");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(30, 140, 117, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(40, 166, 265, 39);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(40, 267, 265, 39);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nama");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(30, 241, 117, 14);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nilai");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(30, 343, 117, 14);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("A");
		rdbtnNewRadioButton.setBounds(38, 377, 33, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(84, 377, 33, 23);
		getContentPane().add(rdbtnB);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(130, 377, 33, 23);
		getContentPane().add(rdbtnC);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBounds(175, 377, 33, 23);
		getContentPane().add(rdbtnD);
		
		JRadioButton rdbtnE = new JRadioButton("E");
		rdbtnE.setBounds(224, 377, 33, 23);
		getContentPane().add(rdbtnE);
		
		JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(269, 377, 33, 23);
		getContentPane().add(rdbtnF);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(34, 427, 89, 39);
		getContentPane().add(btnNewButton);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(133, 427, 89, 39);
		getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(232, 427, 89, 39);
		getContentPane().add(btnClear);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Form Mahasiswa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 81, 328, 461);
		getContentPane().add(panel);
		
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
	}
}



