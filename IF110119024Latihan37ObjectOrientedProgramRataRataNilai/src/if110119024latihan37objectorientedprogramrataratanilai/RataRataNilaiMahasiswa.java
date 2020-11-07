/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110119024latihan37objectorientedprogramrataratanilai;

/**
 *
 * @author acer
 * NAMA  : Kusnandi Pirmansyah
 * KELAS : IF-1
 * NIM   : 10119024
 */
public class RataRataNilaiMahasiswa {
    private static Scanner Scanner = new Scanner(System.in);
    private static int i, jumlahMahasiswa;
    private static float jumlah, nilaiMahasiswa, rataRataNilai;
    
    private static int inputJumlahmhs() {
        System.out.print ("Masukan Banyaknya Mahasiswa : ");
        jumlahMahasiswa = scanner.nextInt();
        return jumlahMahasiswa;
    }
    
    public static void double hitungRataRataNIlai() {
        inputJumlahMhs();
        jumlah = 0;
        i=1;
        while (i <= jumlahMahasiswa){
            System.out.print ("Nilai Mahasiswa ke-"+i+": ");
            nilaiMahasiswa = scanner.nextFloat ();
            jumlah += nilaiMahasiswa;
            i++;
        }
        rataRataNilai = jumlah / jumlahMahasiswa;
        return rataRataNilai;
    }
}
