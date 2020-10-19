package 数组;

public class _4 {
    //二重循环实现冒泡排序,升序排序
    public static void main(String[]args){
        int nums[]=new int[]{21,34,4,56,77,1,9,};
        System.out.println("*******冒泡排序前*******");
        for(int num:nums){
            System.out.print(num+"\t");
        }
           //冒泡排序升序
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }
        System.out.println("\n*******冒泡排序后*******");
        for(int num:nums){
            System.out.print(num+"\t");
        }
    }
}
