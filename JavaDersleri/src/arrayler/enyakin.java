package arrayler;

import java.util.Arrays;
import java.util.Scanner;

public class enyakin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int number = scan.nextInt();
		
		int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
		
		Arrays.sort(list);
		System.out.println(Arrays.toString(list));

		int yakinbüyük = number;
		int yakinkücük = number;
		for(int i: list) {
			if(i>number) {
				yakinbüyük = i;
				
				break;
			}
			}
			for(int j: list) {
				if(j<number) {
					yakinkücük = j;
						
				}
			}
			System.out.println("Girilen sayıdan büyük en yakın sayı : " + yakinbüyük);
			System.out.println("Girilen sayıdan küçük en yakın sayı : " + yakinkücük);
				}

	}


