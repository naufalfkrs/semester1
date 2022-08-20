/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class scanner extends Modul6 {

    public scanner(InputStream in) {
        String predikat = "";
   
      int nilai;
     
       Scanner inputUser = new Scanner (System.in);
        System.out.print("Nilai : " );
       nilai = inputUser.nextInt();
               
       
       if (nilai > 95 && nilai <=100 )  {
          predikat = "A";
           System.out.println("Predikat : " +predikat);
       }
       
       else if (nilai > 90 && nilai <=95 ) {
           predikat = "A-";
           System.out.println("Predikat : " +predikat);
       }
       else if (nilai > 85 && nilai <= 90) {
           predikat = "B+";
           System.out.println("Predikat : " +predikat);
       }
       else if (nilai > 80 && nilai <=85 ) {
           predikat = "B" ;
           System.out.println("Predikat : " +predikat);
       }
       else if (nilai > 74 && nilai <= 80) {
           predikat = "B-";
           System.out.println("Predikat : " +predikat);
       }
       else if (nilai > 69 && nilai <= 74 ) {
           predikat = "C+";
           System.out.println("Predikat : " +predikat);
       }
       else if (nilai > 64 && nilai <= 69 ) {
           predikat = "C";
           System.out.println("Predikat : " +predikat);
       } 
        else if (nilai > 59 && nilai <= 64 ) {
           predikat = "C-";
           System.out.println("Predikat : " +predikat);
       }  
        else if (nilai > 54 && nilai <= 59 ) {
           predikat = "D+";
           System.out.println("Predikat : " +predikat);
       }  
        else if (nilai >= 0 && nilai <= 54 ) {
           predikat = "D";
           System.out.println("Predikat : " +predikat);
       }  
       
       switch (predikat) {
               case "A" : 
               System.out.println("Kriteria : Sangat baik");
               break;
               
               case "A-" : 
               System.out.println("Kriteria : Sangat baik");
               break;  
               
               case "B+" : 
               System.out.println("Kriteria : Baik");
               break;  
               
               case "B" : 
               System.out.println("Kriteria : baik");
               break;
               
               case "B-" : 
               System.out.println("Kriteria : baik");
               break;
               
               case "C+" : 
               System.out.println("Kriteria : Cukup");
               break;
               
               case "C" : 
               System.out.println("Kriteria : Cukup");
               break;
               
               case "C-" : 
               System.out.println("Kriteria : Cukup");
               break;
               
               case "D+" : 
               System.out.println("Kriteria : Kurang");
               break;
               
               case "D" : 
               System.out.println("Kriteria : Kurang");
               break;
               
               
       }
    }
    
}
