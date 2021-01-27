import java.util.Scanner;
class HOTEL_RIFA_XRPL2{
	public static void main(String[] args) {
		String nama ="",kamar="";
		int jenis=0,status=0,lama=0,tarif=0;
		double diskon=0,bayar=0;

		Scanner boy = new Scanner(System.in);


        //input
		System.out.println("--**-- SISTEM iNFORMASI PERHOTELAN--**--");
		System.out.print("nama pelanggan \t\t\t :");
		nama = boy.nextLine();

		System.out.println("\npilih jenis kamar");
		System.out.println("1.Deluxe Room Rp 275.000/hari");
		System.out.println("2.Suite Room Rp 300.000/hari");
		System.out.println("3 President Room Rp 370.000/hari");
		System.out.print("jenis kamar yang di pesan \t :");
		jenis = boy.nextInt();

		System.out.print("\nLama menginap \t\t\t:");
		lama = boy.nextInt();

		System.out.println("\nStatus Pelanggan");
		System.out.println("1.Member");
		System.out.println("2.Non Member");
		System.out.print("pilih status pelanggan \t\t :");
		status = boy.nextInt();


		//proses perhitungan
		if (jenis==1) {
			tarif = lama*275000;
			kamar = "Deluxe Room";
		}else if (jenis == 2) {
			tarif = lama*300000;
			kamar = "Suite Room";	
		}else if (jenis == 3) {
			tarif = lama*375000;
			kamar = "President Room";	
		}

		if (status==1) {
			if (lama>=4 && lama <=7) {
				diskon = 0.20*tarif;			
			}else if (lama>7) {
				diskon = 0.35 * tarif;	
			}	
		}else if (status == 2) {
			if (lama>=4 && lama<=7) {
				diskon = 0.10 * tarif;	
			}else if (lama>7) {
				diskon = 0.15 * tarif;	
			}
			
		}
		bayar = tarif - diskon;

		// output
		System.out.println("\n\n ---***---NOTA PEMBAYARAN HOTEL BINTANG123---***---");
		System.out.println("nama pelanggan \t\t\t:" + nama);
		System.out.println("jenis kamar \t\t\t:"+ kamar);
		System.out.println("tarif penginapan \t\t:Rp"+ tarif +",-");
		System.out.println("diskon penginapan \t\t:Rp"+ diskon +",-");
		System.out.println("nominal yang harus di bayar \t:Rp"+ bayar +",-");
		System.out.println("========================================================");
		
	}
}