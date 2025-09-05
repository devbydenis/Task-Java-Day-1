import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Selamat datang di kalkulator java");

        while (true) {
            /// /////////////////////////////////////////////////////////////

            Scanner scannerValue1 = new Scanner(System.in);
            System.out.print("Masukan angka pertama (-1000 s.d 1000): ");
            if (!scannerValue1.hasNextInt()) {
                System.out.println("Input angka pertama harus angka");
                continue;
            }

            String value1 = scannerValue1.nextLine();
            int intOfValue1 = Integer.parseInt(value1);
            if (intOfValue1 < -1000 || intOfValue1 > 1000) {
                System.out.println("Angka harus antara -1000 dan 1000");
                continue;
            }

            /// /////////////////////////////////////////////////////////////

            Scanner scannerValue2 = new Scanner(System.in);
            System.out.print("Masukan angka kedua (-1000 s.d 1000): ");
            if (!scannerValue2.hasNextInt()) {
                System.out.println("Input angka kedua harus angka");
                continue;
            }

            String value2 = scannerValue2.nextLine();
            int intOfValue2 = Integer.parseInt(value2);
            if (intOfValue2 < -1000 || intOfValue2 > 1000) {
                System.out.println("Angka harus antara -1000 dan 1000");
                continue;
            }

            /// /////////////////////////////////////////////////////////////

            System.out.println("Pilih perintah berikut: ");
            System.out.println("1. Kali");
            System.out.println("2. Bagi");
            System.out.println("3. Tambah");
            System.out.println("4. Kurang");

            Scanner scannerOperator = new Scanner(System.in);
            System.out.print("Perintah: ");
            if (!scannerOperator.hasNextInt()) {
                System.out.println("Input harus angka 1-4.");
                continue;
            }
            String operator = scannerOperator.nextLine();
            if (value2.equals("0") && operator.equals("2")) {
                System.out.println("Tidak dapat membagi dengan angka 0.");
                continue;
            }

            /// /////////////////////////////////////////////////////////////

            var hasil = calculate(intOfValue1, intOfValue2, operator);
            if (hasil == 0) {
                continue;
            }
            System.out.println("Hasil: " + hasil);

            System.out.println("Apakah kamu ingin mengulangi perhitungan?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            Scanner scannerDialog = new Scanner(System.in);
            System.out.print("Pilihanmu: ");

            String choice = scannerDialog.nextLine();
            if (!choice.equals("1")) {
                System.out.println("Terima kasih sudah menggunakan!");
                break;
            }
        }

    }

    static double calculate(double value1, double value2, String operator) {
        double result;
        switch (operator) {
            case "1" -> result = value1 * value2;
            case "2" -> result = value1 / value2;
            case "3" -> result = value1 + value2;
            case "4" -> result = value1 - value2;
            default -> {
                System.out.println("Pilihan tidak valid");
                result = 0;
            }
        }

        return result;

    }
}