import java.util.Scanner;

public class function6 {
    public static void prime(int n) {
        for (int i = 2; i <= n; i++)

        {
            if (n == 2) {
                System.out.println("prime");

            } else {
                if (n % i == 0) {
                    System.out.println("not");
                    break;
                } else {
                    System.out.println("prime");

                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);

    }

}
