package 课堂习题;

import java.util.Scanner;
//声明2个double 类型变量并赋值，判断第一个数大于10.0且第二个数小于20.0，打印两数之和，否则打印两数的乘积。
public class _2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数值");
        double a = input.nextDouble();
        System.out.println("请输入第二个数值");
        double b = input.nextDouble();

        if (a > 10.0 && b < 20.0) {

            System.out.println("两数之和是" + (a + b));
        } else {
            System.out.println("两数之积是" + (a * b));
        }
    }
}
