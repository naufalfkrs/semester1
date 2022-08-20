/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author asus
 */
public class Modul6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String identitas="Naufal Fakhri Risnawa";
        System.out.println("Identitas : " +identitas);
        System.out.println("Saran resep dari bahan milik anda");
        System.out.println("Bahan utama :");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Bahan kedua...");
        System.out.println("1. Susu");
        System.out.println("2. Minyak goreng");
        System.out.println("3. Roti");
        //System.out.println("Masukkan no. pilihan anda: ");
        int resep= 6;
        if (resep==1 || resep==2)
        {
            if (resep==1){
                System.out.println("Resep 1 :");
                System.out.println("1. Pisang");
                System.out.println("2. Tidak ada");
                System.out.println("Membuat pisang rebus");
            }
            else{
                System.out.println("Resep 2 :");
                System.out.println("1. Pisang");
                System.out.println("2. Susu");
                System.out.println("Membuat milkshake banana");
            }
        }
        if (resep==3 || resep==4)
        {
            if (resep==3){
                System.out.println("Resep 3 :");
                System.out.println("1. Pisang");
                System.out.println("2. MInyak goreng");
                System.out.println("Membuat pisang goreng");
            }
            else {
                System.out.println("Resep 4 :");
                System.out.println("1. Telur");
                System.out.println("2. Tidak ada");
                System.out.println("Membuat telur rebus");
            }
        }
        if (resep==5 || resep==6)
        {
            if (resep==5){
                System.out.println("Resep 5 :");
                System.out.println("1. Telur");
                System.out.println("2. MInyak goreng");
                System.out.println("Membuat telur mata sapi");
            }
            else {
                System.out.println("Resep 6 :");
                System.out.println("1. Telur");
                System.out.println("2. Roti");
                System.out.println("Membuat sandwich telur");
            }
        }
    }
}
   
