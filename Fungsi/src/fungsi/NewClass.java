/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;





public class NewClass {
    public static void main (String [] args){
        int tinggi = 5;
        int spasi = tinggi;
        
        for (int i = 0; i < tinggi; i++) {
//            print spasi
              for (int s = 1; s < spasi-i; s++) {
                  System.out.print(" ");
              }
              
//             print *
               for (int b = 0; b < i+1; b++) {
                   System.out.print("* ");
               }
               System.out.println("");
        }
    }
}
 