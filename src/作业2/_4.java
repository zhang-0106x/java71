package 作业2;

import java.util.Scanner;

public class _4 {
    //数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
    // 程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] word = {"my", "you", "is", "if", "id", "how", "who", "java", "word", "else"};
        System.out.println("请输入单词");
        String words = input.next();
        boolean flay = false;
        for (String i : word) {
            if (words.equals(i)) {

                flay = true;
                break;

            }


        }
        if (flay) {
            System.out.println("yes!");


        } else {

            System.out.println("no!");


        }


    }
}
