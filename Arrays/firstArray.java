import java.util.*;

public class firstArray {
  public static void main(String[] args) {
    int marks[] = new int[3];
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter physics marks:");
      marks[0] = sc.nextInt();
      System.out.println("Enter Chemistry marks:");
      marks[1] = sc.nextInt();
      System.out.println("Enter maths marks:");
      marks[2] = sc.nextInt();
    }
    System.out.println(
        "You got marks of physics: " + marks[0] + " , chemistry marks: " + marks[1] + " and maths marks: " + marks[2]);
    System.out.println("The total length of the arrays are: " + marks.length);
  }
}
