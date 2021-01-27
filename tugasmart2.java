import java.util.Scanner;
public class tugasmart2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tunai,kembalian,bayar,a;



        System.out.println("\t SELAMAT DATANG DI");
        System.out.println("\t    INDOAPRIL     ");
        System.out.println("\tJL.BEBAS NO 6969 ");				
        System.out.println("=============================");
        System.out.println("1.FRUIT TEA    Rp.5.900");
        System.out.println("2.SARI ROTI     Rp.4.500");
		System.out.println("3.FF COCONUT Rp.5.600");
		System.out.println("\n");
        System.out.print("FRUIT TEA       : ");
        int fruit = scan.nextInt();
        System.out.print("SARI ROTI        : ");
        int sari = scan.nextInt();
        System.out.print("FF COCONUT    : ");
        int ff = scan.nextInt();
        int total =  fruit+sari+ff;
        System.out.println("\n");
        System.out.print("total        : "+total);
        System.out.println("\n");
		int tea = fruit*5900;
		int d=5000;
		if (total >=10){
			   System.out.println("selamat anda mendapatkan potongan harga 5.000");
			   System.out.println("\n");

			   int roti = sari*4500;
			   int coconut = ff*5600;
		       int al= tea+roti+coconut;
		        System.out.println("harga sebelum di potong = "+"Rp"+ al);
		        a=al-d;
				System.out.println("harga sesudah di potong = "+"Rp"+ a);
				tunai= a - d;
			    System.out.print("bayar Rp  ");
				bayar = scan.nextInt();
				kembalian = bayar - tunai-5000;
				System.out.println("kembalian Rp "+kembalian);
		}

		
				
			
			else {
				System.out.println("anda tidak mendapatkan diskon");
				System.out.println("\n");
				int roti2 = sari*4500;
				int coconut2 = ff*5600;
				int hsl= tea+roti2+coconut2;
				System.out.println("harga  = "+"Rp"+ hsl);
				System.out.print("bayar Rp  ");
				bayar = scan.nextInt();
				kembalian = bayar - hsl;
				System.out.println("kembalian Rp "+kembalian);
			}
			System.out.println("\t TERIMA KASIH TELAH BERBELANJA DISINI");
			System.out.println("\t======SEMOGA ANDA BAHAGIA============");
		
		   


		
	}
}