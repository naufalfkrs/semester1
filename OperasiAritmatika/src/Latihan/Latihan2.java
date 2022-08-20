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
public class Latihan2 {
    public static void main(String[]args ){
        int mawar=10,melati=12,matahari=15;
        double harga;
        harga = 4500.5;
        double total, bayar;
        /*operator penugasan*/
        melati+=2;
        /* Operator Aritmatika */
        total=mawar+melati+matahari;
        bayar=total*harga;
        System.out.println("jumlah barang yang dibeli = "+mawar+"+"+melati+"+"+matahari+"="+total);
        System.out.println("total yang dibayar  = Rp"+bayar);
        /* Operator Pembanding */
        boolean perbandingan;
        perbandingan=mawar>melati;
        System.out.println("Bunga mawar > bunga melati "+perbandingan);
        System.out.println("Pembelian bunga mawar lebih banyak daripada bunga matahari dan bunga melati "+perbandingan);
        perbandingan=matahari>mawar;
        System.out.println("Bunga matahari > bunga mawar "+perbandingan);
        System.out.println("Pembelian bunga matahari lebih banyak daripada bunga mawar "+perbandingan); 
    }
}
