package 作业4;

import java.util.Arrays;
import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        //使用Arrays工具类Arrays.sort(数组名)升序排列一组字符char[] chars = {'a','c','u','b','e','p','f','z'}，
        // 并查找某个特殊字符在升序后数组中的位置(下标)。
        char[] chars = new char[]{'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'};
        //先排序
        /*for (int i = 0; i < chars.length - 1; i++) {
            for (int j = 0; j < chars.length - 1 - i; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j + 1];
                    chars[j + 1] = chars[j];
                    chars[j] = temp;
                }
            }
        }*/
        Arrays.sort(chars);//快捷排序
        System.out.println("排序后的的数组:" + Arrays.toString(chars));
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符:");
        char letter=input.next().charAt(0);
        int index=Arrays.binarySearch(chars, letter);
        System.out.println("输入的字符下标在:"+index);



    }
}
