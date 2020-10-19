package 数组;

//有一组学员成绩{99,85,82,63,60}，将他们按降序排列
//要增加一个学员的 成绩，将他插入成绩序列，并保持降序

import java.util.Scanner;

public class _2 {
    public static void main(String[] args) {
        //int list[]=new int[]{99,85,82,63,60};
        int list[] = new int[6];
        list[0] = 99;
        list[1] = 85;
        list[2] = 82;
        list[3] = 63;
        list[4] = 60;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入想要插入的学员成绩");
        int num = input.nextInt();
        //找到num要插入的位置index     找到num比数组中元素(第一个)大的位置
        //int  index=0;
        //当用户插入一个比原数组所有的数都小的时候。int index=0就会出现异常更改为int index=lise.length-1;
        int index =list.length-1;
        for (int i = 0; i < list.length; i++) {
            if (num > list[i]) {
                index = i;
                break;
            }
        }//原index位置及以后的所有数据位置要整体往后移
        for (int i = list.length - 1; i > index; i--) {

            list[i] = list[i - 1];   //list.length-1=5   list[5]=list[4]
        }
        //在index位置将num插入进去
        list[index] = num;
        System.out.println("插入成绩的下标是:" + index);
        System.out.println("插入新的成绩最后是:");
        for (int listnum : list) {
            System.out.print(listnum + "\t");

        }

    }

}

