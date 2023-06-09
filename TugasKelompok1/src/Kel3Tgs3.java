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
        int pilihan,
                scores_lvl1 = 0,
                scores_lvl2 = 0,
                scores_lvl3 = 0,
                v_debug = 0,
                v_ngulang = 0;

        // array untuk menyimpan data jawaban dan inputan user
        String[] arr_AnswerWord_lvl1 = { "die", "led", "lei", "let", "lid", "lie", "lit", "tie", "deli", "diet", "edit",
                "tilt", "idle", "lied", "tide", "tied", "tile", "tilde", "tiled", "title", "tilted", "titled" },
                arr_InputWord_lvl1,
                arr_AnswerWord_lvl2 = { "sec", "can", "cane", "scan", "scene",
                        "case", "cease", "acne", "canes", "seen", "see", "sane", "ease" },
                arr_InputWord_lvl2,
                arr_AnswerWord_lvl3 = { "honk", "honker", "roe", "ore", "her",
                        "hen", "one", "hero", "hoke", "kern", "heron", "ken" },
                arr_InputWord_lvl3;

        // inisialisasi penggunaan buffer reader untuk string
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // inisialisasi penggunaan scanner untuk integer
        Scanner scanner = new Scanner(System.in);

        // try and catch
        try {

            System.out.println("Coepoe Word Puzzle");
            System.out.println("================================");
            System.out.println("");
            System.out.println("Rules : ");
            System.out.println("1. Create a word using given character, min 3 characters and max 6 characters.");
            System.out.println("2. Each level. You have 10 changes to answer correctly");
            System.out.println("3. To get through next level, you have to score minimum 70 point each level.");
            System.out.println("");

            // inisiasi array level 1
            arr_InputWord_lvl1 = new String[15];
            CoepoeLvl_Class m = new CoepoeLvl_Class();
            v_debug = 1;

            // level 1
            scores_lvl1 = m.CoepoeLvl1(arr_InputWord_lvl1, arr_AnswerWord_lvl1);

            // kalau skor lvl 1 kurang dari 70 gak bisa lanjut ke lvl 2
            if (scores_lvl1 < 70) {
                System.out.println("You lose !! Try again ");
                System.out.println("Do you want to retry? [y/t] ?");
                scanner.nextLine();
                // char ulang = scanner.nextLine().charAt(0);
                // pilihan = Character.toUpperCase(ulang);
                v_ngulang = 1;
            } else {
                System.out.println(" ");
                // inisiasi array level 2
                arr_InputWord_lvl2 = new String[15];
                v_debug = 2;

                // level 2
                scores_lvl2 = m.CoepoeLvl2(arr_InputWord_lvl2, arr_AnswerWord_lvl2);
            }

            // kalau skor lvl 2 kurang dari 70 gak bisa lanjut ke lvl 3
            if (scores_lvl2 < 70) {
                System.out.println("You lose !! Try again ");
                System.out.println("Do you want to retry? [y/t] ?");
                scanner.nextLine();
                // char ulang = scanner.nextLine().charAt(0);
                // pilihan = Character.toUpperCase(ulang);
                v_ngulang = 1;
            } else {
                // inisiasi array level 3
                System.out.println(" ");
                arr_InputWord_lvl3 = new String[15];
                v_debug = 3;

                // level 2
                scores_lvl3 = m.CoepoeLvl3(arr_InputWord_lvl3, arr_AnswerWord_lvl3);
            }

            // kalau skor lvl 3 kurang dari 70 berarti dianggap kalah
            if (scores_lvl3 < 70) {
                System.out.println("You lose !! Try again ");
                System.out.println("Do you want to retry? [y/t] ?");
                scanner.nextLine();
                // char ulang = scanner.nextLine().charAt(0);
                // pilihan = Character.toUpperCase(ulang);
                v_ngulang = 1;
            } else {
                System.out.println("Overall score :  " + (scores_lvl3 + scores_lvl2 + scores_lvl1));
                System.out.println("You win !!! ");
                System.out.println("press enter to exit");
            }

        } catch (Exception e) {
            System.out.println("Ada yang salah dengan program yang Anda jalankan");
            System.out.println("Program terdapat masalah : " + e);
            System.out.println("lihat pada poin v_debug = " + v_debug);
            System.out.println(" ");
        }
    }

    public static class CoepoeLvl_Class {
        // inisialisasi penggunaan buffer reader untuk string
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // inisialisasi penggunaan scanner untuk integer
        Scanner scanner = new Scanner(System.in);
        int v_scores_lvl1;
        int v_scores_lvl2;
        int v_scores_lvl3;

        // function level 1
        public int CoepoeLvl1(String[] p_input_array_lvl1, String[] p_answer_word_lvl1)
                throws IOException {
            // cek kata. Kalau 0 berarti enggak ada. Kalau 1 ada
            int word_check = 0;

            System.out.println("Level 1");
            System.out.println("-------");
            System.out.println(" t e d t l i ");
            // iterasi 10 kali kesempatan menjawab
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "> your answer : ");
                // String jawaban = String.valueOf(scanner.next().charAt(0));
                String jawaban = scanner.nextLine();

                // string harus antara 3 sampai 6 karakter
                while (jawaban.length() < 3 || jawaban.length() > 6) {
                    // System.out.print("Panjang string : "+jawaban.length());
                    System.out.println("Character length must be between 3 and 6.");
                    System.out.println(i + "> your answer : ");
                    jawaban = scanner.nextLine();
                }

                /*
                 * if(jawaban.toLowerCase().equals(p_answer_word_lvl1[0]))
                 * {
                 * System.out.println("Sama");
                 * }
                 */

                // cek udah pernah diinput atau belum
                for (String j : p_input_array_lvl1) {
                    if (jawaban.toLowerCase().equals(j)) {
                        word_check = 1;
                        break;
                    }
                }

                // cocokin jawaban dengan kunci jawaban
                for (String j : p_answer_word_lvl1) {
                    // kalau ada yang sama dan tidak berulang
                    if (jawaban.toLowerCase().equals(j)) {
                        // kalau belum di input
                        if (word_check == 0) {
                            v_scores_lvl1 += 10;
                            System.out.println("#RIGHT your score : " + v_scores_lvl1);
                            p_input_array_lvl1[i] = jawaban;
                            break;
                        }
                        // kalau udah diinput
                        else {
                            System.out.println(" You had already type this word before ..");
                            word_check = 0;
                        }
                    }
                }
            }
            System.out.printf("You had answered 10 time with %d right answers...\n", v_scores_lvl1 / 10);
            System.out.println("");
            System.out.println("Correct Answers :");
            System.out.println(Arrays.toString(p_answer_word_lvl1) + " ");
            return v_scores_lvl1;
        }

        // function level 2
        public int CoepoeLvl2(String[] p_input_array_lvl2, String[] p_answer_word_lvl2)
                throws IOException {
            // cek kata. Kalau 0 berarti enggak ada. Kalau 1 ada
            int word_check = 0;

            System.out.println("Level 2");
            System.out.println("-------");
            System.out.println(" n a c e s e ");
            // iterasi 10 kali kesempatan menjawab
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "> your answer : ");
                // String jawaban = String.valueOf(scanner.next().charAt(0));
                String jawaban = scanner.nextLine();

                // string harus antara 3 sampai 6 karakter
                while (jawaban.length() < 3 || jawaban.length() > 6) {
                    // System.out.print("Panjang string : "+jawaban.length());
                    System.out.println("Character length must be between 3 and 6.");
                    System.out.println(i + "> your answer : ");
                    jawaban = scanner.nextLine();
                }

                /*
                 * if(jawaban.toLowerCase().equals(p_answer_word_lvl1[0]))
                 * {
                 * System.out.println("Sama");
                 * }
                 */

                // cek udah pernah diinput atau belum
                for (String j : p_input_array_lvl2) {
                    if (jawaban.toLowerCase().equals(j)) {
                        word_check = 1;
                        break;
                    }
                }

                // cocokin jawaban dengan kunci jawaban
                for (String j : p_answer_word_lvl2) {
                    // kalau ada yang sama dan tidak berulang
                    if (jawaban.toLowerCase().equals(j)) {
                        // kalau belum di input
                        if (word_check == 0) {
                            v_scores_lvl2 += 10;
                            System.out.println("#RIGHT your score : " + v_scores_lvl2);
                            p_input_array_lvl2[i] = jawaban;
                            break;
                        }
                        // kalau udah diinput
                        else {
                            System.out.println(" You had already type this word before ..");
                            word_check = 0;
                        }
                    }
                }
            }
            System.out.printf("You had answered 10 time with %d right answers...\n", v_scores_lvl2 / 10);
            System.out.println("");
            System.out.println("Correct Answers :");
            System.out.println(Arrays.toString(p_answer_word_lvl2) + " ");
            return v_scores_lvl2;
        }

        // function level 3
        public int CoepoeLvl3(String[] p_input_array_lvl3, String[] p_answer_word_lvl3)
                throws IOException {
            // cek kata. Kalau 0 berarti enggak ada. Kalau 1 ada
            int word_check = 0;

            System.out.println("Level 3");
            System.out.println("-------");
            System.out.println(" k r o n e h ");
            // iterasi 10 kali kesempatan menjawab
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + "> your answer : ");
                // String jawaban = String.valueOf(scanner.next().charAt(0));
                String jawaban = scanner.nextLine();

                // string harus antara 3 sampai 6 karakter
                while (jawaban.length() < 3 || jawaban.length() > 6) {
                    // System.out.print("Panjang string : "+jawaban.length());
                    System.out.println("Character length must be between 3 and 6.");
                    System.out.println(i + "> your answer : ");
                    jawaban = scanner.nextLine();
                }

                /*
                 * if(jawaban.toLowerCase().equals(p_answer_word_lvl1[0]))
                 * {
                 * System.out.println("Sama");
                 * }
                 */

                // cek udah pernah diinput atau belum
                for (String j : p_input_array_lvl3) {
                    if (jawaban.toLowerCase().equals(j)) {
                        word_check = 1;
                        break;
                    }
                }

                // cocokin jawaban dengan kunci jawaban
                for (String j : p_answer_word_lvl3) {
                    // kalau ada yang sama dan tidak berulang
                    if (jawaban.toLowerCase().equals(j)) {
                        // kalau belum di input
                        if (word_check == 0) {
                            v_scores_lvl3 += 10;
                            System.out.println("#RIGHT your score : " + v_scores_lvl3);
                            p_input_array_lvl3[i] = jawaban;
                            break;
                        }
                        // kalau udah diinput
                        else {
                            System.out.println(" You had already type this word before ..");
                            word_check = 0;
                        }
                    }
                }
            }
            System.out.printf("You had answered 10 time with %d right answers... \n", v_scores_lvl3 / 10);
            System.out.println("");
            System.out.println("Correct Answers :");
            System.out.println(Arrays.toString(p_answer_word_lvl3) + " ");
            System.out.println("");
            return v_scores_lvl3;
        }
    }
}
