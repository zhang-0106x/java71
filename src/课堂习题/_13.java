package 课堂习题;

import java.util.Scanner;

public class _13 {public static void main(String[]args){
 /*要求用户输入一个0到2之间的整数， * 如果用户输入0输出“你出的是石头”， *
        如果用户输入1就输出“你出的是剪刀”， * 如果用户输入的是2就输出“你出的是布”， *
        然后再问是否要继续出拳， * 如果回答“y”就重复以上过程，否则结束程序。
         */

       Scanner input = new Scanner(System.in);
        String answer=null;
        do {
            System.out.println("请输入0到2任意整输");
            int num = input.nextInt();


            if (num == 0) {

                System.out.println("你出的是石头");


            } else if (num == 1) {
                System.out.println("你出的是剪刀");


            } else {
                System.out.println("你出的是布");
            }



         System.out.println("是否要继续出拳  y/n");
        answer= input.next();}
        while (answer.equals("y") || answer.equals("Y")) ;

            System.out.println("结束程序");


}
}






