package 作业1;

import java.util.Scanner;

public class _3 {
    //商场消费返利活动，手动输入顾客消费金额，
    //如果金额打8折后仍然满1000元，用户就获得200元代金券一张（不考虑多张）

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入消费金额");
      double  consumption=input.nextDouble();
            double price=consumption*0.8;
            if(price>=1000){

                System.out.println("恭喜您获得200元的代金券一张");
        }else{
                System.out.println("付款"+price);
            }






    }
}
