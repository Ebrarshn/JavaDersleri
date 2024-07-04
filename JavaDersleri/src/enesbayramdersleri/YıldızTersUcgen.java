package enesbayramdersleri;
import java.util.Scanner;
public class YıldızTersUcgen {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Basamak sayısını giriniz: ");
		int n=scan.nextInt();
		
		for(int i=n; i>=0; i--) {
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
