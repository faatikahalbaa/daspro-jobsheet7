import java.util.Scanner;

public class tugas109 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000;
        int jumlah, totalTiket = 0;
        double totalPenjualan = 0, harga, diskon, bayar;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (o untuk selesai): ");
            jumlah = sc.nextInt();
            
            if (jumlah < 0) {
                System.out.println("jumlah tiket tidak valid. masukkan lagi!");
                continue;
            }
            if (jumlah == 0 ) {
                break;
            }
            harga = jumlah * hargaTiket;
            diskon = 0;
            if (jumlah > 10) {
                diskon = 0.15;
            } else if (jumlah > 4) {
                diskon = 0.10;
            }
            bayar = harga - (harga * diskon);
            System.out.println("Diskon: "+(diskon*100) + "%");
            System.out.println("Total bayar pelanggan: "+bayar);

            totalTiket += jumlah;
            totalPenjualan += bayar;
            
        } while (true);
        System.out.println("total tiket terjual: "+totalTiket);
        System.out.println("total penjualan hari ini: Rp "+totalPenjualan);
    } 
}
