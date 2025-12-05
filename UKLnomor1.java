/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomor1;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class UKLnomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        
        System.out.print("Masukkan jumlah elemen Fibonacci: ");
        int n = input.nextInt();
        

        int a = 0, b = 1;
        int jumlahGanjil = 0;
        int jumlahGenap = 0;
        
        if(n > 1000){
            System.out.println("Angka terlalu besar");
            return;
        }
     
        System.out.println("Deret Fibonacci:");
        
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            if(n > 100){
            System.out.println("Angka terlalu besar");
               return;
        }
    
            if (a % 2 == 0) {
                jumlahGenap++;
            } else {
                jumlahGanjil++;
            }

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\n-----------------------------");
        System.out.println("Jumlah bilangan genap : " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}