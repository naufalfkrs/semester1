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
public class lat3 {
    public static void main(String[] args) {
        String Cottage,hari;
        int jumlahhari,jenisday=0;
        int jumlahbayar;
        String room[][] ={
            {"Duku", "915000", "1025000", "1225000"},
            {"Jeruk", "915000", "1025000", "1225000"},
            {"Alpukat", "575000", "695000", "895000"},
            {"Jambu Air", "575000", "695000", "895000"},
            {"Durian", "595000", "715000", "915000"},
            {"Melon", "595000", "715000", "915000"},
            {"Belimbing", "495000", "575000", "755000"},
            {"Mangga", "495000", "575000", "755.000"},
            {"Kedondong", "495000", "575000", "755000"},
        };               
        Scanner input = new Scanner(System.in);
        System.out.print("Cottage: ");
        Cottage=input.next();
        System.out.print("Lama menginap (hari): ");
        jumlahhari =input.nextInt();        
        System.out.print("Jenis Hari: ");
        hari=input.next();
        if(hari.equals("Weekday")){
            jenisday=1; 
        }
        else if(hari.equals("Weekend")){
            jenisday=2;
        }
        else if(hari.equals("Holiday")){
            jenisday=3;
        }
        else{
            System.out.println("Tidak Ada");
        }
        for (int i = 0; i < room.length; i++) {
            if(room[i][0].equals(Cottage)){
                    jumlahbayar=jumlahhari*Integer.parseInt(room[i][jenisday]);
                    System.out.println("Jumlah Bayar: "+jumlahbayar);
                }
            
        }           
    }
} 

 

