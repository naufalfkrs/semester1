/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author asus
 */
public class Evaluasi {
    public static void main(String[]args ){
        int Laptop=7,Hardisk=11,Mouse=21,hargaLaptop,hargaHardisk,hargaMouse,total,bayar;
        hargaLaptop=10000000;
        hargaHardisk=1500000;
        hargaMouse=150000;
        /* Operator penugasan */
        
        Laptop+=5;
        Hardisk-=7;
        Mouse-=9;
        /* Operator aritmatika */
        total=Laptop+Hardisk+Mouse;
        bayar=(hargaLaptop*Laptop)+(hargaHardisk*Hardisk)+(hargaMouse*Mouse);
        System.out.println("Total semua barang "+Laptop+ "+" +Hardisk+ "+" +Mouse+ "=" +total);
        System.out.println("Total Harga yang dibayar Rp"+bayar);
    }
}
