import java.util.*;
public class function1 {
   //multiply two numbers
   public static int multiply (int a,int b){
    return a*b;

   }
   public static void main(String[] args){
    Scanner ip=new Scanner(System.in);
    int a=ip.nextInt();
    int b=ip.nextInt();
    int result=multiply(a,b);
    System.out.println(result);
   } 
}
