package com.ibik.pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.Enumeration;

import com.ibik.pbo.praktikum.dao.StudentDao;
import com.ibik.pbo.praktikum.dao.StudentScore;

public class MainMenuu extends JFrame {
	private JTable table_2;
	private JTextField field_Npm;
	private JTextField field_Nama;
	String nilai;
	final ButtonGroup nilai_group = new ButtonGroup();
	private JTextField field_Id;
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
	 * @throws SQLException 
	 */
	public MainMenu() throws SQLException {
		setResizable(false);
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
		
		final JRadioButton rdbtnA = new JRadioButton("A");
		rdbtnA.setBounds(38, 377, 33, 23);
		getContentPane().add(rdbtnA);
		
		final JRadioButton rdbtnB = new JRadioButton("B");
		rdbtnB.setBounds(84, 377, 33, 23);
		getContentPane().add(rdbtnB);
		
		final JRadioButton rdbtnC = new JRadioButton("C");
		rdbtnC.setBounds(130, 377, 33, 23);
		getContentPane().add(rdbtnC);
		
		final JRadioButton rdbtnD = new JRadioButton("D");
		rdbtnD.setBounds(175, 377, 33, 23);
		getContentPane().add(rdbtnD);
		
		final JRadioButton rdbtnE = new JRadioButton("E");
		rdbtnE.setBounds(224, 377, 33, 23);
		getContentPane().add(rdbtnE);
		
		final JRadioButton rdbtnF = new JRadioButton("F");
		rdbtnF.setBounds(269, 377, 33, 23);
		getContentPane().add(rdbtnF);
		
		 	rdbtnA.setActionCommand("A");
		 	nilai_group.add(rdbtnA);
		 	
		 	rdbtnB.setActionCommand("B");
		 	nilai_group.add(rdbtnB);
		 	
		 	rdbtnC.setActionCommand("C");
		 	nilai_group.add(rdbtnC);
		 	
		 	rdbtnD.setActionCommand("D");
		 	nilai_group.add(rdbtnD);
		 	
		 	rdbtnE.setActionCommand("E");
		 	nilai_group.add(rdbtnE);
		 	
		 	rdbtnF.setActionCommand("F");
		 	nilai_group.add(rdbtnF);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table_2.getSelectedRow();
				String id = table_2.getModel().getValueAt(row, 0).toString();
				field_Id.setText((String) id);
				field_Npm.setText((String) table_2.getModel().getValueAt(row, 1));
				field_Nama.setText((String) table_2.getModel().getValueAt(row, 2));
				
				if (table_2.getModel().getValueAt(row, 3).equals("A")) {
					rdbtnA.setSelected(true);
					nilai = "A";
				}else if (table_2.getModel().getValueAt(row, 3).equals("B")) {
					rdbtnB.setSelected(true);
					nilai = "B";
				}else if (table_2.getModel().getValueAt(row, 3).equals("C")) {
					rdbtnC.setSelected(true);
					nilai = "C";
				}else if (table_2.getModel().getValueAt(row, 3).equals("D")) {
					rdbtnD.setSelected(true);
					nilai = "D";
				}else if (table_2.getModel().getValueAt(row, 3).equals("E")) {
					rdbtnE.setSelected(true);
					nilai = "E";
				}else if (table_2.getModel().getValueAt(row, 3).equals("F")) {
					rdbtnF.setSelected(true);
					nilai = "F";
				}
			}
		});
		table_2.setShowVerticalLines(false);
		table_2.setShowHorizontalLines(false);
		table_2.setShowGrid(false);
		StudentDao table1 = new StudentDao();
		table_2.setModel(table1.tabel());
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
		
		field_Npm = new JTextField();
		field_Npm.setBounds(40, 166, 265, 39);
		getContentPane().add(field_Npm);
		field_Npm.setColumns(10);
		
		field_Nama = new JTextField();
		field_Nama.setColumns(10);
		field_Nama.setBounds(40, 267, 265, 39);
		getContentPane().add(field_Nama);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Nama");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(30, 241, 117, 14);
		getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nilai");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(30, 343, 117, 14);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		JButton button_Save = new JButton("Save");
		button_Save.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				nilai = getSelectedButtonGroup(nilai_group);
				if (field_Npm.getText().isEmpty() || field_Nama.getText().isEmpty() || nilai == null) {
					JOptionPane.showMessageDialog(null, "Data tidak lengkap!", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					try {
						InsertScore();
						JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan!");
						Clear();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Data Gagal Disimpan!", "Error", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		button_Save.setBounds(34, 427, 89, 39);
		getContentPane().add(button_Save);
		
		JButton button_Delete = new JButton("Delete");
		button_Delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (field_Npm.getText().equals("") || field_Nama.getText().equals("") || nilai == null) {
					JOptionPane.showMessageDialog(null, "Pilih data yang ingin dihapus!", "Error", JOptionPane.ERROR_MESSAGE);
				}else {
					try {
						DeleteScore();
						JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus!");
						Clear();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Data Gagal Dihapus!");
					}
				}
			}
		});
		button_Delete.setBounds(133, 427, 89, 39);
		getContentPane().add(button_Delete);
		
		JButton button_Clear = new JButton("Clear");
		button_Clear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Clear();
			}
		});
		button_Clear.setBounds(232, 427, 89, 39);
		getContentPane().add(button_Clear);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Form Mahasiswa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(10, 81, 328, 461);
		getContentPane().add(panel);
		
		field_Id = new JTextField();
		field_Id.setColumns(10);
		panel.add(field_Id);
		field_Id.setVisible(false);
	}
	
	private void InsertScore() throws Exception {
		StudentScore studentscore1 = new StudentScore();
		
		studentscore1.setNpm(field_Npm.getText());
		studentscore1.setNama(field_Nama.getText());
		studentscore1.setNilai(nilai);
		
		StudentDao studentdao1 = new StudentDao();
		studentdao1.savedScore(studentscore1);
	}
	
	private void DeleteScore() throws Exception {
		StudentScore studentscore1 = new StudentScore();
		int score_id = Integer.parseInt(field_Id.getText());
		studentscore1.setScoreId(score_id);
		
		StudentDao studentdao1 = new StudentDao();
		String delete_score_id = studentscore1.getScoreId().toString();
		studentdao1.deleteScore(delete_score_id);
	}
	
	private void Clear() {
		field_Npm.setText("");
		field_Nama.setText("");
		field_Id.setText("");
		nilai_group.clearSelection();
	}
	
	 public String getSelectedButtonGroup(ButtonGroup buttonGroup) {
	        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
	            AbstractButton button = buttons.nextElement();

	            if (button.isSelected()) {
	                return button.getText();
	            }
	        }
	        return null;
	    }
	
}



