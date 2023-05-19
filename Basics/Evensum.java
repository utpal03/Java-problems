import java.util.Scanner;

public class Evensum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int result = 0;
            System.out.print("Enter the number upto with you want the sum: ");
            int num = sc.nextInt();
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 0) {
                    result += i;
                }
            }
            System.out.println(result);
        }

    }
}
