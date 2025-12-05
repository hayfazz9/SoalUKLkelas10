/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uklnomor3;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class UKLnomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
          System.out.print("Masukkan sebuah bilangan bulat: ");
        int n = input.nextInt();
        
        if (n < 0) {
            System.out.println("Faktorial tidak dapat dihitung untuk bilangan negatif.");
        } else {
            long faktorial = 1;
            String deret="";
            
            for (int i = 1; i <= n; i++){
                faktorial *=i;
                deret += i;
                
                if(i<n){
                    deret += "*";
                }
            }
            System.out.println(deret +" = " + faktorial);
        }
        
        input.close();
    }
}

    

