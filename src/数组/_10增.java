package 数组;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
//数组增加元素
public class _10增 {
    public static void main(String[] args) {
        String[] names = {"Tome", "Jack", "Sam", null,"Alice",  "Ruby", "RObin"};
        Scanner input = new Scanner(System.in);
        System.out.print("请输入增加的人员姓名:");
        String name = input.next();
        int k=-1;
        for ( int i = 0; i < names.length; i++) {
            if (names[i] == null) {
               k=i;
                break;
            }
        }
        System.out.println("k=" + k);
        if (k!= -1) {
            names[k] = name;
        } else {
            System.out.println("数组已满，无法加入元素");
        }
        System.out.println("增加后的人员名单是:\n"+ Arrays.toString(names));

        }
    }

