package 作业2;

import java.util.Scanner;

//求出4家店的最低手机价格
public class _1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] price = new int[4];

        for (int i = 0; i < price.length; i++) {

            System.out.print("请输入第" + (i + 1) + "家手机店的价格:");
            price[i] = input.nextInt();
        }
        int min = price[0];
        for (int j = 1; j < price.length; j++) {
            if (price[j] > min) {
                min = min;


            } else {

                min = price[j];

            }


        }
        System.out.println("最低的价格是:" + min);

    }
}
