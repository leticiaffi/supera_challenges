import java.io.IOException;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a monetary value: ");
        double cash = sc.nextDouble();

        int note = (int) cash;
        int coin = (int) ((cash - note) * 100);

        int note100 = note/100;
        note = note - note100 * 100;

        int note50 = note/50;
        note = note - note50 * 50;

        int note20 = note/20;
        note = note - note20 * 20;

        int note10 = note/10;
        note = note - note10 * 10;

        int note5 = note/5;
        note = note - note5 * 5;

        int note2 = note/2;
        note = note - note2 * 2;

        int coin1 = note;
        note = note - coin1 * 1;

        int coin50 = coin/50;
        coin = coin - coin50 * 50;

        int coin25 = coin/25;
        coin = coin - coin25 * 25;

        int coin10 = coin/10;
        coin = coin - coin10 * 10;

        int coin05 = coin/5;
        coin = coin - coin05 * 5;

        int coin01 = coin;

        System.out.println("NOTE: ");
        System.out.println(note100 + "\t nota(s) \t de\t R$\t 100,00");
        System.out.println(note50 + "\t nota(s) \t de\t R$\t 50,00");
        System.out.println(note20 + "\t nota(s) \t de\t R$\t 20,00");
        System.out.println(note10 + "\t nota(s) \t de\t R$\t 10,00");
        System.out.println(note5 + "\t nota(s) \t de\t R$\t  5,00");
        System.out.println(note2 + "\t nota(s) \t de\t R$\t  2,00");

        System.out.println("COIN: ");
        System.out.println(coin1  + "\t moeda(s) \t de\t R$\t 1,00");
        System.out.println(coin50 + "\t moeda(s) \t de\t R$\t 0,50");
        System.out.println(coin25 + "\t moeda(s) \t de\t R$\t 0,25");
        System.out.println(coin10 + "\t moeda(s) \t de\t R$\t 0,10");
        System.out.println(coin05 + "\t moeda(s) \t de\t R$\t 0,05");
        System.out.println(coin01 + "\t moeda(s) \t de\t R$\t 0,01");

        sc.close();
    }
}