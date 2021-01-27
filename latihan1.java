import java.util.Scanner;
public class latihan1{
	public static void main(String[] args) {
		int bayar,kembalian,harga,pilihan;

		Scanner al = new Scanner(System.in);
		System.out.println ("1.Tango  Rp.4.900");
		System.out.println ("2.Kraft Cheddar   Rp.22.000");
		System.out.print ("masukan pilihan anda = ");
		pilihan = al.nextInt();
		if (pilihan == 1) {
			System.out.println("anda memilih Tango");
			System.out.println("NOTE:");
			System.out.println("mendapatkan potongan harga 2.000 jika :");
			System.out.println("1.membeli dari 5 bungkus");
			System.out.print("mau pesan berapa bungkus :");
			pilihan = al.nextInt();
			int a=4900;
			int b=22000;
			int c=5000;
			int d=2000;
			if (pilihan >=5 ) {
				System.out.println("selamat anda mendapatkan potongan harga 2.000");
				System.out.println("harga sebelum di potong = "+"Rp"+ a*pilihan);
				System.out.println("harga sesudah di potong = "+"Rp"+ (a*pilihan-d));
			    System.out.print("bayar Rp  ");
				bayar = al.nextInt();
				System.out.println("kembalian Rp "+(a*pilihan-d-bayar));
			}
			else {
			    System.out.println("anda tidak mendapat diskon");
			    System.out.print("bayar Rp  ");
				bayar = al.nextInt();
				kembalian =a*pilihan-bayar;
				System.out.println("kembalian Rp "+(kembalian));	
			}


			

			
		}
		else if (pilihan ==2) {
			System.out.println("anda memilih Kraft Cheddar");
			System.out.println("NOTE:");
			System.out.println("mendapatkan potongan harga 5.000 jika :");
			System.out.println("1.membeli dari 5 bungkus");
			System.out.print("mau pesan berapa bungkus :");
			pilihan = al.nextInt();
			int b=25000;
			int c=30000;
			if (pilihan >=5 ) {
				System.out.println("selamat anda mendapatkan potongan harga 5.000");
				System.out.println("harga sebelum di potong = "+"Rp"+ b*pilihan);
				System.out.println("harga sesudah di potong = "+"Rp"+ (b*pilihan-c));
			    System.out.print("bayar Rp  ");
				bayar = al.nextInt();
				System.out.println("kembalian Rp "+(b*pilihan-c-bayar));
				
			}
			else
				System.out.println("anda tidak mendapat diskon");
			    System.out.print("bayar Rp  ");
				bayar = al.nextInt();
				System.out.println("kembalian Rp "+(b*pilihan-bayar));	
		}

	}
}