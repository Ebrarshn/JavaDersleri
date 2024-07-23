package enesbayramdersleri;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("sayı sayısını giriniz: ");
		int k=scan.nextInt();
		
		int n1=0;
		int n2=1;
		int sonuc=0;
		
		for(int i=0; i<=k; i++) {
			
			System.out.println(n1 + " ");
			
			sonuc=n1+n2;
			n1=n2;
			n2=sonuc;
			
		}
		
	}

}
