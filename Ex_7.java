import java.util.Scanner;


public class Ex_7 {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Please enter the height of the staircase: ");
       int n = keyboard.nextInt();
       printStaircase(n);
       keyboard.close();
    }

    public static void printStaircase(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            if (i != n) {
                System.out.println();
            }
        }
    }
}