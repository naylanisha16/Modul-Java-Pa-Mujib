/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab3soal1;

/**
 *
 * @author ASUS
 */
public class Bab3soal1 {

    public static void main(String[] arga) {
        int i = 1;
        
        while (i <= 5) {
            int j = 1;
            
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            
            System.out.println();
            i++;
        }
    }
}
