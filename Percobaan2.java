import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat, pangkat)); // Menambahkan pangkat untuk deret
    }

    // Menambahkan parameter yAwal untuk mencetak deret pangkat
    static int hitungPangkat(int x, int y, int yAwal) {
        if (y == 0) {
            System.out.print("x1 = "); // Jika y == 0, return 1 dan cetak 1 = ...
            return 1;
        } else {
            if (y == yAwal) {
                System.out.print(x); // Cetak bilangan pertama tanpa x
            } else {
                System.out.print("x" + x); // Cetak tanda x dan bilangan setelah angka pertama
            }
            int hasil = x * hitungPangkat(x, y - 1, yAwal);
            return hasil;
        }
    }
}