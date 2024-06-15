public class largestNumber {
  public static int largestNumberInArray(int numbers[]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < numbers.length; i++) {
      if (largest < numbers[i]) {
        largest = numbers[i];
      }
    }
    return largest;
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 3, 4, 56, 77, 89 };
    System.out.println(largestNumberInArray(numbers));
  }
}
