import java.util.Scanner;

public class Main_01 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int year = scan.nextInt();
        int result = 0;

        if (year >= 400) {
            if (year % 400 == 0) {
                result++;
                System.out.println(result);
                return;
            } else if (year % 100 != 0 && year % 4 == 0) {
                result++;
                System.out.println(result);
                return;
            } else {
                System.out.println(result);
                return;
            }
        } else if (year < 400) {
            if (year % 100 != 0 && year % 4 == 0) {
                result++;
                System.out.println(result);
                return;
            } else {
                System.out.println(result);
                return;
            }
        }
    }

}
