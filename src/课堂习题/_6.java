package 课堂习题;

import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        int num = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入班级的总人数");
        int total = input.nextInt();

        for (int i = 1; i <= total; i++) {
            System.out.println("请输入第" + i + "个学生的成绩");
            int score = input.nextInt();
            if (score < 80) {
                System.out.println("成绩小于80");
                continue;

            }
            num++;

        }
        System.out.println("80分以上的学生数" + num);
        double accounted = (double) num / total * 100;
        System.out.println("请输入80分以上的学生占比" + (accounted) + "%");
    }
}
