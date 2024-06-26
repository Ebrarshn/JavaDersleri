package enesbayramdersleri;

import java.util.Scanner;

public class artıkyılhesaplama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Yıl giriniz: ");
		int tarih=scan.nextInt();
				
		if(tarih%4==0 || (tarih%100==0 && tarih%400==0)) {
			System.out.println(tarih + " bir artık yıldır ");
			
		}
		else {
			System.out.println(tarih + " artık yıl degildir.");
		}

	}

}
