package ketang;

import java.util.Scanner;

public class exampile3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入等腰三角形的行数:");
        int line=input.nextInt();
        int[][] arr = new int[line][line];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            //控制第一列的数字等于1
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i-1][j];   //赋值
            }
        }
        //打印结果
        for (int x = 0; x < arr.length; x++) {
            for (int y = arr.length - x; y > 0; y--) {     //空格的控制，为了好看
                System.out.print("  ");
            }
            for (int k = 0; k < arr.length; k++) {     //打印出数组的数字
                if (arr[x][k] != 0) {      //把没赋值的0去掉
                    System.out.print("  "+arr[x][k] + " ");
                }
            }
            System.out.println();    //控制换行
        }


    }


}
