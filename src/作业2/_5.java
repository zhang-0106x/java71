package 作业2;

import java.util.Scanner;

public class _5 {
    //获取数组最大值和最小值操作：
    //利用Java的Math类的random()方法，随机生成10个数，填充一个数组，并找出产生10个随机数中最大的、最小的数。
    //提示：使用 int num=(int)(100*Math.random());
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (100 * Math.random());
            //产生0~100之间的随机数，若改变区间比如改为0~10区间则num[i]=int(10*Math.random())
            System.out.print(num[i] + "\t");
        }
        int max, min;
        max = min = num[0];
        for (int j = 1; j < num.length; j++) {
            if (num[j] > max) {

                max = num[j];

            }
            if (num[j] < min) {
                min = num[j];
            }


        }
        System.out.println("\n最大值是:" + max);
        System.out.println("最小值是:" + min);

    }

}
