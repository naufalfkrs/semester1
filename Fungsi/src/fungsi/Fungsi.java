/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

/**
 *
 * @author asus
 */
public class Fungsi {
    public static void hitung(int a, int b) {
        System.out.println((a+b));
    }    
    public static void jumlah() {
        System.out.println("Nilai a dan b adalah");
    }        
    public static void main(String[] args) {
        int a=10, b=2;
        jumlah();
        hitung(a,b);
    }
    
}
