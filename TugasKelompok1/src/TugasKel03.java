package TugasKelompok1.src;

import java.util.Scanner;

public class TugasKel03 {
    public static void main(String[] args) {
        double totnasgor, totayam, totsteak, totkwetiauw, totkambing, Total, Hasil_Discount, Pembagian_perorang;
        double harganasgor = 9999.99;
        double hargaayam = 12345.67;
        double hargasteak = 21108.40;
        double hargakwetiauw = 13579.13;
        double hargakambing = 98765.43;
        int jlhnasgor, jlhayam, jlhsteak, jlhkwetiauw, jlhkambing;
        Scanner myObj = new Scanner(System.in);
        System.out.print("Selamat Siang...\n\nPesan untuk berapa orang\t: ");
        int jlorg = myObj.nextInt();
        System.out.print("Pesanan atas nama\t\t: ");
        myObj.nextLine();
        String name = myObj.nextLine();
        System.out.println("Menu Spesial hari ini \n===========================================");
        System.out.println("1. Nasi Goreng Spesial\t\t\t\t@ Rp." + harganasgor);
        System.out.println("2. Ayam Bakar Spesial\t\t\t\t@ Rp." + hargaayam);
        System.out.println("3. Steak Sirloin Spesial\t\t\t@ Rp." + hargasteak);
        System.out.println("4. Kwetiaw Siram Spesial\t\t\t@ Rp." + hargakwetiauw);
        System.out.println("5. Kambing Guling Spesial\t\t\t@ Rp." + hargakambing);
        System.out.println(jlorg);
        System.out.println(name);
        System.out.println("Pesanan Anda [batas pesanan 0-10 porsi]");
    }
}
