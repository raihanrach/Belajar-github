/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class PersegiPanjangMain {
    public static void main(String[]args){
        PersegiPanjang[] ppArray = new PersegiPanjang[3];
       Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i<3; i++)
        { 
            ppArray[0] = new PersegiPanjang();
            System.out.println("Persegi Panjang ke-"+ i);
            System.out.print("Masukan Panjang: ");
            ppArray[0].panjang = sc.nextInt();
            System.out.print("Masukan Lebar: ");
            ppArray[0].lebar = sc.nextInt();
        }  
            for(int i=0; i<3; i++)
            {
              System.out.println("Masukan Panjang ke-" + i);
              System.out.println("Panjang: "+ ppArray[0].panjang+ ", lebar: " + ppArray[0].lebar );
            }   
    }  
}