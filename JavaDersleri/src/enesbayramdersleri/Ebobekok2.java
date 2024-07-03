package enesbayramdersleri;

import java.util.Scanner;

public class Ebobekok2 {

	public static void main(String[] args) {
       Scanner inp=new Scanner(System.in);
		int buyukSayi;
		int kucukSayi;
		int ebob; 
		int ekok;
		System.out.println("n1 sayısını giriniz: ");
		int n1=inp.nextInt();
		System.out.println("n2 sayısını giriniz: ");
		int n2=inp.nextInt();
		
		if(n1<n2) {
			 buyukSayi=n2;
			 kucukSayi=n1;
		}else {
			 buyukSayi=n1;
			 kucukSayi=n2;
		}
		
		
		for(int i=2; i<=buyukSayi; i++) {
			while(n1%i==0 && n2%i==0) {
				System.out.println("Ebob: " + i);
				ebob=i;
				ekok=(n1*n2)/ebob;
				System.out.println("Ekok: " + ekok);
				break;
			}
		}
		
	}

}
