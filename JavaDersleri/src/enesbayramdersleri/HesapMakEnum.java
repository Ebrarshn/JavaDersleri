package enesbayramdersleri;
import java.util.Scanner;
public class HesapMakEnum {
	
	static void plus() {
		Scanner scan = new Scanner(System.in);
		int number, result=0, i=1;
		while(true) {
			System.out.print(i++ + ".sayı: ");
			number =scan.nextInt();
			if(number==0) {
				break;
			}
			result +=number;
		}
		System.out.println("Sonuç: " + result);
	}
	
	static void minus() {
		Scanner scan=new Scanner(System.in);
		System.out.println("kaç adet sayı gireceksiniz: ");
		int counter=scan.nextInt();
		int number, result=0;
		
		for(int i=1; i<=counter; i++) {
			System.out.print(i + ".sayı: ");
			number=scan.nextInt();
			if(i==1) {
				result +=number;
				continue;
			}
			result-=number;
		}
		System.out.println("sonuc: " + result);
	}
	
	static void times() {
		Scanner scan=new Scanner(System.in);
		int number,result=1, i=1;
		
		while(true) {
			System.out.print(i++ + ".sayı: ");
			number=scan.nextInt();
			if(number==1)
				break;
			if(number==0) {
				result=0;
				break;
			}
			result*=number;
		}
		System.out.println("Sonuc: " + result);
	}
	
	static void divided() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Kaç adet sayı gireceksiniz: ");
		int counter = scan.nextInt();
		double number, result=0.0;
		
		for(int i=1; i<=counter; i++) {
			System.out.print(i + ".sayı: ");
			number=scan.nextDouble();
			if(i!=1 && number== 0) {
				System.out.println("Böleni 0 giremezsiniz.");
				continue;
			}
			if(i==1) {
				result=number;
				continue;
			}
			result/=number;
		}
		System.out.println("Sonuç: " + result);
	}
	
	static void power() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Taban değeri giriniz: ");
		int base=scan.nextInt();
		System.out.println("Üs değerini girniz: ");
		int exponent=scan.nextInt();
		int result=1;

		for(int i=1; i<=exponent; i++) {
			result*=base;
		}
		System.out.println("Sonuç: " + result);
	}
	
	static void factorial() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		int n= scan.nextInt();
		int result=1;
		
		for(int i=1; i<=n; i++) {
			result*=i;
		}
		System.out.println("Sonuç: " + result);
	}
	
	static void modAlma() {
		Scanner scan=new Scanner(System.in);
		int result=0;
		System.out.println("1.Sayıyı giriniz: ");
		int n1=scan.nextInt();
		System.out.println("2.Sayıyı giriniz: ");
		int n2=scan.nextInt();
	
		if(n1>=n2) {
			result=n1%n2;
		}else if(n2==0) {
			System.out.println("işlem tanımsız.");
		}else {
			System.out.println("n1 sayısı n2 sayısına bölünemez.");
		}
		
		System.out.println("Sonuç: " + result);
		
		}
	static void dikdortgen() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Dikdörtgenin kısa kenarı uzunluğu: ");
		int k=scan.nextInt();
		System.out.println("Dikdörtgenin uzun kenar uzunluğu: ");
		int u=scan.nextInt();
		int cevre=0;
		int alan=1;
		
		cevre=(k*2)+(u*2);
		alan=(k*u);
		System.out.println("Çevre: " +cevre);
		System.out.println("Alan: " +alan);
	}
		
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int select;
		String menu= "1-Toplam İşlemi\n"
				+ "2-Çıkartma İşlemi\n"
				+ "3-Çarpma İşlemi\n"
				+ "4-Bölme İşlemi\n"
				+ "5-Üslü Sayı Hesaplama\n"
				+ "6-Faktöriyel Hesaplama\n"
				+ "7-Mod Alma\n"
				+ "8-Dikdörtgen Alan ve Çevre Hesaplama\n"
				+ "0-Çıkış Yap\n";
		
		do {
			System.out.print(menu);
			System.out.println("Lütfen bir işlem seçiniz: ");
			select=scan.nextInt();
			switch(select) {
			case 1: 
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7: 
				modAlma();
				break;
			case 8:
				dikdortgen();
				break;
			case 0:
				break;
				default:
					System.out.println("Yanlış bir değer girdiniz,tekrar deneyiniz.");
			}
		}
		while(select !=0);
	}
}
