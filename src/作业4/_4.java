package 作业4;

import java.util.Arrays;
import java.util.Scanner;
//随机去重数，随机出来的数不能重复
public class _4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = new int[7];
        int[] count = new int[nums.length];
        int sum = 0;
        outer:
        for (int i = 0; i < nums.length; i++) {
            int num = (int) (Math.random() * 7 + 1);
            for (int j =0; j < i; j++) {
                if (num == nums[j]) {
                    i--;  //如果条件满足，i自减一次，再次回到外层循环再重新随机此次重复的值
                    //如果没有i自减，则返回外层循环i会直接跳过此次随机，不会在重新随机，直接进行下一次随机(即，i自加一次)
                    continue outer;
                }
            }
            nums[i] = num;

        }
        System.out.println("随机产生中奖号码是:" + Arrays.toString(nums));
        System.out.println("请输入7位数字:");
        for (int k = 0; k < count.length; k++) {
            count[k] = input.nextInt();
            if (count[k] == nums[k]) {
                sum++;
            }
        }

        switch (sum) {
            case 5:
                System.out.println("恭喜您中了三等奖，获得5万元奖金！");
                break;
            case 6:
                System.out.println("恭喜您中了二等奖，获得奥迪A6汽车一部！");
                break;

            case 7:
                System.out.println("恭喜您中了一等奖，获得五百万奖金！");
                break;
            default:
                System.out.println("很遗憾您未中奖，感谢参与！");
                break;
        }




/*
    public static void main(String[] args) {
        int[] nums = new int[7];
        int num = 0;
        int counter = 0;
        boolean isContinue = true;
        while (isContinue) {
            boolean isRepeat = false;
            //随机生成数
            num = (int) (Math.random() * 30 + 1);
            //判断原数组中有没有生成的数
            for (int i = 0; i < counter; i++) {
                if (num == nums[i]) {
                    //如果原数组中有的话就将isRepeat改成true
                    isRepeat = true;
                    break;
                }
            }
            //如果原数组中没有新生成的数，isReapeat还是false，执行if
            if (!isRepeat) {
                //将生成的num加入到nums数组中
                nums[counter++] = num;
            }
            //如果数组中的元素填满了，跳出while循环
            if(counter == nums.length){
                isContinue = false;
            }
        }
        System.out.println("随机产生的中奖号码为；" + Arrays.toString(nums));
        Scanner sc =new Scanner(System.in);
        int[] numbers = new int[7];
        int time = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("请输入第" + (i+1) + "个数：");
            numbers[i] = sc.nextInt();
            if(numbers[i] == nums[i]){
                time++;
            }
        }
        switch (time){
            case 5:
                System.out.println("恭喜您中了三等奖！");
                break;
            case 6:
                System.out.println("恭喜您中了二等奖！");
                break;
            case 7:
                System.out.println("恭喜您中了一等奖！");
                break;
            default:
                System.out.println("你未中奖，感谢参与！");
                break;
        }
*/
    }
}
