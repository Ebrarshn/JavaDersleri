package enesbayramdersleri;
import java.util.Scanner;
public class ÇarpımTablosu {

	public static void main(String[] args) {
	     Scanner scan=new Scanner(System.in);
	
	     System.out.println("Çarpım tablosu istenen sayıyı giriniz: ");
	     int n=scan.nextInt();
	     int result=0;
	    
	     
	     for(int i=1; i<=20; i++) {
	    	  result=n*i;
	    	 
	    	  System.out.println(n + "x" + i + "=" + result );
	    	  
	     }
	    
	}

}
