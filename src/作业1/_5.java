package 作业1;

import java.util.Scanner;

public class _5 {
    //手动输入一个整型会员号，
    //如果用户输入的是4位数字，
    //输出登录成功，
    //如果用户输入的不是4位数字,
    //输出“您输入的会员号有误”
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入四位数会员号");
        int num = input.nextInt();
        if (num >= 1000 && num <= 9999) {
            System.out.println("登陆成功");
        } else {
            System.out.println("您输入的会员号有误");
        }


    }
}
