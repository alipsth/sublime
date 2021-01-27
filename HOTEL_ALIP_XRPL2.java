import java.util.Scanner;
class HOTEL_ALIP_XRPL2{
	public static void main(String[] args) {
		String nm ="",kmr="";
		int jns=0,sts=0,lm=0,tarif=0;
		double discn=0,byr=0;

		Scanner alip = new Scanner(System.in);


        //input
		System.out.println("--**-- SISTEM iNFORMASI PERHOTELAN--**--");
		System.out.print("nama pelanggan \t\t\t :");
		nm = alip.nextLine();

		System.out.println("\npilih jenis kamar");
		System.out.println("1.Deluxe Room Rp 275.000/hari");
		System.out.println("2.Suite Room Rp 300.000/hari");
		System.out.println("3 President Room Rp 370.000/hari");	

		System.out.println("\n");
		System.out.print("jenis kamar yang di pesan :");
		jns = alip.nextInt();
		System.out.print("Lama menginap\t           :");
		lm = alip.nextInt();

		System.out.println("\nStatus Pelanggan");
		System.out.println("1.Member");
		System.out.println("2.Non Member");
		System.out.print("pilih status pelanggan \t\t :");
		sts = alip.nextInt();


		//perhitungannya
		if (jns==1) {
			tarif = lm*275000;
			kmr = "Deluxe Room";
		}else if (jns == 2) {
			tarif = lm*300000;
			kmr = "Suite Room";	
		}else if (jns == 3) {
			tarif = lm*375000;
			kmr = "President Room";	
		}

		if (sts==1) {
			if (lm>=4 && lm <=7) {
				discn = 0.20*tarif;			
			}else if (lm>7) {
				discn = 0.35 * tarif;	
			}	
		}else if (sts == 2) {
			if (lm>=4 && lm<=7) {
				discn = 0.10 * tarif;	
			}else if (lm>7) {
				discn = 0.15 * tarif;	
			}
			
		}
		byr = tarif - discn;

		// output
		System.out.println("\n\n ---***---NOTA PEMBAYARAN HOTEL BINTANG123---***---");
		System.out.println("nama pelanggan \t\t\t:" + nm);
		System.out.println("jenis kamar \t\t\t:"+ kmr);
		System.out.println("tarif penginapan \t\t:Rp"+ tarif +",-");
		System.out.println("diskon penginapan \t\t:Rp"+ discn +",-");
		System.out.println("nominal yang harus di bayar \t:Rp"+ byr +",-");
		System.out.println("========================================================");
		
	}
}