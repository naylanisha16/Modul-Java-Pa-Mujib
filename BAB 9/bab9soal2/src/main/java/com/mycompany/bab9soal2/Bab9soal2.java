/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Bab9soal2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       
       System.out.print("Masukkan bilangan awal: ");
       int nilaiAwal = scanner.nextInt ();
       
       System.out.print("Masukkan bilangan akhir: ");
       int nilaiAkhir = scanner.nextInt();
       
       System.out.print("Hasil deret bilangan: ");
       
       int current = nilaiAwal;
       boolean first = true;
       while (current <= nilaiAkhir) {
           if (first) {
               System.out.print (current);
               first = false;
           } else {
               System.out.print(" " + current);
           }
           current += 5;
         
           }
       
       scanner.close();
       }
    }

