package 二维数组;

import java.util.Scanner;

public class practile3 {
    // 编写java程序，从键盘确定数组的维数，从键盘输入二维数组各个元素值，打印输出这个二维数组，并打印输出行列颠倒的二维数组。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的行与列:");
        int line = input.nextInt();
        int column = input.nextInt();
        int[][] arr = new int[line][column];
        System.out.println("请输入二维数组各个元素值:");
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                arr[x][y] = input.nextInt();

            }
            System.out.println();

        }
        System.out.println("结果如下");
        System.out.println("\n打印这个二维数组:");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }
        System.out.println("打印输出行列颠倒的二维数组:");
        for (int i = 0; i <column; i++) {
            for (int j = 0; j < line; j++) {

                System.out.print(arr[j][i]+"\t");

            }
            System.out.println();
        }
    }
}
