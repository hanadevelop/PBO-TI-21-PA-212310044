package latihan3;

import java.util.Scanner;

public class latihan07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String nama;
		
		System.out.print("Masukkan nama \t: ");
		nama = input.nextLine();
		
		System.out.println("Nama awal \t: " + nama);
		System.out.println("Nama format \t: " + nama.replaceAll("[aiueo]", "X"));
		
		input.close();
	}

}

