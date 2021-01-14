/**
 * @Author chenk
 * @create 2021/1/14 23:22
 */
public class Q_53 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum < 0 ? nums[i] : sum + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
