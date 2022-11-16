package pratikum4;
import javax.swing.JOptionPane;
public class Latihan8 {

		public static void main(String[] args) {
			String field[][] = new String[3][3];
			JOptionPane jop = new JOptionPane();
			String output = "";
			
			field[0][0] = "Nama Lengkap";
			field[0][1] = "Alamat";
			field[0][2] = "No Telp";
			
			for(int i = 0; i < field.length; i++) {
				output += field[0][i] + " ";
			}
			
			output += "\n";
			
			for(int i = 0; i < field.length; i++) {
				for(int j = 0; j < field.length; j++) {
					String isi = jop.showInputDialog(null, "Masukkan " + field[0][j] + ":", "Data array ke-" + i, jop.QUESTION_MESSAGE);
					output += field[1][j] =  " | "  + isi ;
				}
				output += "\n";
			}
			
			jop.showMessageDialog(null, output);
		}
	}


