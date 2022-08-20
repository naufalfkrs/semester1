/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import java.util.Scanner;



/**
 *
 * @author asus
 */
public class lat2 {
    public static void penjumlahan(double a, double b) {
        System.out.println("Hasil dari " + "=" +(a+b));
    }
    public static void pengurangan(double a, double b) {
        System.out.println("Hasil dari " + "=" +(a-b));
    }
    public static void perkalian(double a, double b) {
        System.out.println("Hasil dari " + "=" +(a*b));
    }
    public static void pembagian(double a, double b) {
        System.out.println("Hasil dari " + "=" +(a/b));
    }    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        String operasi;
        System.out.print("Masukkan Angka 1 : ");
        a=input.nextInt();
        System.out.print("Pilih Operasi Matematika : ");
        operasi=input.next();
        System.out.print("Masukkan Angka 2 : ");
        b=input.nextInt();
        
        if (operasi.equals("+")){
            penjumlahan(a,b);
        }
        else if (operasi.equals("-")){
            pengurangan(a,b);
        }
        else if (operasi.equals("*")){
            perkalian(a,b);
        }
        else if (operasi.equals(":")){
            pembagian(a,b);
        }
        else {
            System.out.println("Tidak Ada");
        }
    }
}
