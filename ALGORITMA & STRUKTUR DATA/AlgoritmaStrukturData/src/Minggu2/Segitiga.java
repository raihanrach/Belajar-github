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
public class Segitiga 
{
 public int alas;
 public int tinggi;
 
    public Segitiga(int a, int t)
    {
    alas = a ;
    tinggi = t;
    }
    
        public int hitungLuas()
        {
        return (int )(alas * tinggi);
        }
        public int hitungKeliling()
        {
            return 3*alas;
        }
}

