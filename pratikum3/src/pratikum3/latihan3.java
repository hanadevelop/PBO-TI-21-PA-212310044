package pratikum3;

import javax.swing.JOptionPane;
import java.util.regex.Pattern;

public class latihan3 {
	public static void main(String[] args) {
		biodata myBio = new biodata();
		
		String fullname, alamat, age;
		
		fullname = JOptionPane.showInputDialog(
				null, 
				"Input your fullname:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		);
		
		alamat = JOptionPane.showInputDialog(
				null, 
				"Input your address:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		);
		
		age = JOptionPane.showInputDialog(
				null, 
				"Input your age:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		);
		
		if(fullname.isEmpty() && alamat.isEmpty() && age.isEmpty()) {
				JOptionPane.showMessageDialog(
						null, 
						"Field fullname/usia/alamat tidak boleh kosong", 
						"Error Message", 
						JOptionPane.ERROR_MESSAGE);
		}

		else 
			if(!Pattern.matches("^[0-9]+$", age)) {
			JOptionPane.showMessageDialog(
					null, 
					"Isian usia harus angka",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		
		else if(alamat.length() < 10) {
			JOptionPane.showMessageDialog(
					null, 
					"Masukan alamat minimum 10 karakter",
					"Error Message", 
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(
					null, 
					"Seluruh informasi telah dimasukan",
					"Output Message", 
					JOptionPane.INFORMATION_MESSAGE);
		}
		
		
	}

}


