/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7lat1;

/**
 *
 * @author asus
 */
public class lat2 {
    public static void main(String[]args){
        System.out.println("Bahan Pertama...");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        int inputbahan1=1,inputbahan2=3;
        if (inputbahan1==1 || inputbahan2==2){ 
            if(inputbahan1==1){
                System.out.println("Pilih Menu bahan 2: "); 
                System.out.println("1. Minyak goreng");
                System.out.println("2. Telur");
                System.out.println("3. Tidak ada");
            }
            else{
                System.out.println("Pilih Menu bahan 2:");
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
        }
        else {
            System.out.println("Pilihan tidak ditemukan");
        }
        if (inputbahan2>=1 && inputbahan2<=3){
            if (inputbahan1==1){
                switch (inputbahan2){
                    case 1:
                        System.out.println("Pisang Goreng");
                        break;
                    case 2:
                        System.out.println("Shake Banana");
                        break;
                    case 3:
                        System.out.println("Pisang Rebus");
                        break;
                }
            }
            else {
                switch (inputbahan2){
                    case 1:
                        System.out.println("Telur Mata Sapi");
                        break;
                    case 2:
                        System.out.println("Sandwich");
                        break;
                    case 3:
                        System.out.println("Telur Rebus");
                        break;
                }
            }
        }
        else {
            System.out.println("Tidak ada resep");
        }
    }
}
