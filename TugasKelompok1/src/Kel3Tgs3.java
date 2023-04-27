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

public class Kel3Tgs3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Coepoe Word Puzzle");
            System.out.println("==================");
            System.out.println("");
            System.out.println("Rules :");
            System.out.println("1. Create a word using given characters, min 3 characters & max 6 characters.");
            System.out.println("2. Each level, You have 10 chances to answer correctly.");
            System.out.println("3. To get through to next level, you have to score 70 points each level.");
            System.out.println("");
            System.out.println("Level 1");
            System.out.println("=======");

            // Pilihan Ulang Program
            System.out.print("Anda ingin mengulang (Y/T) : ");
            input.nextLine();
            char ulang = input.nextLine().charAt(0);
            pilihan = Character.toUpperCase(ulang);
        } while (pilihan == 'Y');

    }
}
