package 作业5;

import java.util.Arrays;
import java.util.Scanner;

public class practice6 {
    //4、java定义一个3*5的二维数组，用来存储某班级3位学员的5门课的成绩
    //定义一个3*5的二维数组，用来存储某班级3位学员的5门课的成绩；这5门课
    // 按存储顺序依次为：Java，JSP，CoreJava，MySQL和HTML5。
    //（1）循环给二维数组的每一个元素赋0~100之间的随机整数。 (int) (Math.random() * 100)
    //（2）按照列表的方式输出这些学员的每门课程的成绩。
    //（3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
    //（4）要求编写程序求所有学员的某门课程的平均分
    public static void main(String[] args) {
        String[] courses = new String[]{"Java", "JSP", "CoreJava", "MySQL", "HTML5"};
        //将课程定义为一个一维数组，作为列表标题打印输出
        for (String i : courses) {
            System.out.print(i + "   ");
        }
        System.out.println();
        int[][] scores = new int[3][5];//二维数组储存学员（3）及每个学员（5）的成绩
        int[] scores1 = new int[scores.length];//定义一个一维数组，储存每个学员的总分,长度与二维数组的行长度相同
        int count = 0;//所有学员某门课程的总分
        double avg; //所有学员的某门课程的平均分
        int n = -1;  //替代变量
        for (int i = 0; i < scores.length; i++) { //外循环    循环每个学生
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) { //内循环   每个学员的每门课的随机成绩
                //随机生成0~100的数，根据Math.random()值0.0~9.9的原因，*100+1，即可随机0~100的数
                scores[i][j] = (int) (Math.random() * 100+1);
                System.out.print(scores[i][j] + "\t\t");
                sum += scores[i][j];//循环随机一个数，加一个数
            }
            System.out.println();
            scores1[i] = sum;//五门课的总分赋值给到新数组
            System.out.println("\n" + "第" + (i + 1) + "个学员的总分:" + sum + "\n");
        }
            System.out.println("学员总分生成新的一维数组是:" + Arrays.toString(scores1));



        System.out.print("\n" + "请输入需要查询所有学员平均分的课程:");
        Scanner input = new Scanner(System.in);
        String course = input.next();
        outer:
        for (int i = 0; i < scores.length; i++) {//外层循环学员人数
            for (int j = 0; j < scores[i].length; j++) { //内层循环学员成绩
                for (int k = 0; k < courses.length; k++) {//循环课程
                    // 判断查询的课程与courses[k]所指向的课程相等，且课程的下标与学员成绩的下标相同，满足条件相加赋值给到count记录下来
                    if (course.equals(courses[k]) && j == k) {
                        n = k;
                        count += scores[i][j];
                        continue outer;//满足条件直接跳出最外层循环进行下一次循环
                    }

                }
            }
        }
        avg = (double) count / scores.length;//平均分

        if (n != -1){
            System.out.println("\n"+"所有学员的" + courses[n] + "课程的平均分" + avg+"\n");
        } else {
            System.out.println("抱歉，没有找到需要查询的课程！");
        }


    }
}