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
public class Latihan4 {
    public static void main(String[]args ){
        int nilai=67;
        if (nilai>=85){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat A");
            if(nilai==100){
                System.out.println("sempurna");
            }
        }
        else if (nilai>=65){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat B");
            if(nilai>=60){
                System.out.println("sedikit lagi dapat nilai A");
            }
        }
        else if (nilai>=40){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat C");
        }
        else if (nilai>=20){
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat D");
        }
        else {
            System.out.println("nilai anda "+nilai);
            System.out.println("mendapat predikat E");
            if (nilai>=0){
                System.out.println("tidak lulus");
            }

        }
    } 
}
    
