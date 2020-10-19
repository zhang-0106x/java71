package 数组;
//修改数组中的元素
import java.util.Arrays;
import java.util.Scanner;

public class _12改 {
    public static void main(String[]args){
        String[] names = {"Tome", "Jack", "Sam","Alice",  "Ruby", "RObin"};
        Scanner input = new Scanner(System.in);
        System.out.print("请输入要修改的人员姓名:");
        String name = input.next();
        int k=-1;
        for ( int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                k=i;
                break;
            }
        }
        System.out.println("k=" + k);
        System.out.print("请输入修改后的人员姓名:");
        String name1=input.next();
        if (k!= -1) {
            names[k] =name1;
        } else {
            System.out.println("很抱歉，没有找到你要修改的人员姓名！");
        }
        System.out.println("修改后的人员名单是:\n"+ Arrays.toString(names));

    }

    }

