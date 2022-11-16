package pratikum4;

import javax.swing.JOptionPane;
public class Latihan7 {
	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		int arr1[][] = new int[2][2];
		int arr2[][] = new int[2][2];
		JOPtionPane jop = new JOptionPane();
		String output = "Matriks A" + "\n";
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				String a = jop.showInputDialog(null, "Masukkan angka:", "Matrix A" + "[" + i + "]" + "[" + j + "]", jop.QUESTION_MESSAGE);
				arr[i][j] = Integer.parseInt(a);
				output += arr[i][j] + " ";
				arr2[i][j] = arr[i][j];
			}
			output += "\n";
		}
		
		output += "Matriks B" + "\n";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				String b = jop.showInputDialog(null, "Masukkan angka:", "Matrix B" + "[" + i + "]" + "[" + j + "]", jop.QUESTION_MESSAGE);
				arr1[i][j] = Integer.parseInt(b);
				arr2[i][j] -= arr1[i][j];
				output += arr1[i][j] + " ";
			}
			output += "\n";
		}
		
		output += "Matriks C" + "\n";
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				output += arr2[i][j] + " ";
			}
			output += "\n";
		}
		
		jop.showMessageDialog(null, output);
	}
}


