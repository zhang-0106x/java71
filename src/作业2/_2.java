package 作业2;

import java.util.Scanner;

public class _2 {//数组存储5笔购物金额，在控制台输出并计算总金额

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入会员本月消费记录\n");
        double[] money = new double[5];
        int sum = 0;
        int i,j;

        for ( i = 0; i < money.length; i++) {
            System.out.print("请输入第" + (i+1) + "笔购物金额:");
            money[i] = input.nextDouble();
            sum += money[i]; }
        System.out.println("序号\t\t\t\t\t金额");
        for(j=0;j<money.length;j++){

        System.out.println((j+1) + "\t\t\t\t\t" + money[j]);}
        System.out.println("总金额:" + sum);



    }
}
