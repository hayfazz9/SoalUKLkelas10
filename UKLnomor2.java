/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomor2;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class UKLnomor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka awal");
        int r = input.nextInt();
       
        for (int i = r; i >= 1; i--) {
            System.out.print(i + ". ");

            if (i == r) {
                System.out.println("saya senang");
            } else if (i % 3 == 2) {
                System.out.println("saya anak moklet");
            } else if (i % 3 == 1) {
                System.out.println("saya anak wikusama");
            } else { // i % 3 == 0
                System.out.println("saya angkatan 33");
            }
        }
    }
}
        
         