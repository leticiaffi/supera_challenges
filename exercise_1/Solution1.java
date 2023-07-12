import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Solution1 {

    public static void main(String[] args) {
        System.out.println("Please enter the input: ");
        final Solution1 solution = new Solution1();
        final List<Integer> inputList = solution.readInput();

        System.out.println("\nSolution: ");
        solution.sortAndPrintOutput(inputList);
    }

    private List<Integer> readInput() {
        final Scanner scanner = new Scanner(System.in);
        try {
            final List<Integer> inputList = new ArrayList<>();
            final Integer numberOfLines = nextInt(scanner);

            for (int i = 0; i < numberOfLines; i++) {
                inputList.add(nextInt(scanner));
            }

            return inputList;
        } finally {
            scanner.close();
        }
    }

    private void sortAndPrintOutput(List<Integer> inputList) {
        final List<Integer> evenNumbers = new ArrayList<>();
        final List<Integer> oddNumbers = new ArrayList<>();

        for (Integer number : inputList) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }

        Collections.sort(evenNumbers);
        Collections.sort(oddNumbers, (n1, n2) -> n2.compareTo(n1));

        printList(evenNumbers);
        printList(oddNumbers);
    }

    private void printList(List<Integer> inputList) {
        for (Integer number : inputList) {
            System.out.println(number);
        }
    }

    private int nextInt(final Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Input is not an integer, please input an valid integer");
            throw ex;
        }
    }

}