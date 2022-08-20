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
public class lat2 {
    public static void main(String[] args) {
        double umur[]={30,50,32,40,21,15};
        double jumlahremaja=umur[0];
        for (int i = 0; i < umur.length; i++) {
            if (umur[i] >=12 && umur[i] <=25){
                jumlahremaja++;
            }
        }
        System.out.println("Jumlah remaja: " +jumlahremaja);
                      
    }    
}
