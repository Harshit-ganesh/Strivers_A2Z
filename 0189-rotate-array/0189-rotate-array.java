class Solution {
    public void rotate(int[] nums, int k) {
        // Reverse first k elements
        int n = nums.length;
        k = k % n;
        if (n < k)
            return;
        Reverse(nums, 0, n - k - 1);
        // Reverse last n-k elements
        Reverse(nums, n - k , n - 1);
        // Reverse whole array
        Reverse(nums, 0, n - 1);
    }
    // Function to Reverse the array
  public static void Reverse(int[] arr, int start, int end) {
    while (start <= end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}