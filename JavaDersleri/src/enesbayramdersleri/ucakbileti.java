package enesbayramdersleri;

import java.util.Scanner;

public class ucakbileti {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String yolculukTipi= ("tek yön -> 1" + " " + "gidiş-dönüş -> 2");
		
		System.out.print("Lütfen gideceginiz km'yi giriniz: ");
		int km = scan.nextInt();
		System.out.print("Lütfen yaşınızı giriniz: ");
		int yas = scan.nextInt();
		
		if((km<=0 || yas<=0)) {
			System.out.println("Hatalı veri girdiniz...");
		}
		double Ucret= (km*0.10);
		System.out.println("Ucret: " + Ucret);
		
		System.out.println(yolculukTipi);
		yolculukTipi = scan.nextLine();
		System.out.print("Lütfen yolculuk tipini seçiniz: " );
	    int secim = scan.nextInt(); 
	    
		switch (secim) {
		case 1: 
			System.out.println("tek yön gidiş... "); 
			double indirim1 = 0;
			if(yas<12) {
				double indirim2 = (Ucret*0.5);
				System.out.println("Yaş indirimi: " + indirim2);
				Ucret= Ucret-indirim2;
			}
			if( yas<24) {
				if(yas>12) {
					double indirim2 = (Ucret*0.1);
					System.out.println("Yaş indirimi: " + indirim2);
					Ucret= Ucret-indirim2;
				}
			}
			if(65<yas) {
				double indirim2 = (Ucret*0.3);
				System.out.println("Yaş indirimi: " + indirim2);
				Ucret= Ucret-indirim2;
				System.out.println("ücretiniz: " + Ucret);
			}
			break;
			
		case 2: 
			indirim1= (Ucret*0.2);
			System.out.println("Gidiş-dönüş indirimi: " + indirim1);
			double Fiyat1 = Ucret - indirim1;
			if(yas<12) {
				double indirim2 = (Ucret*0.5);
				System.out.println("Yaş indirimi: " + indirim2);
				double Fiyat= Fiyat1-indirim2;
			}
			if( yas<24) {
				if(yas>12) {
					double indirim2 = (Ucret*0.1);
					System.out.println("Yaş indirimi: " + indirim2);
					double Fiyat= Fiyat1-indirim2;}
				}
			if(65<yas) {
				double indirim2 = (Ucret*0.3);
			    System.out.println("Yaş indirimi: " + indirim2);
				double Fiyat= Fiyat1-indirim2;
		        Fiyat = scan.nextDouble();
				System.out.println("ücretiniz: " + Fiyat);
				}
			break;
			default: 
				System.out.print("hatalı veri girişi...");
		}
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
