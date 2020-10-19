package 作业1;

import java.util.Scanner;

public class _7 {
    //输入年份和月份，输出这个月应该有多少天（使用switch结构）
    public

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
        System.out.println("请输入月份");
        int month = input.nextInt();


        switch (month) {
            case 1:
                System.out.println("本月31天");
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("本月29天");
                } else {
                    System.out.println("本月28天");
                }
                break;
            case 3:
                System.out.println("本月31天");
                break;
            case 4:
                System.out.println("本月30天");
                break;
            case 5:
                System.out.println("本月31天");
                break;
            case 6:
                System.out.println("本月30天");
                break;
            case 7:
                System.out.println("本月31天");
                break;
            case 8:
                System.out.println("本月31天");
                break;
            case 9:
                System.out.println("本月30天");
                break;
            case 10:
                System.out.println("本月31天");
                break;
            case 11:
                System.out.println("本月30天");
                break;
            case 12:
                System.out.println("本月31天");
                break;


        }


    }


}
