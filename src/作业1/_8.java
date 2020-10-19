package 作业1;

import java.util.Scanner;

public class _8 {
    //编写程序，对输入的年、月、日，给出该天是该年的第多少天？
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dateSum = 0;
        System.out.print("请输入年份");
        int year = input.nextInt();
        System.out.print("请输入月份");
        int month = input.nextInt();
        System.out.print("请输入几号");
        int day = input.nextInt();
        int days = 0;
        switch (month) {
            case 12:
                days += 31;
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days += 31;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days += 29;
                } else {
                    days += 28;
                }
            case 1:
                days += day;
        }
        System.out.print("第" + days + "天");


    }
}








