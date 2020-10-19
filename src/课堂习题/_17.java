package 课堂习题;

import java.util.Scanner;

public class _17 {
    public static void main(String[] args) {
        //1、输入3个班，每班5个学生的成绩，求每个班的总分、平均分、最高分、最低分。

        int sum;
        double avg = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            int highest;
            int lowest;
            int score = 0;
            highest = lowest = score;
            sum = 0;
            for (int k = 1; k <= 5; k++) {
                System.out.print("请输入第" + i + "个班\n第" + k + "个同学的成绩:");
                score = input.nextInt();


                if (score > highest) {
                    highest = score;
                }
                if (lowest == 0 || score < lowest) {
                    lowest = score;
                }

                sum += score;


            }
            avg = (double) sum / 5;
            System.out.println("第" + i + "个班");
            System.out.println("总分是:" + sum + "\t平均分是:" + avg + "\t最高分是:" + highest + "\t最低分是:" + lowest);


        }
    }
}
