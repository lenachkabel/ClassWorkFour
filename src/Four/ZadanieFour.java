package Four;

import java.util.Scanner;

public class ZadanieFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y;
        int x = 1;
        int n = x;
        x = s.nextInt();
        y = s.nextInt();
        System.out.println("число");
        System.out.println("число");
        while (y > 0) {
            n = n * x;
            y--;
        }
        System.out.println("ответ" + n);
    }
}

