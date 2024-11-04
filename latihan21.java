package pertemuan5;

import java.util.Scanner;

public class latihan21 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyaknya Mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();  // Input jumlah mahasiswa
        
        double totalNilai = 0;  // Variabel untuk menyimpan total nilai

        // Loop untuk input nilai setiap mahasiswa
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + ": ");
            double nilai = input.nextDouble();  // Input nilai mahasiswa
            totalNilai += nilai;  // Tambahkan nilai ke total
        }

        // Hitung rata-rata nilai
        double rataRata = totalNilai / jumlahMahasiswa;
        
        // Tampilkan hasil
        System.out.printf("Maka, Rata-rata Nilainya adalah %.1f%n", rataRata);
        System.out.println("Developed by : Rizki Adam Kurniawan");
    }
}


