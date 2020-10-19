package 二维数组;

import java.util.Scanner;

public class practile1 {
    //有5个班级各5名学生某门课的成绩，如何计算5个班各自的总成绩
    public static void main(String[]args){
        int[][]scores=new int[5][5];
        Scanner input=new Scanner(System.in);
        //外层循环---班，（内循环----班级学生）
        for(int i=0;i<scores.length;i++){
            System.out.println("第"+(i+1)+"个班:");
            for(int j=0;j<scores[i].length;j++){
                System.out.print("第"+(j+1)+"个同学的成绩:"+"\t");
                scores[i][j]=input.nextInt();
            }
            System.out.println();
        }

        //完成5个班级的成绩统计
        System.out.println("统计考试成绩");
        for(int i=0;i<scores.length;i++){
            int sum=0;
            for(int j=0;j< scores[i].length;j++){
                sum+=scores[i][j];
            }
            System.out.println("第"+(i+1)+"个班的同学成绩是:"+sum);
        }
    }
}
