package 作业3;

import java.util.Arrays;
import java.util.Scanner;

public class _4 {
    //向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
    //1)统计每个数字出现了多少次
    //2)输出出现次数最多的数字
    //3)输出只出现一次的数字中最小的数字
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 10);//随机生成十个0~9以内的数
        }
        System.out.println("随机生成的十个数为：" + Arrays.toString(nums));
        int[] time = new int[10];//开辟一个新空间作为储存nums数组0~9以内十个数出现的次数
        for (int i = 0; i < time.length; i++) {//循环遍历进行对比（从0~9依次与随机数组比较）
            for (int j = 0; j < nums.length; j++) {//循环遍历进行对比
                if (nums[j] == i) {  //判断新开辟的空间time内有和nums数组内相同的数出现的次数
                    time[i]++;     //记录出现个数，没有出现的就是0次，出现过就自加1,然后从0~9之间将出现数的次数取出，新建一个数组，

                }
            }
        }
        System.out.println("随机生成的十个数出现的次数为：" + Arrays.toString(time));
        for (int i = 0; i < time.length; i++) {
            if (time[i] != 0) {  //判断nums数组的数在time数组里出现过的次数
                System.out.println(i + "出现了" + time[i] + "次");
                //i代表第几个下标，从0开始，time[i]代表每个下标所指向的值
            }
        }
        int max = time[0];
        for (int i = 0; i < time.length; i++) {
            if (time[i] > max) { //循环判断出现过次数最多的值
                max = time[i];
            }
        }
        for (int i = 0; i < time.length; i++) {
            if (time[i] == max) {   //判断time数组里与max相同的值，取出出现最多次的值的下标
                System.out.println("出现次数最多的是" + i);
            }
        }
        for (int i =0; i<time.length; i++) {
            if (time[i] ==1) {
                System.out.println("出现一次中最小的数为:" + i);
                break;
            }
        }
/*

        int count = 0;
        for (int i = 0; i < time.length; i++) {
            if (time[i] == 1) {
                count++;//记录出现过一次的数有几个
            }
        }
        int[] newNums = new int[count];//将出现过一次的数的个数(count)值作为newNums的数组长度
        int count1 = 0;  //定义一个newNums下标，count1
        for (int i = 0; i < time.length; i++) {
            if (time[i] == 1) {
                newNums[count1] = i;
                count1++;
            }
        }
        int min1 = newNums[0];
        for (int i = 0; i < newNums.length; i++) {
            if (newNums[i] < min1) {
                min1 = newNums[i];
            }
        }
        System.out.println("出现一次中最小的数为:" + min1);
*/


    }
}



