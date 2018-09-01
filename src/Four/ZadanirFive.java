package Four;

import java.util.Scanner;

public class ZadanirFive {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("введите");
        int n = a.nextInt();
        int x = 1;
        int y = 1;
        while (x <=n) {
            y = x*y;
            x++;
        }
        System.out.println(y);
    }
}
