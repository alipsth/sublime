import java.util.Scanner;
public class tugasmart {
	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	System.out.println("Selamat Datang di RPL Mart ");
	System.out.print("====================================================");
	System.out.println("\n1.FRUIT TEA  Rp 5.900");
	System.out.println("2.SARI ROTI SANDWICH Rp 4.500");
	System.out.println("3.FF COCONUT Rp 5.600");
	System.out.println("====================================================");
	System.out.print("Masukan Pesanan Anda : ");
	int pesanan =in.nextInt();
	if (pesanan == 1 ) {
		System.out.println("Anda Memesan FRUIT TEA");
		System.out.println("Note : ");
		System.out.println("Anda Mendapatkan Diskon Rp5000 jika: ");
		System.out.println("Membeli Lebih Dari 10 Pcs");
		System.out.print("Pesan Berapa = ");
		int pcs = in.nextInt();
		if(pcs >= 10){
			System.out.println("Anda Mendapatkan Diskon Rp5000");
			System.out.println("Anda Membeli "+pcs+" Bungkus");
			System.out.println("Harga Sebelum Diskon = Rp "+ pcs * 5900);
			int diskon = pcs * 5900;
			System.out.println("Harga Sesudah Diskon = Rp "+ (diskon - 5000));
			int a = diskon - 5000;
			System.out.print("Bayar = ");
			int bayar = in.nextInt();
			int total = bayar - a;
			System.out.println("Kembalian = Rp "+ total);
		}
		else if (pcs <= 10) {
			System.out.println("Anda Tidak Mendapatkan Diskon");
			System.out.println("Anda Membeli "+pcs+" Bungkus");
			System.out.println("Harga = Rp "+ pcs * 5900);
			System.out.print("Bayar = ");
			int bayar2 = in.nextInt();
			int hasil = bayar2 - (pcs*5900);
			System.out.println("Kembalian = Rp "+ hasil);			
		}
	}	
	else if (pesanan == 2) {
			System.out.print("Anda Memesan SARI ROTI SANDWICH");
			System.out.println("Note : ");
			System.out.println("Anda Mendapatkan Diskon Rp2000 jika: ");
			System.out.println("Membeli Lebih Dari 15 Pcs");
			System.out.print("Pesan Berapa = ");
			int pcs2 = in.nextInt();
		if (pcs2 >= 15) {				
			System.out.println("Anda Mendapatkan Diskon Rp2000");
			System.out.println("Anda Membeli "+pcs2+" Bungkus");
			System.out.println("Harga Sebelum Diskon = Rp "+ pcs2 * 4500);
			int dsk = pcs2 * 4500;
			System.out.println("Harga Sesudah Diskon = Rp "+ (dsk - 2000));
			int b = dsk - 2000;
			System.out.print("Bayar = ");
			int bayar3 = in.nextInt();
			int total2 = bayar3 - b;
			System.out.println("Kembalian = Rp "+ total2);
		}
		else if (pcs2 <= 15) {
			System.out.println("Anda Tidak Mendapatkan Diskon");
			System.out.println("Anda Membeli "+pcs2+" Bungkus");
			System.out.println("Harga = Rp "+ pcs2 * 4500);
			System.out.print("Bayar = ");
			int bayar4 = in.nextInt();
			int hasil2 = bayar4 - (pcs2 * 4500);
			System.out.println("Kembalian = Rp "+ hasil2);
		}
	}
	else if (pesanan == 3) {
           System.out.print("Anda Memesan FF COCONUT");
		   System.out.println("Note : ");
		   System.out.println("Anda Mendapatkan Diskon Rp3000 jika: ");
		   System.out.println("Membeli Lebih Dari 20 Pcs");
		   System.out.print("Pesan Berapa = ");
		   int pcs3 = in.nextInt();
		if (pcs3 >= 15) {				
			System.out.println("Anda Mendapatkan Diskon Rp3000");
			System.out.println("Anda Membeli "+pcs3+" Bungkus");
			System.out.println("Harga Sebelum Diskon = Rp "+ pcs3 * 5600);
			int dsk2 = pcs3 * 5600;
			System.out.println("Harga Sesudah Diskon = Rp "+ (dsk2 - 3000));
			int c = dsk2 - 3000;
			System.out.print("Bayar = ");
			int byr = in.nextInt();
			int hsl = byr - c;
			System.out.println("Kembalian = Rp "+ hsl);
		}
		else if (pcs3 <= 15) {
			System.out.println("Anda Tidak Mendapatkan Diskon");
			System.out.println("Anda Membeli "+pcs3+" Bungkus");
			System.out.println("Harga = Rp "+ pcs3 * 5600);
			System.out.print("Bayar = ");
			int byr2 = in.nextInt();
			int hsl2 = byr2 - (pcs3 * 5600);
			System.out.println("Kembalian = Rp "+ hsl2);
		}
	System.out.println("============================================================");	
	System.out.println("TERIMA KASIH TELAH BELANJA DI TEMPAT KAMI");		
		}
	}
}










