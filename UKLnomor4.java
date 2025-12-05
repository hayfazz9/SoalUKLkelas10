/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomor4;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UKLnomor4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int angkaBenar = rand.nextInt(100) + 1;  // random 1-100
        ArrayList<Integer> riwayatTebakan = new ArrayList<>();

        int tebakan = 0;

        System.out.println("=== Permainan Tebak Angka ===");

        while (true) {
            System.out.print("Masukkan tebakan Anda (1-100): ");
            tebakan = input.nextInt();

            // simpan ke ArrayList
            riwayatTebakan.add(tebakan);

            if (tebakan == angkaBenar) {
                System.out.println("Anda menebak dengan benar!");
                break; // keluar loop
            } else if (tebakan > angkaBenar) {
                System.out.println("Tebakan terlalu tinggi.");
            } else {
                System.out.println("Tebakan terlalu rendah.");
            }
        }

        // tampilkan seluruh tebakan
        System.out.println("\nRiwayat Tebakan Anda:");
        for (int i = 0; i < riwayatTebakan.size(); i++) {
            System.out.println((i + 1) + ". " + riwayatTebakan.get(i));
        }
    }
}

