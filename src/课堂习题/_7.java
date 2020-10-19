package 课堂习题;

public class _7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i % 4 == 0) {
                //continue;//结束本次循环进入下一次循环
                break;//终止某循环，结束程序
                // return;//终止main，输出本循环输出语句，不往下走，结束程序


            }
            System.out.println(i);
        }
        System.out.println("循环结束");


    }
}
