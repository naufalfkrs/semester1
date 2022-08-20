/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import java.util.Scanner;
/**
 *

 * @author asus
 */
public class TugasBuPasha {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int angka[]={10,20,4,5,8};
        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }
        int hasilUrutan[]=urutan(angka);
        System.out.println("Setelah Pengurutan");
        for (int i = 0; i < hasilUrutan.length; i++) {
            System.out.println(hasilUrutan[i]);
        }
    }
    public static int[] urutan(int bil[]){
        for (int i = 0; i < bil.length; i++) {
            for (int j = i+1; j < bil.length; j++) {
                if (bil[i]<bil[j]){
                    int temp=bil[i];
                    bil[i]=bil[j];
                    bil[j]=temp;
                }
            }
        } 
        return bil;
    }
}
