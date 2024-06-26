package enesbayramdersleri;

import java.util.Scanner;

public class atm {
	
	public static void main(String[]args) {
		
		//Enes Bayram : İBAN TR1234 000 567 345 6572 23 45
		// Enesin Kullanıcı adı ve şifresi: enes55 ----> 456
		
		// Bilal Çamur : İBAN TR1265 0780 127 985 345 7572 13 89
		// Bilalin Kullanıcı adı ve şifresi : bilal12 ----> 123
		
		Scanner scan = new Scanner(System.in);

		
		String islemSecenekleri = "Bakiye Görüntüleme --> 1"
				+ "Para çekmek --> 2"
				+ "Farklı hesaba para yatırmak -->3"
				+ "Çıkış için q' tuşuna basınız";
		
		
		double bilalBakiye = 2450;
		String bilalIBAN = "İBAN TR1265 0780 127 985 345 7572 13 89";
		String bilalKullanici = "bilal12";
		String bilalSifre = "123";
		
		double enesBakiye = 1200;
		String enesIBAN = "TR1234 000 567 345 6572 23 45";
		String enesKullanici = "enes55";
		String enesSifre = "456";
		
		System.out.println("ATM'YE HOŞGELDİNİZ.");
		System.out.println("Lütfen bilgilerinizi giriniz.");
		
		System.out.print("Kullanıcı Adı: ");
		String kullaniciAdi = scan.nextLine();
		
		System.out.print("Şifre: ");
		String sifre = scan.nextLine();
		
		if (kullaniciAdi.equals("bilal12") && sifre.equals("123")) {
			System.out.println("Bilal Çamur Hesabına Giriş Yapıldı...");
			System.out.println(islemSecenekleri);
			
			System.out.print("Lütfen bir seçim yapınız: ");
			String secim = scan.nextLine();
			
			switch(secim) {
			case "1" :
				System.out.println("Bakiyeniz: " + bilalBakiye);
				break;
				
			case "2" :
				System.out.println("Çekmek istediğiniz tutarı giriniz: ");
				int cekilecekTutar = scan.nextInt();
				if(bilalBakiye >= cekilecekTutar) {
					bilalBakiye -= cekilecekTutar;
					System.out.println("Kalan tutar: " + bilalBakiye);
				}
				else {
					System.out.println("Bakiyenizden fazla çekemezsiniz...");
				}
				break;
				
			case "3" :
				System.out.print("Ne kadar yatırmak istiyorsunuz: ");
				int yatirilacakTutar = scan.nextInt();
				if(yatirilacakTutar <= bilalBakiye)
				{
					System.out.print("İban giriniz: ");
					scan.nextLine();
					String yatirilacakIBAN = scan.nextLine();
					if(yatirilacakIBAN.equals(enesIBAN)) {
						System.out.println("Para enes adlı kullanıcıya yatırılıyor...");
						bilalBakiye -= yatirilacakTutar;
						enesBakiye += yatirilacakTutar;
						
						System.out.println("Bakiyeniz : " + bilalBakiye);
						System.out.println("Enesin Bakiyesi : " + enesBakiye);
					
					}
					
				}
				break;
			}
			
			
		}else if(kullaniciAdi.equals("enes55") && sifre.equals("456")) {
			System.out.println("Enes Bayram Hesabına giriş yapıldı ...");
			System.out.println(islemSecenekleri);
			
		}else {
			System.out.println("Kullanıcı adı veya şifre yanlış !!");
		}
	}

}
