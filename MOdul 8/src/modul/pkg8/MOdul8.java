/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg8;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class MOdul8 {
    public static void main(String[] args) {
        double jumlahbayar;
        String Cottage[]={"Duku", "Jeruk", "Alpukat", "Jambu Air", "Durian", "Melon", "Belimbing", "Mangga", "Kedondong"};
        double weekday[]={915000,915000,575000,575000,595000,595000,495000,495000,495000};
        double weekend[]={1025000,1025000,695000,695000,715000,715000,575000,575000,575000};
        double holiday[]={1225000,1225000,895000,895000,915000,915000,755000,755000,755000};
        Scanner input = new Scanner(System.in); 
        System.out.println("====SELAMAT DATANG====");
        System.out.print("Cottage: ");
        String cotage=input.next();
        System.out.print("Lama Menginap (hari): ");
        int lama=input.nextInt();
        System.out.print("Jenis Hari: ");
        String hari=input.next();
        for (int i = 0; i < Cottage.length; i++) {
            if(Cottage[i].equals(cotage)){
                jumlahbayar=lama*Double.parseDouble(Cottage[i]);
                System.out.println("Jumlah Bayar: "+jumlahbayar);
            }
        }
    }
}

