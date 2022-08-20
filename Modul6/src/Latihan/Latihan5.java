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
public class Latihan5 {
    public static void main(String[]args ){
        int Nilai=78;
        String predikat="";
        if (Nilai>=96){
            System.out.println("Nilai : "+ Nilai);
            predikat= "A";
            System.out.println("Predikat : " +predikat);
        } 
        else if (Nilai>=91) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "A";
            System.out.println("Predikat : " +predikat+ "-");
        }
        else if (Nilai>=86) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "B";
            System.out.println("Predikat : " +predikat+ "+");
        }
        else if (Nilai>=81) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "B";
            System.out.println("Predikat : " +predikat);
        }
        else if (Nilai>=75) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "B";
            System.out.println("Predikat : " +predikat+ "-");
        }
        else if (Nilai>=70) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "C";
            System.out.println("Predikat : " +predikat+ "+");
        }
        else if (Nilai>=65) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "C";
            System.out.println("Predikat : " +predikat);
        }
        else if (Nilai>=60) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "C";
            System.out.println("Predikat : " +predikat+ "-");
        }
        else if (Nilai>=55) {
            System.out.println("Nilai : "+ Nilai);
            predikat= "D";
            System.out.println("Predikat : " +predikat+ "+");
        }
        else {
            System.out.println("Nilai : "+ Nilai);
            predikat= "D";
            System.out.println("Predikat : " +predikat);    
        }
        switch (predikat) {
              case "A":
              System.out.println("Kriteria : Sangat Baik");
              break;
              case "B":
              System.out.println("Kriteria : Baik");
              break;
              case "C":
              System.out.println("Kriteria : Cukup");
              break;
              case  "D":
              System.out.println("Kriteria : Kurang");
              break;                               
        }
    }
}
    

