package 作业5;

import java.util.Arrays;
import java.util.Scanner;

public class practice1 {
    //String[]names={"Angelia","Alice","tome","sam","Jack","Ruby",null,"Robin","Anne"};进行增操作。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", null, "Robin", "Anne"};
        System.out.println("请输入要增加的元素");
        String count = input.next();
        int j = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == null) {
                j = i;
            }
        }
        if (j != -1) {
            names[j] = count;
        } else {
            System.out.println("数组已满，无法加入元素！");
        }
        System.out.println("增加后的数组是:" + Arrays.toString(names));

    }
}
