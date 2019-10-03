/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program untuk mengeja nama depan, dari huruf pertama
 * hingga terakhir menggunakan looping dan substring untuk seleksi huruf
 */
public class PBO210118068Latihan25EjaanNama {    
    public static String namaDepan;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        namaDepan = scanner.next();
        
        System.out.println("\nEjaan untuk \"" + namaDepan + "\" adalah :");
        
        // looping berdasarkan panjang namaDepan
        for(int i = 0; i < namaDepan.length(); i++) {
            
            // menggunakan teknik substring untuk memilih huruf yg ingin
            // ditampilkan
            System.out.println("Huruf ke-"+ (i+1) +" : "
                    + namaDepan.substring(i, i+1));
        }
    }
    
}
