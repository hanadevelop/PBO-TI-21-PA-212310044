package pratikum4;
import javax.swing.JOptionPane;

public class Latihan6 {
	public static void main(String[] args) {
		String field[] = {"Nama Lengkap", "Alamat", "No Telp"};
		JOptionPane jop = new JOptionPane();
		String output = "";
		
		for(int i = 0; i < field.length; i++) {
			String isi = jop.showInputDialog(null, "Masukkan " + field[i] + ":", "Data array ke-" + i, jop.QUESTION_MESSAGE);
			output += field[i] + ":" + " " + isi + "\n";
		}
		
		jop.showMessageDialog(null, output);
	}
}


