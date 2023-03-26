/*
    Kelompok 3 Tugas 2
    - Fachry Azri Arrasyid (2602265211)
    - Nesta Waldemar Binardo Tambunan (2602265136)
    - Renanda Diva Acereistanti (2602269986)
    - Fahrudin Aris Wicaksono (2602269260)
    - Yesika Rodearni Simarmata (2602270073)
*/

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Kel3_Tgs2 {
    public static void main(String[] args)
            throws IOException {
        // inisialisasi variabel
        String nama_mhs,
                nim_mhs;
        int jml_inputan, pilihan,
                jml_ganjil = 0,
                jml_genap = 0,
                jml_fibonaci = 0,
                angka_pertama = 0,
                angka_kedua = 1;
        Integer bilangan_genap_array[] = {},
                bilangan_ganjil_array[] = {},
                bilangan_fibonaci_array[] = {};

        // inisialisasi penggunaan buffer reader untuk string
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // inisialisasi penggunaan scanner untuk integer
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Masukan nama Anda [1..25] : ");
            nama_mhs = reader.readLine();

            // validasi agar nama mahasiswa antara 1 sampai 25 karakter
            while (nama_mhs.length() > 25 || nama_mhs.length() < 1) {
                System.out.println("Nama tidak boleh kurang dari 1 atau lebih dari 25 karakter");
                System.out.print("Masukan nama Anda [1..25] : ");
                nama_mhs = reader.readLine();
            }
            System.out.print("Masukan NIM Anda : ");
            nim_mhs = reader.readLine();

            // validasi agar nim harus 10 karakter
            while (nim_mhs.length() != 10) {
                System.out.println("NIM harus 10 karakter");
                System.out.print("Masukan NIM Anda kembali : ");
                nim_mhs = reader.readLine();
            }

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("Registrasi sukses...");
            System.out.println("Selamat Datang " + nama_mhs + " [NIM : " + nim_mhs + "].. ^^v");
            System.out.println("Mari belajar bermacam-macam deret bilangan");
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.print("Masukan sembarang angka [5..20]: ");
            jml_inputan = scanner.nextInt();
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            // validasi agar inputan antara 5 sampai 20
            while (jml_inputan > 20 || jml_inputan < 5) {
                System.out.println("Jumlah input harus diantara 5 sampai 20");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.print("Masukan sembarang angka [5..20]: ");
                jml_inputan = scanner.nextInt();
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            }
            System.out.println("Deret Bilangan");
            System.out.println("#######################");

            // logic pencarian bilangan ganjil-genap
            for (int i = 1; i <= jml_inputan * 2; i++) {
                // kalau hasil bagi atau modulo = 0 berarti dia genap
                if (i % 2 == 0) {
                    ArrayList<Integer> array_genap = new ArrayList<Integer>(Arrays.asList(bilangan_genap_array));
                    array_genap.add(i);
                    bilangan_genap_array = array_genap.toArray(bilangan_genap_array);
                    jml_genap = jml_genap + i; // mencari jumlah genap
                    // System.out.println("Deret Bilangan " + jml_genap);

                }
                // kalau sebaliknya berarti ganjil
                else {
                    ArrayList<Integer> array_ganjil = new ArrayList<Integer>(Arrays.asList(bilangan_ganjil_array));
                    array_ganjil.add(i);
                    bilangan_ganjil_array = array_ganjil.toArray(bilangan_ganjil_array);
                    jml_ganjil = jml_ganjil + i; // mencari jumlah ganjil
                    // System.out.println("Deret Bilangan " + jml_ganjil);
                }
            }
            // logic fibonachi
            for (int i = 1; i <= jml_inputan; ++i) {
                {
                    int sum = angka_pertama + angka_kedua;
                    angka_pertama = angka_kedua;
                    angka_kedua = sum;
                    ArrayList<Integer> array_fibonachi = new ArrayList<Integer>(Arrays.asList(bilangan_fibonaci_array));
                    array_fibonachi.add(angka_pertama);
                    bilangan_fibonaci_array = array_fibonachi.toArray(bilangan_fibonaci_array);
                    jml_fibonaci = jml_fibonaci + angka_pertama;
                }
            }

            System.out.println(jml_inputan + " Bilangan Genap : ");
            System.out.println("" + Arrays.toString(bilangan_genap_array));
            System.out.println("Hasil penjumlahan : " + jml_genap);
            System.out.println(jml_inputan + " Bilangan Ganjil : ");
            System.out.println("" + Arrays.toString(bilangan_ganjil_array));
            System.out.println("Hasil penjumlahan : " + jml_ganjil);
            System.out.println(jml_inputan + " Bilangan Fibonacci : ");
            System.out.println("" + Arrays.toString(bilangan_fibonaci_array));
            System.out.println("Hasil penjumlahan : " + jml_fibonaci);

            // Pilihan Ulang Program
            System.out.print("Anda ingin mengulang (Y/T) : ");
            scanner.nextLine();
            char ulang = scanner.nextLine().charAt(0);
            pilihan = Character.toUpperCase(ulang);
        } while (pilihan == 'Y' || pilihan == 'y');

    }
}
