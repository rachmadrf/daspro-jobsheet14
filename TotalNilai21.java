import java.util.Scanner;

public class TotalNilai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input jumlah angka yang ingin dihitung
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int N = scanner.nextInt();
        
        // Array untuk menyimpan angka-angka yang dimasukkan pengguna
        int[] angka = new int[N];
        
        // Memasukkan angka satu per satu
        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka[i - 1] = scanner.nextInt();
        }
        
        // Menghitung total menggunakan iterasi
        int totalIteratif = hitungTotalIteratif(angka);
        System.out.println("Total dari " + N + " angka (menggunakan iterasi) adalah: " + totalIteratif);
        
        // Menghitung total menggunakan rekursi
        int totalRekursif = hitungTotalRekursif(angka, 0);
        System.out.println("Total dari " + N + " angka (menggunakan rekursi) adalah: " + totalRekursif);
        
        scanner.close();
    }
    
    // Fungsi iteratif untuk menghitung total
    public static int hitungTotalIteratif(int[] angka) {
        int total = 0;
        for (int num : angka) {
            total += num;
        }
        return total;
    }
    
    // Fungsi rekursif untuk menghitung total
    public static int hitungTotalRekursif(int[] angka, int index) {
        if (index == angka.length) {
            return 0; // Basis rekursi: jika indeks sudah sampai akhir array
        } else {
            return angka[index] + hitungTotalRekursif(angka, index + 1); // Rekursi
        }
    }
}