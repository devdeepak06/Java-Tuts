public class smallestNumber {
  public static int getSmallestNumber(int numbers[]) {
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      if (smallest > numbers[i]) {
        smallest = numbers[i];
      }
    }
    return smallest;
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 3, 4, 56, 77, 89 };
    System.out.println("smallest value is: " + getSmallestNumber(numbers));
  }
}
