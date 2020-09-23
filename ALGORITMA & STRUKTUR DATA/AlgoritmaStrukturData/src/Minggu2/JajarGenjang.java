/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu2;

/**
 *
 * @author USER
 */
public class JajarGenjang {

public int tinggi,panjang, sisiMiring;
public int hitungLuas;

    /**
     *
     */
     JajarGenjang(int t, int p, int s)
    {
     tinggi = t;
     panjang= p;
     sisiMiring = s;
    }
    
        public int hitungLuas()
        {
        return (int) (panjang * tinggi);
        }    
        public int hitungKeliling()
        {
        return (int) 2+(sisiMiring + panjang);   
        }
}
