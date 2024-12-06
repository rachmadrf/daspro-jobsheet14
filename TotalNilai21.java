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

        // Menghitung total dengan kombinasi iterasi dan rekursi
        int total = hitungTotalGabungan(angka);
        System.out.println("Total dari " + N + " angka yang dimasukkan adalah: " + total);

        scanner.close();
    }

    // Fungsi gabungan iterasi dan rekursi untuk menghitung total
    public static int hitungTotalGabungan(int[] angka) {
        // Iterasi untuk menghitung nilai dasar
        int totalSementara = 0;
        for (int i = 0; i < angka.length / 2; i++) {
            totalSementara += angka[i];
        }

        // Rekursi untuk menambahkan sisa nilai
        return totalSementara + hitungTotalRekursif(angka, angka.length / 2);
    }

    // Fungsi rekursif untuk menambahkan elemen array
    public static int hitungTotalRekursif(int[] angka, int index) {
        if (index == angka.length) {
            return 0; // Basis rekursi: jika indeks sudah sampai akhir array
        } else {
            return angka[index] + hitungTotalRekursif(angka, index + 1); // Rekursi
        }
    }
}