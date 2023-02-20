import java.util.Scanner;

public class Ticket2 {
    static int balance = 100;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Program beli tiket!");
        System.out.println("Daftar Tiket :\n1. regular 10$\n2. VIP 20$\n3. VVIP 30$\n");
        System.out.println("modal 100$");

        System.out.println("Masukkan Jenis Tiket :");
        String jenisTiket = input.nextLine();

        System.out.println("Masukkan Jumlah Tiket :");
        int jumlahTiket = input.nextInt();

        if ((jenisTiket.equals("regular"))) {

            balanceSystem(jumlahTiket, 10);

        } else if ((jenisTiket.equals("VIP"))) {

            balanceSystem(jumlahTiket, 20);

        } else if ((jenisTiket.equals("VVIP"))) {

            balanceSystem(jumlahTiket, 30);

        } else {
            System.err.println("Input Sesuai Ketentuan!!!");

        }

    }

    static void balanceSystem(int totalTiket, int harga) {
        final int result = balance - totalTiket * harga;
        if (result<0){
            System.out.println("Saldo anda kurang "+(-result));
            System.out.println("Saldo anda sisa :" + balance);
            return;
        }
        balance = result;
        System.out.println(totalTiket + " tiket regular berhasil dibeli !");
        System.out.println("Saldo anda sisa :" + balance);
    }
}
