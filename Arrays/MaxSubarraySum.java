public class MaxSubarraySum {
  // Brute force approach
  public static int maxSubarraySum(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum += arr[j];
        maxSum = Math.max(maxSum, sum);
      }
    }
    return maxSum;
  }

  // Kadane's algorithm
  public static int maxSubarraySumKadane(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      maxSum = Math.max(maxSum, sum);
      if (sum < 0) {
        sum = 0;
      }
    }
    return maxSum;
  }

  //prefix sum approach
  public static int maxSubarraySumPrefixSum(int[] arr) {
    int maxSum = Integer.MIN_VALUE;
    int sum = 0;
    int minSum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      maxSum = Math.max(maxSum, sum - minSum);
      minSum = Math.min(minSum, sum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    System.out.println(maxSubarraySum(arr));
    System.out.println(maxSubarraySumKadane(arr));
    System.out.println(maxSubarraySumPrefixSum(arr));
  }
}
