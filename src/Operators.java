import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//       Addition

      /*  int a = 15;
        int b = 69;
        System.out.println(a+b);
//        subtraction

        int x = 1;
        int y = 0;
        System.out.println(x-y);

//        Multiplying

        int j = 188;
        int k = 93;
        System.out.println(j*k);

//        Division

        int n = 2;
        int m = 10;
        System.out.println(n%m);

//        Multiple Operators
        int num1 = 55;
        int num2 = 60;
        int num3  = 23;
        double num4 = 98;
        System.out.println("Answer = "+(num4%num2-num1-num2*num3)); */
        Scanner sc = new Scanner(System.in);
        System.out.println("Plus(+) 2 amounts");
        System.out.print("Enter your First amount: ");
        double amount1 = sc.nextDouble();
        System.out.print("Enter your Second amount: ");
        double amount2 = sc.nextDouble();
        System.out.println("Answer = " +(amount1+amount2));



    }
}
