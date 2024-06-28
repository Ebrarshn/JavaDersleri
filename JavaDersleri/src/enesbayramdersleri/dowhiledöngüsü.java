package enesbayramdersleri;

import java.util.Scanner;

public class dowhiledöngüsü {

	public static void main(String[] args) {
	      Scanner inp = new Scanner(System.in); 
	       
	      int total=0;
	      int sayi;
	      
	      do {
	    	  System.out.println("sayı giriniz: ");
	    	  sayi= inp.nextInt();
	    	  if(sayi%2==0 && sayi%4==0 ) {
		    	  total+=sayi;
		    	  
		      }
	      }while(sayi%2==0);
	     
	      System.out.println("istenilen sayıların toplamı: " +total);
	}

}
