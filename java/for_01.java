import java.lang.reflect.Array;
import java.util.Scanner;

public class for_01 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();
		int array[] = new int[t];

		for(int i = 0 ; i < t ; i++){
			int a = scan.nextInt();
			int b = scan.nextInt();
			array[i] = a + b; 
		}

		for(int sum : array){
			System.out.println(sum);
		}

	}
	
}
