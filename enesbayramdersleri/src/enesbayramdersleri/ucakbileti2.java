package enesbayramdersleri;

import java.util.Scanner;

public class ucakbileti2 {
    public static void main(String[] args) throws Exception {

        /*
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
         * Kullanıcıdan Mesafe (KM), * yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
         * Mesafe başına ücret 0,10 TL / km olarak alın. 
         * İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre 
         * müşteriye aşağıdaki indirimleri uygulayın;
         * 
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. 
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner sc = new Scanner(System.in);
        int mesafe, yas, tipi;
        double mesafeBasi = 0.10, toplamTutar;

        System.out.print("Gideceğiniz mesafeyi km olarak giriniz: ");
        mesafe = sc.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = sc.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        tipi = sc.nextInt();

        toplamTutar = mesafe * mesafeBasi;


        if ((mesafe > 0) && (yas > 0) && (tipi <= 2)) {

            if (yas < 12) {
                    System.out.println("\nÖdeyeceğiniz toplam tutar: " + toplamTutar + " TL");
                    toplamTutar = toplamTutar - (toplamTutar * 0.50);
            } else if ((yas >= 12) && (yas <= 24)) {
                    System.out.println("\nÖdeyeceğiniz toplam tutar: " + toplamTutar + " TL");
                    toplamTutar = toplamTutar - (toplamTutar * 0.10);
            } else if (yas >65) {
                    System.out.println("\nÖdeyeceğiniz toplam tutar: " + toplamTutar + " TL");
                    toplamTutar = toplamTutar - (toplamTutar * 0.30);
            } 
            if (tipi == 2) {
                    toplamTutar = (toplamTutar - (toplamTutar * 0.20)) * 2;
            } 

            System.out.println("\nÖdeyeceğiniz indirimli toplam tutar: " + toplamTutar + " TL\n");

        } 
        else {
            System.out.println("\nHatalı veri girdiniz! Lütfen 0 veya daha büyük bir değer giriniz.\n");

        }

    }
}