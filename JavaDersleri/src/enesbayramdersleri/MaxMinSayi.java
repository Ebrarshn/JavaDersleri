package enesbayramdersleri;
import java.util.Scanner;
public class MaxMinSayi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("kaç sayı gireceksiniz: ");
		int n=scan.nextInt();
		int max;
		int min;
		System.out.print("1.sayıyı girinz: ");
		int first=scan.nextInt();
		
		max=first;
		min=first;
		
		for(int i=2; i<=n; i++) {
			System.out.print(i + "." + "sayıyı giriniz: ");
			int number=scan.nextInt();
			
			if(number>max) {
				max=number;
			}
			
			if(number<min) {
				min=number;
			}
			
		}
		System.out.println("en büyük sayı: " + max);
		System.out.println("en küçük sayı: " + min);	
	}

}