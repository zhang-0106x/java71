package ketang;

import java.util.Scanner;
//杨辉三角形
public class exampile5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入您要的杨辉三角形行数");
        int line = input.nextInt();
        int[][] arr = new int[line][line];

        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        for (int j = 0; j < arr.length; j++) {
            for (int k =1; k <j ; k++) {
                arr[j][k] = arr[j - 1][k - 1] + arr[j - 1][k];
            }
        }
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y <=x; y++) {
                System.out.print(arr[x][y] + "\t");
            }
            System.out.println("  ");
        }
        input.close();


    }

}














