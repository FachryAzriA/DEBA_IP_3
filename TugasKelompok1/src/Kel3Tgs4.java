/*
    Kelompok 3 Tugas 4
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

public class Kel3Tgs4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[5];
        int choice = 0;

        do {
            System.out.println("Menu Pilihan:");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");

            System.out.print("Pilihan Anda: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan batas bawah: ");
                    int lowerBound = sc.nextInt();
                    System.out.print("Masukkan batas atas: ");
                    int upperBound = sc.nextInt();
                    generateRandomData(data, lowerBound, upperBound);
                    printData(data);
                    break;
                case 2:
                    bubbleSortAscending(data);
                    break;
                case 3:
                    selectionSortAscending(data);
                    break;
                case 4:
                    bubbleSortDescending(data);
                    break;
                case 5:
                    selectionSortDescending(data);
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (choice != 6);

        sc.close();
    }

    public static void generateRandomData(int[] data, int lowerBound, int upperBound) {
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
    }

    public static void printData(int[] data) {
        System.out.println("Data: " + Arrays.toString(data));
    }

    public static void bubbleSortAscending(int[] data) {
        System.out.println("Simulasi Bubble Sort - Ascending");
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
                printData(data);
            }
        }
    }

    public static void selectionSortAscending(int[] data) {
        System.out.println("Simulasi Selection Sort - Ascending");
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
                printData(data);
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }

public static void bubbleSortDescending(int[] data) {
        System.out.println("Simulasi Bubble Sort - Descending");
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (data[j] < data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
                printData(data);
            }
        }
    }

    public static void selectionSortDescending(int[] data) {
        System.out.println("Simulasi Selection Sort - Descending");
        int n = data.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (data[j] > data[minIndex]) {
                    minIndex = j;
                }
                printData(data);
            }
            int temp = data[i];
            data[i] = data[minIndex];
            data[minIndex] = temp;
        }
    }
}
