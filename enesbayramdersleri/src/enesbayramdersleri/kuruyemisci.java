package enesbayramdersleri;

import java.util.Scanner;

public class kuruyemisci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double leblebi = 3.5;
		double findik = 15.7;
		double badem = 22;
		
		double maliyeTutar = (leblebi*12) + (findik*1.4) + (badem*40);
		
		double satisTutar = ((leblebi*1.5)*12) + ((findik*1.4)*25) + ((badem*1.6)*40);
		
		double kaarTutar = satisTutar - maliyeTutar;
		
		if(kaarTutar>500) 
		{
			System.out.println("Kirayı ödeyebilirsiniz.");
		}
		else
		{
			System.out.println("Kirayı ödemek için yeterli bakiyeniz bulunmamaktadır.Daha sonra tekrar deneyiniz.");
		}
		
		System.out.println("Maliyet tutarı: " + maliyeTutar);
		System.out.println("Satış tutar: " + satisTutar);
		System.out.println("Kazanç Tutar: " + kaarTutar );
	}

}
