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
public class Latihan1 {
    public static void main(String[] args) {
        // inisialisasi sebagai stok
        int semangka=6, jambu=5;
        double hargasemangka, hargajambu;
        hargasemangka = 3000.0;
        hargajambu = 4000.0;
        double total,bayar;
        /*operator penugasan (pembelian yang mengurangi stok)*/ 
        jambu-=2; 
        semangka-=3;
        /* Operator Aritmatika (total barang tersedia)*/
        total=semangka+jambu;
        System.out.println("jumlah barang yang tersedia =" +semangka+ "+" +jambu+ 
                "=" +total);
        bayar= (total*hargajambu)+(total*hargasemangka);
        //total aset yang dimiliki
        System.out.println("total aset yang dimiliki  = Rp"+bayar);    
    }
}
