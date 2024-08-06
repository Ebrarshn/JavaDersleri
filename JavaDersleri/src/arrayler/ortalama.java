package arrayler;

import java.util.Scanner;

public class ortalama {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);

		double avarage = 0.0;
		double sum = 0.0;
		System.out.println("Eleman sayısını giriniz: " );
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++) {
			sum+=1.0/i;
			
		}
	avarage = n/sum;
	System.out.println("Ortalama: " + avarage);

	}

}
