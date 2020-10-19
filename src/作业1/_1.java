package 作业1;

import java.util.Scanner;

public class _1 {
//商场举行店庆，抽几折打几折，
//先手动输入消费金额，再输入，抽到的折扣，计算出折后价格

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            System.out.println("请输入消费金额");
            double consume = input.nextDouble();
            System.out.println("请输入抽中的折扣");
            double discount = input.nextDouble();
            double Price = consume * (discount/10);
            System.out.println("折后价格是：" +(int) Price);





    }


}
