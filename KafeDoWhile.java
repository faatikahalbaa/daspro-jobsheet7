import java.util.Scanner;

public class KafeDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int totalHarga;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk leluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. ");
                break;
            }
            System.out.print("jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti *hargaRoti);
            System.out.println("total yang harus dibayar: Rp "+totalHarga);
            sc.nextLine();
        } while (true);

        System.out.println("semua transkasi selesai. ");
    }
}
