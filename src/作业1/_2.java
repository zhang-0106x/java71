package 作业1;

import java.util.Scanner;

public class _2 {
    //手动输入一个4位数，求各位数字之和
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入任意四位数");
        int num = input.nextInt();
          int gewei=num%10;
          int shiwei=num/10%10;
          int baiwei=num/100%10;
          int qianwei=num/1000%10;
          int sum=gewei+shiwei+baiwei+qianwei;
          System.out.println("四位数各位数之和是："+sum);

    }
}
