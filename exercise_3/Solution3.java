import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution3 {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Enter a value for N: ");
            int n = scanner.nextInt();
            System.out.printf("Enter a value for K: ");
            int k = scanner.nextInt();

            System.out.printf("Enter the Array values: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = pairOfNumbers(arr, k);
            System.out.println("The number of pairs between the Array elements and the target value is : "+ result + ".");

        }
        public static int pairOfNumbers(int[] arr, int k) {
            int count = 0;
            Set<Integer> numSet = new HashSet<>();

            for (int num : arr) {
                numSet.add(num);
            }

            for (int num : arr) {
                if (numSet.contains(num - k)) {
                    count++;
                }
            }

            return count;
        }

    }
