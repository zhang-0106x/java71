package 作业3;

public class _2 {
    //2. 定义一个数组int[] nums={8,7,3,9,5,4,1}
    //输出数组中的最大值和最大值所在的下标
    public static void main(String[]args){
        int nums[]=new int[]{8,7,3,9,5,4,1};
        int max;
        int min;
        max=min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }

        }

        System.out.println("数组中最大值是："+max);

        for(int j=0;j<nums.length;j++){
            if(nums[j]==max){   //数组下标值如果与最大值相等，那么此下标就是最大值下标
                System.out.println("最大值下标:"+j);
            }

        }
    }
}
