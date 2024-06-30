package enesbayramdersleri;
import java.util.Scanner;
public class basamakToplami {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz");
		int number=inp.nextInt();
		int result=0;
		int basNumber=0;
		int tempNumber;
		tempNumber=number;
		while(tempNumber!=0) {
			tempNumber/=10;
			basNumber++;
		}
		tempNumber=number;
		while(tempNumber!=0) {
			int basValue=tempNumber%10;
			for(int i=0; i<=basNumber; i++) {
			    }
			 tempNumber/=10;
			 result+=basValue;
		}
		System.out.print(result);
	}

}
