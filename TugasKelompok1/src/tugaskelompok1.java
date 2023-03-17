import java.util.Scanner;

class RestoranBungar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Test punya yesika");
		System.out.println("Selamat Datang di Restoran BUNGAR");
		System.out.println("\n");

		System.out.print("Pesan untuk berapa orang : ");
		int orang = input.nextInt();
		System.out.print("Pesanan atas nama : ");
		String nama = input.nextLine();
		input.nextLine();

		System.out.println("");

		System.out.println("Menu Spesial hari ini");
		System.out.println("=====================");

		String[] menuMakanan = { "Nasi Goreng Spesial", "Ayam Bakar Spesial",
				"Steak Sirloin Spesial", "Kwetiaw Siram Spesial",
				"Kambing Guling Spesial" };
		double[] hargaMakanan = { 9999.99, 12345.67, 21108.40, 13579.13, 98765.43 };


		for (int i = 0; i < menuMakanan.length; i++) {
			System.out.printf("%d. %s - Rp %.2f\n", i + 1, menuMakanan[i], hargaMakanan[i]);
		}

		System.out.println("");
		System.out.println("Tekan ENTER untuk melakukan pemesanan");
		input.nextLine();

		System.out.println("Pesanan Anda [batas pesanan 0-10 porsi]");
		int[] jumlahPesanan = new int[5];
		for (int i = 0; i < menuMakanan.length; i++) {
			System.out.printf("%d. %s = ", i + 1, menuMakanan[i]);
			jumlahPesanan[i] = input.nextInt();

			// kondisi tidak boleh ada pesanan lebih dari 10
			if(jumlahPesanan[i] > 10){
				System.out.println("Pesanan tidak boleh lebih dari 10");
				System.out.printf("%d. %s = ", i + 1, menuMakanan[i]);
				jumlahPesanan[i] = input.nextInt();
			}
		}

		input.nextLine();

		// Hitung harga pembelian masing-masing menu
		double[] hargaPembelian = new double[5];
		for (int i = 0; i < hargaMakanan.length; i++) {
			hargaPembelian[i] = jumlahPesanan[i] * hargaMakanan[i];
		}

		// Hitung total pembelian
		double totalPembelian = 0;
		for (double harga : hargaPembelian) {
			totalPembelian += harga;
		}

		// Hitung harga diskon dan total pembelian setelah diskon
		double hargaDiskon = totalPembelian * 0.1;
		double totalPembelianSetelahDiskon = totalPembelian - hargaDiskon;

		// Hitung pembelian per orang
		double pembelianPerOrang = totalPembelianSetelahDiskon / orang;

		System.out.println("");
		System.out.println("Selamat menikmati makanan anda...");

		System.out.println("");
		System.out.println("Pembelian : ");
		System.out.println("");
		for (int i = 0; i < menuMakanan.length; i++) {
			System.out.printf("%-30s %d x %10.2f = Rp %.2f\n", menuMakanan[i], jumlahPesanan[i], hargaMakanan[i],
					hargaPembelian[i]);
		}
		System.out.println("===========================================");
		System.out.printf("%-30s = Rp %.2f\n", "Total Pembelian", totalPembelian);
		System.out.printf("%-30s = Rp %.2f\n", "Disc. 10% (Masa Promosi)", hargaDiskon);
		System.out.println("===========================================");
		System.out.printf("%-30s = Rp %.2f\n", "Total Pembelian Setelah Diskon", totalPembelianSetelahDiskon);
		System.out.printf("%-30s = Rp %.2f\n", "Pembelian Per Orang", pembelianPerOrang);

		System.out.println("");
		System.out.println("Terima kasih atas kunjungan Anda...");
		System.out.println("...tekan ENTER untuk keluar...");
		input.nextLine();

		input.close();
	}

}
