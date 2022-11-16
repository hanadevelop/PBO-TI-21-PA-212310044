import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Latihan9 {
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		int jumlah_arr = Integer.parseInt(jop.showInputDialog(null, "Masukkan jumlah array:", "Input", jop.QUESTION_MESSAGE));	
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String output = "";
		int min = 0,max = 0;
		
		for(int i = 0; i < jumlah_arr; i++) {
			int value_arr = Integer.parseInt(jop.showInputDialog(null, "Masukkan angka:", "Data array ke - " + i, jop.QUESTION_MESSAGE));
			arr.add(value_arr);
			output += "x" + "[" + i + "]" + " = " + arr.get(i) + "\n";
		}
		
		for(int i = 0; i < jumlah_arr; ++i) {
		    if(arr.get(0) > arr.get(i)) {
		    	min = arr.get(i);
		    }else if(arr.get(0) < arr.get(i)) {
		    	max = arr.get(i);
		    }
		  }
		
		jop.showMessageDialog(null, output + "Nilai terkecil adalah = " + min + "\nNilai terbesar adalah = " + max, "Output Array", jop.INFORMATION_MESSAGE);
	}
}

}
