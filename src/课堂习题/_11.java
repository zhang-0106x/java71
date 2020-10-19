package 课堂习题;

public class _11 {public static void main(String[]args)
{//使用for循环输出100~1000之间所有水仙花数。
//所谓水仙花数就是一个三位数，它各位的立方之和加起来的数值等于本身，
//比如说，153,   153 = 1 + 125 + 27

        for (int i = 100; i <= 1000; i++) {
            int gewei = i % 10;
            int shiwei = i / 10 % 10;
            int baiwei = i / 100 % 10;

            if (i == (baiwei * baiwei * baiwei) + (shiwei * shiwei * shiwei) + (gewei * gewei * gewei)) {
                System.out.println(i);
            }
        }







}



}
