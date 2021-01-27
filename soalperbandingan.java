import java.util.Scanner;
public class soalperbandingan{
	public static void main(String[] args) {

	Scanner kuda = new Scanner(System.in);	
	
	int  x, y;


	System.out.println("perbandingan");
	System.out.println("\n");


	System.out.print("masukan nilai x =");
	x = kuda.nextInt();
	System.out.print("masukan nilai y =");
	y = kuda.nextInt();
	System.out.println("\n");


	// (==)	Definisi Sama.
	System.out.println("X==Y : "+(x==y)+
	" karena operator perbandingan nya X tidak sama dengan Y");
	// (!=)	Definisi Tidak Sama
	System.out.println("X!=Y : "+(x!=y)+
	" karena operator perbandingan nya X dan Y tidak sama");
	// (>) Lebih Besar
	System.out.println("X>Y  : "+(x>y)+
	"karena x Lebih kecil dari Y");
	// (>) Lebih kecil
	System.out.println("X<=Y : "+(x<y)+
	" karena x tidak Lebih kecil dari Y");
	// (>=) Lebih besar sama dengan
	System.out.println("X>+Y : "+(x>=y)+
	" `karena x tidak Lebih besar sama dengan dari Y");

	}
}