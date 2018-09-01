package Four;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int result = 25;
        do {

            System.out.println("Введите число 25");
            result = scanner.nextInt();
            if (result == 25) {
                break;
            }

        } while (true);
        System.out.println("Вы восхитительны");
    }
}
