package 作业3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class _1 {
    //1. 使用冒泡排序对输入的5名学员成绩进行降序排列
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int scores[] = new int[5];
        for (int i = 0; i < scores.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学员的成绩:");
            scores[i] = input.nextInt();
        }

        for (int j = 0; j < scores.length - 1; j++) {

            for (int k = 0; k < scores.length - 1 - j; k++) {
                if (scores[k] < scores[k+1]) {
                    int temp = scores[k];
                    scores[k] = scores[k+1];
                    scores[k+1] = temp;

                }
            }

        }
       // System.out.println(Arrays.toString(scores));
        System.out.print("学员的成绩降序排列:");
        for(int score : scores){

            System.out.print(score+"\t");
        }
    }
}
