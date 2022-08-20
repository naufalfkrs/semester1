/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg8;



/**
 *
 * @author asus
 */
public class Challenge {
    public static void main(String[] args) {                
        String barang[][]={
            {"Supreme Mie","5","10000"},
            {"Mie Sadaap", "3", "5000"},
            {"Selera Rakyat", "10", "4500"},
            {"Live Boy", "20", "3000"},
        };  
        int jumlahitem=0,totalharga=0;        
        for (int i = 0; i < barang.length; i++) {
            jumlahitem=jumlahitem+Integer.parseInt(barang[i][1]);
        int jumlah=Integer.parseInt(barang[i][1]);
        int harga=Integer.parseInt(barang[i][2]);
            if(jumlah>5){
                harga=harga-1000;
            }
            totalharga=totalharga+(jumlah*harga);
        }
        System.out.println("Jumlah item seluruhnya adalah "+jumlahitem);    
        System.out.println("Total harga seluruhnya adalah "+totalharga);
    }
}
