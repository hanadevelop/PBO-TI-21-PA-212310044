package com.ibik.pbo;

import javax.swing.JOptionPane;
public class App{
	public static void main(String[] args) {	
			int baris =3;
			int kolom =3;
			
			String out = "";
			String field[] = {"FullName: ", "Address: ", "No Telp: "};
			String isi[]= {"","",""};
			String isi1[]= {"","",""};
			String isi2[]= {"","",""};
			
			for (int i = 0; i < field.length; i++) {
				String in =  JOptionPane.showInputDialog(null, field[i], "Data array ke-1", JOptionPane.QUESTION_MESSAGE);
				isi[i] = in + " ";
				out += isi[i];
			}
			for (int i = 0; i < field.length; i++) {
				String in =  JOptionPane.showInputDialog(null, field[i], "Data array ke-2", JOptionPane.QUESTION_MESSAGE);
				isi1[i] = "\n" + in + " ";
				out += isi1[i];
			}
			for (int i = 0; i < field.length; i++) {
				String in =  JOptionPane.showInputDialog(null, field[i], "Data array ke-3", JOptionPane.QUESTION_MESSAGE);
				isi2[i] = in + " ";
				out += isi2[i];
			}
		
			JOptionPane.showMessageDialog(null, out , "Output Array", JOptionPane.INFORMATION_MESSAGE);
			
		}
}
