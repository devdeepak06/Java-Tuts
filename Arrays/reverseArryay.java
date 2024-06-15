public class reverseArryay {
  public static void reverseAnArryay(int[] numbers) {
    int start = 0;
    int end = numbers.length - 1;
    while (start < end) {
      int temp = numbers[end];
      numbers[end] = numbers[start];
      numbers[start] = temp;
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int numbers[] = { 2, 4, 6, 8, 9, 11, 33, 44, 7 };
    reverseAnArryay(numbers);
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    
    System.out.println();
  }
}
