package 作业1;

import java.util.Scanner;

public class _6 {
    //编写程序，输入一个字符，判断它是否为小写字母，如果是，将它转换成大写字母，否则，不转换。
    public static void main(String[] args) {
        //小写字母的Ascll值为97-122
        //大写字母的Ascll值为65-90
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字母");
        char letter = input.next().charAt(0);
        if (letter >= 'a' && letter <= 'z') {
            System.out.println("你输入的是小写字母");
            letter= (char)(letter-32);//强转成字符类型，否则会直接显示成字母的Ascll值
            System.out.println("该字母的大写字母是:" + letter );

        } else if(letter >= 'A' && letter <= 'Z') {
            System.out.println("输入该字母是大写:" + letter);


        }


    }
}
