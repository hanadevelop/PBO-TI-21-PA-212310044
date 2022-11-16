package pratikum4;

import javax.swing.JOptionPane;
public class latihan03 {


	public class Latihan03 {
		public static void main(String[] args) {
			JOptionPane jop = new JOptionPane();
			
			int jumlah_arr = Integer.parseInt(jop.showInputDialog(null, "Masukkan jumlah array:", "Input", jop.QUESTION_MESSAGE));
			int arr[] = new int[jumlah_arr];
			String output = "";
			
			for(int i = 0; i < arr.length; i++) {
				int value_arr = Integer.parseInt(jop.showInputDialog(null, "Masukkan angka:", "Data array ke - " + i, jop.QUESTION_MESSAGE));
				arr[i] = value_arr;
				output += "x" + "[" + i + "]" + " = " +arr[i] + "\n";
			}
			
			jop.showMessageDialog(null, output, "Output Array", jop.INFORMATION_MESSAGE);
		}
	}


