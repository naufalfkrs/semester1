/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class NewClass1 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []angka= {input.nextInt()}; 
           System.out.println(angka);}
    public static void urutan(int[] angka){
        Arrays.sort(angka); 
        int[] arrayBuffer = Arrays.copyOf(angka, angka.length);
        for (int i = 0; i <angka.length; i++){
            angka[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    } 
}
