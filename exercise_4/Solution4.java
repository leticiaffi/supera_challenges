import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the value of test cases: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the phrases to be unscrambled: ");
        List<String> phrases = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            if (line.equals(line.toUpperCase()) && line.length() >= 2 && line.length() <= 100 && line.length() % 2 == 0) {
                phrases.add(line);
            } else {
                System.out.println("Please enter the phrase in uppercase with a minimum of 2 and a maximum of 100 characters!");
                i--;
            }
        }

        System.out.println("Deciphered phrases:");
        for (String phrase : phrases) {
            String decryptedPhrase = decryptLine(phrase);
            System.out.println(decryptedPhrase);
        }

        scanner.close();
    }

    public static String decryptLine(String line) {
        int length = line.length();
        StringBuilder decryptedLine = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            decryptedLine.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            decryptedLine.append(line.charAt(i));
        }

        return decryptedLine.toString();

    }
}