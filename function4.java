import java.util.Scanner;

public class function4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    calculator(a, b);
  }

  public static void calculator(int a, int b) {

    int i = a - b;
    System.out.println(i);

  }

}
