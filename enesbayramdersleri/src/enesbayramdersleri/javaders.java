package enesbayramdersleri;
import java.util.Scanner;

public class javaders {

	public static void main(String[] args) {
		 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Adınızı giriniz: ");
		String isim = scanner.nextLine();
		
		System.out.print("Soyadınızı giriniz: ");
	    String soyad = scanner.nextLine();
	    
	    System.out.print("Ders Adını Giriniz: ");
	    String dersAdi = scanner.nextLine();
	    
	    System.out.print("vize1 notunuzu giriniz: ");
	    Double vize1 = scanner.nextDouble();
	    
	    System.out.print("vize2 notunuzu giriniz: ");
	    Double vize2 = scanner.nextDouble();
	    
	    System.out.print("Final notuunuzu giriniz: ");
	    Double finalnotu = scanner.nextDouble();
	    
	    Double sonuc = (vize1*0.3) + (vize2*0.3) + (finalnotu*0.4);
	    
	    if(sonuc >= 60) {
	    	System.out.println(isim + " " + soyad + "adlı öğrenci" + dersAdi + "dersinden" + sonuc + "ortalama ile geçmiştir: ");
	    }
	    else {
	    	System.out.println("Dersten Kaldınız :( ");
	    }
	
	}

}
