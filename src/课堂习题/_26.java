package 课堂习题;

import java.util.Scanner;

public class _26 {
    public static void main(String[] args) {

 Scanner input=new Scanner(System.in);
   System.out.println("请输入一个整数");
   int i,j;
   int num=input.nextInt();
   System.out.println("根据数值可以输出以下加法表");
   for(i=0,j=num;i<=num;i++,j--){
       //for(表达式1；表达式2；表达式3；)
       //表达式1（i初始值从0开始循环）（将所输入的num值赋给j）
       //表达式2（从i初始值开始循环到num值）
       //表达式3（i从初始值自加，j从num值自减）
       System.out.println(i+"+"+j+"="+(i+j));

   }
    }
}
