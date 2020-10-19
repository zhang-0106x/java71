package 课堂习题;

import java.util.Scanner;

public class _24 {
    public static void main(String[]args){


        Scanner input = new Scanner(System.in);
        System.out.println("请输入性别");
        String sex = input.next();
        while (!("男").equals(sex)) {
            System.out.println("请输入你的性别");
            sex = input.next();


        }
    }
}
