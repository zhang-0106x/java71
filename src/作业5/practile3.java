package 作业5;

import java.util.Arrays;
import java.util.Scanner;

public class practile3 {
    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 4, 6, 7, 8};
        System.out.println(Arrays.toString(num));
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();
        int newNum[] = new int[num.length];
            System.out.println("请输入需要添加几个数");
            newNum = Arrays.copyOf(num, newNum.length + nums);
            System.out.println("请输入需要添加元素的位置");
            int c = input.nextInt();
            System.out.println("请输入添加的元素");
            int b = input.nextInt();
            for (int a = 0; a < newNum.length; a++) {
                if (newNum[a] == 0) {
                    newNum[a] = b;
                    break;
                }








            }





        System.out.println("添加后的数组是:" + Arrays.toString(newNum));

    }

}
