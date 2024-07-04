package enesbayramdersleri;
import java.util.Scanner;
public class mukemmelSayi {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
	
		int total=0;
		System.out.print("Bir sayı giriniz: ");
		int number=inp.nextInt();
		for(int i=1; i<number; i++) {
			
			if(number%i==0) {
				System.out.println(i);
				 total+=i;
			}
		       }
		if(number==total) {
			System.out.println(number + " bir mükemmel sayıdır...");
		}else {
			System.out.println(number + " bir mükemmel sayı değildir...");
		}
	}

}
