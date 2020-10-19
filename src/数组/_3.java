package 数组;

import java.util.Scanner;

public class _3 {
    public static void main(String[] args) {
        int num[] = new int[]{12, 34, 5, 56, 77, 4};
        Scanner input = new Scanner(System.in);
        int sum=0;
        for(int j:num){
            sum+=j;
            System.out.print(j+"\t");
        }
        System.out.println("\n数组所有数之和："+sum);
        System.out.println("请输入一个整数");
        int nums = input.nextInt();
        boolean a = false;
        for (int i : num) {

            if (i == nums) {
                a = true;
                break;
            }

        }
        if (a) {
            System.out.println("恭喜你猜对了");

        }else {
            System.out.println("很遗憾，猜错了");
        }


    }
}
