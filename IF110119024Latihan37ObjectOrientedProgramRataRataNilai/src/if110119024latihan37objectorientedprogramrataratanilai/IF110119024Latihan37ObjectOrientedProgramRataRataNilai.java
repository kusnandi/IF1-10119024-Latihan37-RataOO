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
public class IF110119024Latihan37ObjectOrientedProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RataRataNilaiMahasiswa nilaiMahasiswa = new RataRataNilaiMahasiswa();
        double rataRataNilai = nilaiMahasiswa.hitungRataRataNilai();
        System.out.println("\nMaka, Rata-Rata Nilai adalah: "+rataRataNilai);
        System.out.println("Developed by : Kusnandi Pirmansyah");
    }
    
}
