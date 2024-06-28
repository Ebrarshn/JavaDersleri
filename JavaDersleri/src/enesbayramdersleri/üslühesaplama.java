package enesbayramdersleri;

import java.util.Scanner;

public class üslühesaplama {

	public static void main(String[] args) {
		
		Scanner inp=new Scanner((System.in));
		int i=1;
		int k=1;
		int total =1;
		
		System.out.print("üs olacak sayıyı giriniz: ");
		int n=inp.nextInt();
		System.out.print("taban olacak sayıyı giriniz: ");
		int m=inp.nextInt();
		
		for(i=1; i<=n; i++) {
			total*=m;
			
		}
		System.out.print("cevap: "+total);
	}

}
