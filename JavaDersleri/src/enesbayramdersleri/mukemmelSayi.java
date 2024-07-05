package enesbayramdersleri;
import java.util.Scanner;
public class mukemmelSayi {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int n=inp.nextInt();
		int total=0;
		
			for(int i=1; i<=n-1; i++) {
				if(n%i==0) {
				System.out.println(i);
				total+=i;
				}
				
			}
			if(n==total) {
				System.out.println(n + " mükemmel bir sayıdır");
			}else {
				System.out.println(n + " mükemmel bir sayı değildir");	
			}
	}

}
