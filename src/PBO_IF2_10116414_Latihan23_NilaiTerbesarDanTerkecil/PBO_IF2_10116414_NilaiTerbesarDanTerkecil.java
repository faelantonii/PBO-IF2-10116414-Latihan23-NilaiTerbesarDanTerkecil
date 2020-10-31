/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan23_NilaiTerbesarDanTerkecil;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * 
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Nilai Terbesar dan Terkecil
 */
public class PBO_IF2_10116414_NilaiTerbesarDanTerkecil {
    public static void main(String[] args) {
        String petugas;
        int i;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scan.nextLine();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        int panjangArray = scan.nextInt();
        
        int angka[]= new int[100];
        
        int min,max;
        for( i=1;i<=panjangArray;i++)
        {
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            angka[i]= scan.nextInt();
        }
        min=angka[1];
        max=angka[1];
        
        System.out.println("\n===Hasil Nilai Mahasiswa===");
        
        for(i=1;i<=panjangArray;i++)
        {
            if(angka[i]<min)
                min=angka[i];
            if(angka[i]>max)
                max=angka[i];
            
            System.out.println("Nilai Mahasiswa ke-"+i+" = "+angka[i]);
        }
   
    System.out.println("\nNilai Terbesar Adalah : " +max);
    System.out.println("Nilai Terkecil Adalah : " +min);
    
    System.out.println("\nNama Petugas :" +petugas);
    }
    
}
