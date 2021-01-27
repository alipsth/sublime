import java.util.Scanner;
public class indomaret{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int saron,roti,milo,tunai,kembalian,joh,bayar,a;



        System.out.println("\t SELAMAT DATANG DI");
        System.out.println("\t    IZINMARET     ");
        System.out.println("\tJL.NEW YORK NO 14 ");				
        System.out.println("=============================");
        System.out.println("1.nextar    Rp.3.000");
        System.out.println("2.Tango     Rp.5.000");
		System.out.println("3.sari roti Rp.4.500");
		System.out.println("\n");
        System.out.print("nextar       : ");
        int sharon = scan.nextInt();
        System.out.print("Tango        : ");
        int sari = scan.nextInt();
        System.out.print("sari roti    : ");
        int susu = scan.nextInt();
        int total =  sharon+sari+susu;
        System.out.println("\n");
        System.out.print("total        : "+total);
        System.out.println("\n");
		saron = sharon*3000;
		int d=5000;
		if (total >=10){
			   System.out.println("selamat anda mendapatkan potongan harga 5.000");
			   System.out.println("\n");

			   int tango = sari*5000;
			   roti = susu*4500;
		       int al= saron+tango+roti;
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
				roti = susu*4500;
				int tango = sari*5000;
				int al= saron+tango+roti;
				System.out.println("harga  = "+"Rp"+ al);
				System.out.print("bayar Rp  ");
				bayar = scan.nextInt();
				kembalian = bayar - al;
				System.out.println("kembalian Rp "+kembalian);
			}
			System.out.println("\t TERIMA KASIH TELAH BERBELANJA DISINI");
			System.out.println("\t======SEMOGA ANDA BAHAGIA============");
		
		   


		
	}
}