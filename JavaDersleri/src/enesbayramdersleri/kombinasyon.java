package enesbayramdersleri;

import java.util.Scanner;

public class kombinasyon {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.print("1.kümenin eleman sayısını giriniz: ");
		int n=inp.nextInt();
		System.out.print("2.kümenin eleman sayısını giriniz: ");
		int m=inp.nextInt();
		int kombN=1;
		int kombM=1;
		double sonuc=1;
	
		for(int i=1; i<=n; i++) {
		 kombN*=i;
		 }
		
		for(int j=1; j<=m; j++ ) {
			kombM*=j;
			}
         sonuc=kombN/(kombM*(n-m));
         System.out.print("sonuc: "+sonuc);
	}

}
