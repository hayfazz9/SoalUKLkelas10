/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomor7;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class UKLnomor7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah paket photobooth: ");
        int jumlahPaket = sc.nextInt();
        sc.nextLine(); // buang enter

        // Array untuk menyimpan data
        String[] nama = new String[jumlahPaket];
        int[] biayaProduksi = new int[jumlahPaket];
        int[] hargaJual = new int[jumlahPaket];
        int[] jumlahEvent = new int[jumlahPaket];

        int[] totalBiaya = new int[jumlahPaket];
        int[] totalPendapatan = new int[jumlahPaket];
        int[] labaRugi = new int[jumlahPaket];
        String[] status = new String[jumlahPaket];

        int totalLabaRugiKeseluruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String paketLabaTertinggi = "";

        // Input data tiap paket
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("\n=== Paket ke-" + (i + 1) + " ===");
            
            System.out.print("Nama paket: ");
            nama[i] = sc.nextLine();

            System.out.print("Biaya produksi per event: ");
            biayaProduksi[i] = sc.nextInt();

            System.out.print("Harga jual per event: ");
            hargaJual[i] = sc.nextInt();

            System.out.print("Jumlah event terjual: ");
            jumlahEvent[i] = sc.nextInt();
            sc.nextLine(); // buang enter

            // Hitungan
            totalBiaya[i] = biayaProduksi[i] * jumlahEvent[i];
            totalPendapatan[i] = hargaJual[i] * jumlahEvent[i];
            labaRugi[i] = totalPendapatan[i] - totalBiaya[i];

            // Tentukan status
            if (labaRugi[i] > 0) status[i] = "Laba";
            else if (labaRugi[i] < 0) status[i] = "Rugi";
            else status[i] = "Impas";

            // Total laba/rugi keseluruhan
            totalLabaRugiKeseluruhan += labaRugi[i];

            // Cari laba tertinggi
            if (labaRugi[i] > labaTertinggi) {
                labaTertinggi = labaRugi[i];
                paketLabaTertinggi = nama[i];
            }
        }

        // Output tabel
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Nama Paket   | Total Biaya | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.printf(
                "%-12s | Rp%,d | Rp%,d | Rp%,d | %s\n",
                nama[i], totalBiaya[i], totalPendapatan[i], labaRugi[i], status[i]
            );
        }
        System.out.println("---------------------------------------------------------");

        // Total laba/rugi semua paket
        System.out.println("Total Laba/Rugi Keseluruhan: Rp" + String.format("%,d", totalLabaRugiKeseluruhan));

        // Paket laba tertinggi
        System.out.println("Paket dengan Laba Tertinggi: " + paketLabaTertinggi +
                           " (Rp" + String.format("%,d", labaTertinggi) + ")");
    }
}
