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
public class Latihan3 {
    public static void main(String[]args ){
        String nilai = "A";
        
        switch (nilai) {
            case "A":
                System.out.println("Predikat nilai A: Sangat baik");
                break;
            case "B":
                System.out.println("Predikat nilai B: Baik");
                break;
            case "C":
                System.out.println("Predikat nilai C: Cukup");
                break;
            case "D":
                System.out.println("Predikat nilai D: Kurang");
                break;
            case "E":
                System.out.println("Predikat nilai E: Sangat Kurang");
                break;
            default :
                System.out.println("Predikat nilai F: Sangat Kurang Sekali");
        }

    }
}
