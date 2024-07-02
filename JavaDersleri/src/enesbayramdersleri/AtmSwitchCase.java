package enesbayramdersleri;
import java.util.Scanner;
public class AtmSwitchCase {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int right=3;
		int balance=2000;
		int price;
		
		System.out.println("Sahin ATM'ye HOŞGELDİNİZ");
		System.out.print("Lütfen kullanıcı adınızı giriniz: ");
		String userName=scan.nextLine();
		System.out.print("Lütfen şifrenizi giriniz: ");
		String password=scan.nextLine();
		
		if(userName.equals("ebrar") && password.equals("java123")) {
			System.out.println("Hesabınıza giriş yapıldı...");
			System.out.println("1-Para yatırma\n" +
			                   "2-Para çekme\n" +
					           "3-Bakiye görüntüleme\n" +
			                   "4-Çıkış işlemi\n");
			System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
			int select=scan.nextInt();
			
			switch(select) {
			case 1: 
				System.out.println("para miktarı: ");
				price=scan.nextInt();
				balance+=price;
				System.out.println("bakiyeniz: " + balance);
				break;
			case 2:
				System.out.println("para miktarı: ");
				price=scan.nextInt();
				if(price>balance) {
					System.out.println("Yetersiz bakiye");
				}else {
					balance-=price;
					System.out.println("bakiyeniz: "+ balance);
				}
				break;
			case 3: 
				System.out.println("Bakiyeniz: " + balance);
				break;
			case 4: 
				System.out.print("Çıkış yapıldı.");
				break;
			}
			
			
		}else {
			System.out.println("Kullanıcı adınız veya şifreniz hatalı tekrar deneyiniz ");
			
			}
		}

	}


