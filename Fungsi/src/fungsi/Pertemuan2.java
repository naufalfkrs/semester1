/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

import java.lang.Math;
import java.util.Scanner;


/**
 *
 * @author asus
 */

public class Pertemuan2 {
    public static void max(int a, int b, int c) {
        int maks;
        System.out.print("nilai tertinggi : ");
        maks = Math.max(a,b);
        if (c>maks){
            maks = c;
        }
        System.out.println(maks);
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Masukan nilai I : ");
        a=input.nextInt();
        System.out.print("Masukan nilai II : ");
        b = input.nextInt();
        System.out.print("Masukan nilai III : ");
        c=input.nextInt();
        max(a,b,c);  
    }
}
