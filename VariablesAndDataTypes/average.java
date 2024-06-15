import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, averageSum;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        averageSum = (num1 + num2 + num3) / 3;
        System.out.println(averageSum);
        sc.close();
    }
}