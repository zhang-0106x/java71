package ketang;

import java.util.Arrays;
import java.util.Scanner;

//二分法查找
public class exampile1 {
    public static void main(String[] args) {
            /*int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int searrchNum = 9;//要查找的数字
            int startIndex =0;//定义开始查找范围的下标
            int endIndex = arr.length - 1;//定义开始结束查找的下标
            int midIndex = -1;//中间值的下标
            boolean flag = false;

            do {
                midIndex = (startIndex + endIndex) / 2;
                if (arr[midIndex] == searrchNum) {
                    System.out.println("恭喜你找到了这个数， 其下标为" + midIndex);
                    flag = true;
                    break;
                }else if(arr[midIndex]>searrchNum){
                    endIndex=midIndex-1;
                }else {startIndex=midIndex+1;}
            }while (startIndex<=endIndex);
            if(!flag){
                System.out.println("很抱歉，没有找到你要的数字");
            }


*/
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你所需要查找的范围:");
        int num = input.nextInt();
        int arr[] = new int[num];
        outer:
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * num);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--;
                    continue outer;
                }
            }
            arr[i] = arr[i];
        }
        Arrays.sort(arr);
        System.out.println("你所需要查找范围内的数有:\n" + Arrays.toString(arr));
        System.out.println("请输入范围内所需要查找的数:");
        int nums = input.nextInt();
        boolean flay = false;
        int minIndex = 0;
        int maxIndex = arr.length - 1;
        int midIndex = -1;
        do {
            midIndex = (minIndex + maxIndex) / 2;
            if (arr[midIndex] == nums) {
                System.out.println("你需要找的数的下标是:" + midIndex);
                flay = true;
                break;
            } else if (midIndex > nums) {
                maxIndex = midIndex - 1;
            } else {
                minIndex = midIndex + 1;
            }

        } while (minIndex <= maxIndex);
        if (!flay) {
            System.out.println("很抱歉，没有找到你要的数字");
        }
    }

}