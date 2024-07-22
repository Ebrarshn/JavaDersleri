package enesbayramdersleri;
import java.util.Scanner;
public class recursiveÜslü {
	
	static int power(int base,int exponent) {
		int sonuc =1;
		for(int i=1; i<=exponent; i++) {
			sonuc*=base;
		}
		return sonuc;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Taban değeri girniz: ");
		int base=scan.nextInt();
		System.out.println("Üssü değeri girniz: ");
		int exponent=scan.nextInt();
		
        System.out.println("Sonuç: " + power(base,exponent));
	}

}
