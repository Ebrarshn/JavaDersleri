package enesbayramdersleri;

import java.util.Scanner;

public class donguvekararyapıları {

	public static void main(String[] args) {
		
		Scanner inp= new Scanner(System.in);
		System.out.print("Sınır sayıyı giriniz: ");
		int n =inp.nextInt();
		int i=0;
		
		for(i=0; i<=n; i++) {
			if(i%4==0 && i%5==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
