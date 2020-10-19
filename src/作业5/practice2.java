package 作业5;

import java.util.Arrays;
import java.util.Scanner;

public class practice2 {
    //String[]names={"Angelia","Alice","tome","sam","Jack","Ruby","Robin","Anne"};
    //分别进行删、改、查操作。
    public static void main(String[] args) {
        String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", "Robin", "Anne"};
        Scanner input = new Scanner(System.in);
        System.out.println("请输入需要删除的元素:");
        String delete = input.next();
        System.out.println("请输入需要修改的元素:");
        String amend = input.next();
        System.out.println("请输入修改后的元素:");
        String newAmend = input.next();
        String[] newNames = new String[names.length];
        int j = -1;
        int l = -1;
        for (int i = 0; i < names.length; i++) {
            if (delete.equals(names[i])) {
                j = i;
                break;
            }
            if (amend.equals(names[i]) && !delete.equals(amend)) {
                l = i;
                break;
            }
        }
        if (delete.equals(amend)) {
            System.out.println("抱歉，您需要修改的元素已删除！");
        }
        if (j != -1) {
            for (int k = j; k < names.length - 1; k++) {
                names[k] = names[k + 1];
            }
            newNames = Arrays.copyOf(names, newNames.length - 1);
        } else {
            System.out.println("没有找到需要删除的元素！");

        }
        if (l != -1) {
            for (int k = l; k < names.length; k++) {

                names[k] = newAmend;
            }
        }
        System.out.println("删除元素后的数组是:" + Arrays.toString(newNames));
    }

}