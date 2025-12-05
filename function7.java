import java.util.Scanner;

public class function7 {
    public static void avg(int a, int b, int c) {
        int mean = (a + b + c) / 3;
        System.out.println(mean);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        avg(a, b, c);
    }

}
