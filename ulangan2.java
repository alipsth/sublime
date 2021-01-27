import java.util.Scanner;
public class ulangan2{
	public static void main(String[] args) {
		int a,b,c=0;
		int d;
		Scanner riri = new Scanner(System.in);

		System.out.println("\n");
		System.out.print("Masukan Bilangan Awal  = ");
		a =  riri.nextInt();
		System.out.print("Masukan Bilangan Akhir = ");
		b = riri.nextInt();
		for (int s=a;s<=b ;s++ ) {
			c = s+c;
			System.out.print(" "+s+" ");
			System.out.print("+");
			
		}
		System.out.print(" = "+c);
		d = (b - a);
		System.out.print("\n Jumlah Bilangan = "+d);
		System.out.println("\n");
	}
}