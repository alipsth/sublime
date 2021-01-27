import java.util.Scanner;
public class warung{
	public static void main(String[] args) {
		Scanner alip= new Scanner(System.in);
		int a,m=0;
		int pilih[] =new int[10];
		int harga[] =new int[10];
		String b[] ={"1.Bakso bermamah","2.Bakso berkakek","3.tahu putih","4.mie geleser","5.batagor","6.gorengan"}; 
		String c[] ={"1.es goyobod","2.es bolak","3.es pudot","4.es duren","5.teh dingin"};
		int    d[] ={10000,7500,500,2500,500,500};
		int    e[] ={7500,5000,2500,10000,2000};


		System.out.println("========================================================");
		System.out.println("|              Selamat Datang Di Warung                |");
		System.out.println("|                  ANGKEL MUTHU                        |");
		System.out.println("========================================================");
		System.out.println("|                 Menu Bakso import                    |");
		System.out.println("========================================================");
		System.out.println("|1.                    Bakso                           |");
		System.out.println("|2.                    Minuman                         |");
		System.out.println("|3.                    te janten meser                 |");
		System.out.print("|Silahkan pilih menu nya,jangan milih yang ga ada :");
		a =alip.nextInt();
		String z[] =new String [1000];
		int    x[] =new int [1000];
		if (a==1) {
			for (int i=0;i<6 ;i++) {
			System.out.println(b[i]+" "+d[i]);
			System.out.println();
			z[i] = b[i];
			x[i] = d[i];	
			}
		}
		else if (a==2) {
			for (int j=0;j<5;j++ ) {
			System.out.println(c[j]+" "+e[j]);
			System.out.println();
			z[j] = c[j];
			x[j] = e[j];
			}
		}
		System.out.print("Pilihan menu anda :");
		int o =	alip.nextInt();
		if (pilih[m]==1) {
			harga[m]=10000;
		}
		else if (pilih[m]==2) {
				harga[m]=7500;
		}
		System.out.println("================================================");
		System.out.println("|        Menu yang anda pesan adalah           |");
		System.out.println("================================================");
		System.out.println("|       MENU         ||          HARGA         |");
		System.out.println("|"+pilih[m] +  harga[m] );
	}
}