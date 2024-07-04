package enesbayramdersleri;
import java.util.Scanner;
public class YıldızElmas {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	     
	     System.out.print("Satır sayısını giriniz: ");
	     int sayi=scan.nextInt();
	     
	     for(int i=0; i<=sayi; i++) {
	    	 for(int k=0; k<=sayi-i; k++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int m=1; m<=2*i+1; m++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
	     for(int i=sayi-1; i>=0; i--) {
	    	 for(int k=0; k<=sayi-i; k++) {
	    		 System.out.print(" ");
	    	 }
	    	 for(int m=1; m<=2*i+1; m++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
	}

}
