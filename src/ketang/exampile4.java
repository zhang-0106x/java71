package ketang;

import java.util.Scanner;

public class exampile4 {
    //选择排序
    //定义数组
    //循环比较，下标为i 的元素依次和所有的元素比较，找到本轮最小（大）的元素
    //交换元素  将最小元素与下标为i 的元素交换
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组空间:");
        int size=input.nextInt();
        int[] arr = new int[size];
        System.out.println("请输入元素值:");
        for (int x=0;x<arr.length;x++){
            arr[x]=input.nextInt();
        }

        int min = -1;//最小值下标

        for (int i = 0; i < arr.length - 1; i++) {   //外层循环:比较几轮
            min = i;//每轮名min,初始值
            for (int j = i + 1; j < arr.length; j++) {  //内层:当前元素和后面的元素比较，记录最新的最小元素下标

                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min !=i) {    //如果min值发生变化，说明发现了更小的值，则将当前值和更小值交换，保证小值放在前面
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        for (int num : arr) {  //输出排序后的数组
            System.out.print(num+"\t");
        }
    }

}

