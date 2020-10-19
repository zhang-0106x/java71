package 课堂习题;

import java.util.Scanner;

public class _20 {
    public static void main(String[] args) {
/*4、从键盘输入一位整数，当输入1~7时，输出“星期一”~“星期日”
输入其他数字时，提示用户重新输入*/


        int week =-1;
        System.out.println("请输入数字1~7");
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 7; i++) {


            week = input.nextInt();

            switch (week) {

                case 1:
                    System.out.println("星期一");
                    return;
                case 2:
                    System.out.println("星期二");
                    return;
                case 3:
                    System.out.println("星期三");
                    return;
                case 4:
                    System.out.println("星期四");
                    return;
                case 5:
                    System.out.println("星期五");
                    return;
                case 6:
                    System.out.println("星期六");
                    return;
                case 7:
                    System.out.println("星期日");
                    return;

                default:
                    System.out.println("输入有误，请重新输入\n请输入数字1~7");
            }


        }


    }
}
