package 数组;

import java.util.Arrays;
import java.util.Scanner;

public class _5 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int nums[]=new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(int)(Math.random()*9);
        } System.out.println("冒泡排序前的随机数是:"+ Arrays.toString(nums));
        System.out.println();
        for(int j=0;j<nums.length-1;j++){//要比多少次
            for(int k=0;k<nums.length-1-j;k++){//依次循环比较
                if(nums[k]<nums[k+1]){
                    int temp=nums[k];
                    nums[k]=nums[k+1];
                    nums[k+1]=temp;
                }
            }
        }System.out.println("冒泡排序后的随机数是:"+Arrays.toString(nums));
    }
}
