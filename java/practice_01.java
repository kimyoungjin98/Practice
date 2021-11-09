package java;
import java.util.Scanner;

/**
 * practice_01
 */
public class practice_01 {

    // public static void main(String[] args) {

    //     for (int i = 1; i < 10; i++) {

    //         for (int j = 1; j < 10; j++) {

    //             System.out.printf("[%d x %d = %d]\n", i, j, (i * j));

    //         }

    //     }

    // }
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int A= scan.nextInt();
        int B= scan.nextInt();

        System.out.printf("%d\n%d\n%d\n%d\n%d\n", A+B, A-B, A*B, A/B, A%B);

    }

}