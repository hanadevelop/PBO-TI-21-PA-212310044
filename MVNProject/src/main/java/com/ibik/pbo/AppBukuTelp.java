package com.ibik.pbo;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AppBukuTelp {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		int ordo = 3;
		String output = "";
		
		ArrayList<ArrayList<String> > field =
		new ArrayList<ArrayList<String> >();
		
		for (int i = 0; i <= ordo; i++) {
			field.add(new ArrayList<String>());
		}
		
		field.get(0).add(0, "Nama Lengkap");
		field.get(0).add(1, "Alamat");
		field.get(0).add(2, "No Telp");
		
		output += "\n";
		
		for(int i = 1; i <= ordo; i++) {
			for(int j = 0; j < ordo; j++) {
				String isi = jop.showInputDialog(null, "Masukkan " + field.get(0).get(j) + ":", "Data array ke-" + i, jop.QUESTION_MESSAGE);
				field.get(i).add(j, isi);
				output += field.get(0).get(j) + ": " + field.get(i).get(j) + "\n";
			}
			output += "\n";
		}
		
		jop.showMessageDialog(null,output);
	}
}