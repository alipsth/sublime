import java.util.Scanner;
 public class tugasDika{
 	public static void main(String[] args) {
 	
      int baris,kolom;
       Scanner wow=new Scanner(System.in);

      
      System.out.println("--- MATRIX ---");
      System.out.print("masukan baris matrix : ");
      baris=wow.nextInt();
      System.out.print("masukan kolom matrix : ");
      kolom=wow.nextInt();

      Integer [] []array = new Integer [baris] [kolom];


      for(int i=0; i < baris; i++){
      	for (int j=0; j < kolom; j++){
      		System.out.print("masukan isi indeks baris ke "+i+" kolom ke " + j + " : ");
      		array [i] [j]=wow.nextInt();

      	}
      } System.out.println();
      		System.out.println("bentuk matrix ");


      for (int i=0; i < baris ; i++ ) {
      	for (int j =0; j< kolom ; j++ ) {
      System.out.format(" %s " , array [i][j]);

      	}
       System.out.println();
      }






 	} 
 }