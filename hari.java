import java.util.Scanner;
public class hari{
	public static void main(String[] args) {
		
		Scanner waktu=new Scanner(System.in);
		System.out.println("\n");

		System.out.print("\t\t Masukan waktu dalam detik :");
		int a=waktu.nextInt();
		int hari =a/86400;
		int hari1=a%86400;
		int jam  =hari1/3600;
		int jam1 =hari1%3600;
		int menit=jam1/60;
		int menit1=jam1%60;
		int detik=menit1;

		System.out.println( +hari +"hari" +jam +"jam" +menit +"menit" +detik +"detik ");
	
	}
}