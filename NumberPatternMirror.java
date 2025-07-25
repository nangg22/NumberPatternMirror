import java.util.Scanner;

public class NumberPatternMirror {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = scanner.nextInt();

        // Cetak pola naik dari 1 ke n
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                System.out.print(j);
            }
            System.out.println();
        }

        // Cetak pola turun dari n-1 ke 1
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        scanner.close();
    }
}
