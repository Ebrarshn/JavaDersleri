package enesbayramdersleri;

import java.util.Scanner;

public class sayılarınort1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int i = 1;
		double toplam = 0;
		double ort;
		int sayac=0;
		System.out.print("Bir sayı giriniz: ");
		 int sayi = scan.nextInt();
		
		for(i=1 ; i<=sayi ; i++) {
			if(i%3==0 && i%4==0) {
				toplam+=i;
				sayac++;
				ort=(toplam/sayac);
			
				System.out.println("3 ve 4 e tam bölünen sayıların ortalaması: " +ort);	
			}
			
		}
	
	}

}
