package 作业4;

import java.util.Arrays;
import java.util.Scanner;

public class _2 {
    //输入五种水果的英文名称(如葡萄grape，橘子orange，香蕉banana，苹果apple，桃peach)，
    // 编写一个程序，输出这些水果的名称(按照在字典里出现的先后顺序输出)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] fruits = new String[5];
        for (int i = 0; i < fruits.length; i++) {
            System.out.print("请输入第" + (i+1) + "个水果名称:");
            fruits[i] = input.next();
        }
        Arrays.sort(fruits); System.out.println("这些水果的英文名在字典中出现的顺序是:");
        for(String k:fruits){
            System.out.println(k);}
    }
}

