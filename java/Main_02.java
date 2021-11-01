import java.util.Scanner;

public class Main_02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int result = 1;

        if(x != 0 && y != 0){

            if (x >= 1 && y >= 1) {
                System.out.println(result);
                return;
            } else if (x < 1 && y >= 1) {
                result++;
            } else if (x < 1 && y < 1) {
                result += 3;
            } else if (x >= 1 && y < 1) {
                result += 4;
            }
            System.out.println(result);
        }

    }
    
}
