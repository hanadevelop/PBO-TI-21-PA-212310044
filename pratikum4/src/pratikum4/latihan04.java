package pratikum4;

public class latihan04 {

		public static void main(String[] args) {
			JOptionPane jop = new JOptionPane();
			
			int jumlah_arr = Integer.parseInt(jop.showInputDialog(null, "Masukkan jumlah array:", "Input", jop.QUESTION_MESSAGE));
			int arr[] = new int[jumlah_arr];
			String output = "";
			int min = 0,max = 0;
			
			for(int i = 0; i < arr.length; i++) {
				int value_arr = Integer.parseInt(jop.showInputDialog(null, "Masukkan angka:", "Data array ke - " + i, jop.QUESTION_MESSAGE));
				arr[i] = value_arr;
				output += "x" + "[" + i + "]" + " = " + arr[i] + "\n";
			}
			
			for(int i = 0; i < arr.length; ++i) {
			    if(arr[0] > arr[i]) {
			    	min = arr[i];
			    }else if(arr[0] < arr[i]) {
			    	max = arr[i];
			    }
			  }
			
			jop.showMessageDialog(null, output + "Nilai terkecil adalah = " + min + "\nNilai terbesar adalah = " + max, "Output Array", jop.INFORMATION_MESSAGE);
		}
	}

}
