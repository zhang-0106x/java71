package 作业3;

import java.util.Arrays;
import java.util.Scanner;

public class _3 {
    //向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
    //1)升序输出、降序输出
    //2)输出总和、平均数
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[10];
        int sum = 0;
        double avg = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (10 * Math.random());
            sum += nums[i];
            avg = (double) sum / nums.length;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("升序输出:" + Arrays.toString(nums));
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("降序输出:" + Arrays.toString(nums));
        System.out.println("输出总和:" + sum);
        System.out.println("平均数:" + avg);
    }
}