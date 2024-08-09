package arrayler;
import java.util.Scanner;
import java.util.Arrays;
public class dizisıralama {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k=1;
		
		System.out.println("Dizinin boyutunu giriniz: ");
		int n =scan.nextInt();
		
		int[] number= new int[n];
		System.out.println("Dizinin elemanlarını giriniz: ");
		
		for(int i=0; i<n; i++) {
			System.out.print(k + ". Elemenı: ");
		    number[i]=scan.nextInt();
		    k++;
		}
		Arrays.sort(number);
		System.out.println("Sıralama: " + Arrays.toString(number));

	}

}
