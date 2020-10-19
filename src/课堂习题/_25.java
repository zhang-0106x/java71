package 课堂习题;

import java.util.Scanner;

public class _25 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的姓名");
        String name = input.next();

        int sum = 0;

        for (int i = 1; i <= 6; i++) {


            System.out.println("请输入第" + i + ("门课"));
            int score = input.nextInt();

            sum = sum + score;


        }
        double avg =(double) sum /6;
        System.out.println("请输入6门成绩的平均分" +  avg);



        }
    }

