package 课堂习题;

import java.util.Scanner;

public class _21 {
    public static void main(String[]args){
//使用双重循环根据用户输入的数字，数字空心菱形
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = input.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int k = 1; k <= a - i; k++) {
                System.out.print("  ");}

            for (int b = 1; b <=2*i-1; b++) {
                if(b==1||b ==2*i-1){
                    System.out.print(i+" ");
                }else{ System.out.print("  ");}


            }


            System.out.println();
        }

        for (int i =(a-1); i >=1; i--) {
            for (int k = 1; k <= a - i; k++) {
                System.out.print("  ");}

            for (int b = 1; b <=2*i-1; b++) {
                if(b==1||b ==2*i-1){
                    System.out.print(i+" ");
                }else{ System.out.print("  ");}


            }


            System.out.println();
        }





}
}
