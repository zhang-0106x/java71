package 数组;

import java.util.Arrays;

public class _6 {
    public static void main(String[] args) {
        int nums[] = new int[]{21, 32, 4, 54, 12, 34, 43, 11, 5};
        System.out.println("排序前:" + Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("排序后:" + Arrays.toString(nums));
    }
}
