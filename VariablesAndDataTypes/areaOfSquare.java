import java.util.Scanner;

public class areaOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side, area;
        side = scanner.nextInt();
        area = side * side;
        System.out.println(area);
        scanner.close();
    }        
}
