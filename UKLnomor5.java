/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomor5;

/**
 *
 * @author LENOVO
 */
public class UKLnomor5 {
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 3, 3, 4};

        boolean[] sudahDihitung = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {

            if (sudahDihitung[i] == false) {
                int count = 1;

                // hitung kemunculan elemen array[i]
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == array[i]) {
                        count++;
                        sudahDihitung[j] = true;
                    }
                }

                // tampilkan hasil
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }
    }
}

