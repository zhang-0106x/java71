package 作业5;

import java.util.Scanner;

public class practile4 {
    //使用二维数组存储班上五个学生三门功课的考试成绩，要求输出每一个学生的总分、平均分、最高分、最低分
    public static void main(String[] args) {
        int[][] scores = new int[5][3];
        int max, min;
        double avg;
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.println("第" + (i + 1) + "个学生:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("第" + (j + 1) + "门课成绩:"+"\t");
                Scanner input = new Scanner(System.in);
                scores[i][j] = input.nextInt();
                sum += scores[i][j];


            }
            max = min = scores[i][0];
            for (int n = 0; n < scores[i].length; n++) {
                if (scores[i][n] > max) {
                    max = scores[i][n];
                }
                if (scores[i][n] < min) {
                    min = scores[i][n];
                }
            }
            avg = (double) sum / scores[i].length;
            System.out.println("第" + (i + 1) + "个的学生的总分:" + sum);
            System.out.println("第" + (i + 1) + "个的学生的平均分:" + avg);
            System.out.println("第" + (i + 1) + "个的学生的最高分:" + max);
            System.out.println("第" + (i + 1) + "个的学生的最低分:" + min);

        }


    }


}


