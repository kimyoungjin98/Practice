import java.util.Scanner;

public class practice_03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

         int A = scan.nextInt();
         int B = scan.nextInt();

         int three = B % 10;
         int two = (B % 100) / 10;
         int one = B / 100;
         
         int first = A * three;
         int second = A * two;
         int third = A * one;
         int sum = first + (second *  10) + (third * 100);

         System.out.println(first);
         System.out.println(second);
         System.out.println(third);
         System.out.println(sum);
    }

}
