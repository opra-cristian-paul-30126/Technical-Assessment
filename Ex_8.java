import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your text: ");

    String s = keyboard.nextLine();
    String encryptedText = encrypt(s);
    System.out.println("The encrypted text is: \n" + encryptedText);
}

    public static String encrypt(String text) {
        String processedText = text.replaceAll("[\\s.,!?;:+]", "");

        int L = processedText.length();

        int rows = (int) Math.floor(Math.sqrt(L));
        int columns = (int) Math.ceil(Math.sqrt(L));


        char[][] grid = new char[rows][columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if (index < L) {
                    grid[i][j] = processedText.charAt(index);
                    index ++;
                } else {
                    grid[i][j] = ' ';
                }
            }
        }

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                encryptedText.append(grid[i][j]);
            }
            encryptedText.append("\n\n");
        }

        return encryptedText.toString();
    }
}

