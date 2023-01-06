package com.ibik.pbo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppLogistic {

	public static void main(String[] args) {
		int konfirmasi = 0;
		do {
			konfirmasi = JOptionPane.YES_OPTION;
			JOptionPane jop = new JOptionPane();
	
			ArrayList<Integer> pengiriman = new ArrayList<Integer>();
			
			try {       
				String berat = jop.showInputDialog(null,"Masukkan Berat");
			    int berat_check = Integer.parseInt(berat);
			    
			    String jarak = jop.showInputDialog(null,"Masukkan Jarak");
			    int jarak_check = Integer.parseInt(jarak);
			    
			    int total_harga = harga_Pengiriman(berat_check,jarak_check);
			    
				jop.showMessageDialog(null,"Total Harga = " + total_harga + "\nNomor Resi = 123");
				pengiriman.add(123);
				pengiriman.add(total_harga);
				
				int resi = Integer.parseInt(jop.showInputDialog(null,"Masukkan Resi","Lacak Resi",jop.QUESTION_MESSAGE));
				
				if(resi == pengiriman.get(0)) {
					konfirmasi = JOptionPane.showConfirmDialog(null, "No Resi = " + pengiriman.get(0) + "\nTotal Harga = " + pengiriman.get(1),"Apakah Anda Ingin Keluar ?",JOptionPane.YES_NO_OPTION);
				}else {
					JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan","Error Message",jop.ERROR_MESSAGE);
				}
			} catch (NumberFormatException e) {
			    e.printStackTrace();
			    jop.showMessageDialog(null, "Masukkan Harus Angka!", "Error Message", jop.ERROR_MESSAGE);
			}
		}while(konfirmasi == JOptionPane.NO_OPTION);
	}
	
	static int harga_Pengiriman(int paramBerat,int paramJarak) {
		int harga_Berat,harga_Jarak;
		
		if (paramBerat < 100) {
			harga_Berat = 5000;
		}else {
			harga_Berat = (paramBerat / 100) * 5000;
		}
		
		if (paramJarak < 10) {
			harga_Jarak = 8000;
		}else {
			harga_Jarak = (paramJarak / 10) * 8000;
		}
		
		return harga_Berat + harga_Jarak;
	}


	

}


}