package Four;

import java.util.Scanner;

public class ZadanieTwo {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        int sum = 1;
        for (int b = 1; b <= n ; b++) {
            sum = sum *b;
        }
        System.out.println("выведи переменную" +sum);
    }
}
