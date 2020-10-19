package 作业1;

import java.util.Scanner;

public class _4 {
    //用户输入一个年份，如果是闰年输出是闰年
    //（年份能被4整除，且不能被100整除，或者能被400整除的年份）
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("闰年");


        }else{System.out.println("平年");}


    }


}
