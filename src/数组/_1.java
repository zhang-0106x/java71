package 数组;

import java.util.Scanner;

//使用数组求平均分
public class _1 {
    public static void main(String[] args) {
        double[] score = new double[5];//声明变量名
        double avg = 0;
        double sum = 0;
        //传统for的循环方式为数组赋值
        //使用for循环来遍历数组的元素下标，下标0-->数组长度
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位同学的成绩:");
            score[i] = input.nextDouble();//动态根据数组下标获取键盘输入回来内容
            sum += score[i];


        } /* for (double scores : score) {  //增强型的for循环，获取下标值赋值给定义新的变量

                sum += scores;
            }*/
        avg = sum / 5;
        System.out.println("平均分是" + avg);
    }
}
