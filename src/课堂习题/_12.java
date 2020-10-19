package 课堂习题;

import java.util.Scanner;

public class _12 {
    public static void main(String[] args) {

        /*声明三个值相等
        循环赋值，输入的第一个随机数，一起赋值给a,b1234,（比如一次赋值为10，那么a,b1234,值都为10）第二次输入的随机数num不等于0的情况下，如果num>a,在赋值给a,
                (比如第二次随机数为20，那么大于第一次a的赋值10 ，在将20赋值给a,否则a还是10),如果这个值小于b,那么赋值给b(比如第二次随机数为5，
                那么小于于第一次b的赋值10 ，在将5赋值给b，否则b还是10)重复此循环，在重复判断赋值*/
        Scanner input = new Scanner(System.in);
        System.out.print("请输入整数(输入0结束)");
        int num = input.nextInt();
        int a, b;
        a = b = num;
        while (num != 0) {
            System.out.print("请输入整数(输入0结束)");
            num = input.nextInt();


            if (num != 0 && num > a) {
                a = num;
            } else if (num != 0 && num < b) {
                b = num;
            }
        }

        System.out.println("\n最大值是:" + a + "\t最小值是:" + b);

    }
}
