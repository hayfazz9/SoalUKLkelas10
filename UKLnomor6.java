/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomor6;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class UKLnomor6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Nama pelanggan: ");
        String nama = input.nextLine();

        System.out.print("Golongan listrik (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Jumlah pemakaian listrik (kWh): ");
        int pemakaian = input.nextInt();

        // Menentukan tarif
        int tarif = 0;
        switch (golongan) {
            case 'A':
                tarif = 1200;
                break;
            case 'B':
                tarif = 1500;
                break;
            case 'C':
                tarif = 1800;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return;
        }

        // Menghitung total tagihan
        double totalAwal = pemakaian * tarif;
        double tambahan = 0;

        if (pemakaian > 500) {
            tambahan = totalAwal * 0.10;  // biaya tambahan 10%
        }

        double totalAkhir = totalAwal + tambahan;

        // Output
        System.out.println("\n===== HASIL TAGIHAN LISTRIK =====");
        System.out.println("Nama pelanggan           : " + nama);
        System.out.println("Golongan listrik         : " + golongan);
        System.out.println("Pemakaian listrik (kWh)  : " + pemakaian);
        System.out.println("Total sebelum tambahan   : Rp " + totalAwal);
        System.out.println("Biaya tambahan           : Rp " + tambahan);
        System.out.println("Total tagihan akhir      : Rp " + totalAkhir);
    }
}

