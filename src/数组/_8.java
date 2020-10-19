package 数组;

import java.util.Arrays;

public class _8 {
    public static void main(String[] args) {

        //如果两个指定的int数组彼此 相等 ，则返回 true 。
        System.out.println("----------equals(arr1,arr2)方法----------");
        int []arr1 = {20, 60, 40, 30};
        int []arr2 = {20, 60, 40, 30};
        int []arr3 = {30, 50, 70};
        System.out.println("判断两个元素是否相等");
        System.out.println("判断arr1数组与arr2数组中元素是否相等:" + Arrays.equals(arr1, arr2));
        System.out.println("判断arr1数组与arr3数组中元素是否相等:" + Arrays.equals(arr1, arr3));
        System.out.println();





            //复制指定的数组，用零截取或填充（如有必要），以便复制具有指定的长度
        System.out.println("------------fill(array,val)-----------方法");
        int[] arr4 = new int[]{10, 50, 30, 40};
        Arrays.fill(arr4, 0, 3, 66);//取下标范围（不包括范围内最后一个下标）来进行替换
        System.out.println("将arr4数组中的元素替换成新的内容:" + Arrays.toString(arr4));
        System.out.println();




        //将指定数组的指定范围复制到新数组中。
        System.out.println("-----------copyOf(array,length)方法----------");
        int []arr5 = new int[]{10, 50, 30, 40};
        int []arr6 = Arrays.copyOf(arr5, 4);//选择复制数组中4个元素， newlength选择复制多少个元素
        System.out.println("将arr5数组中的元素复制到arr6的数组中:" + Arrays.toString(arr6));
        int[] arr7 = Arrays.copyOf(arr5, 6);//选择复制数组中6个元素，
        System.out.println("将arr5数组中的元素复制到arr7的数组中:" + Arrays.toString(arr7));
        int[] arr8 = Arrays.copyOf(arr5, 3);//选择复制数组中3个元素，
        System.out.println("将arr5数组中的元素复制到arr8的数组中:" + Arrays.toString(arr8));





          //使用二叉搜索算法搜索指定值的指定数组的范围。
        System.out.println();
        System.out.println("------------binarysearch(array,val)的方法----------");
        int[] arr9 = {20, 30, 60, 10, 90};
        Arrays.sort(arr9);//[10,20,30,60,90]    先排序在取下标
        int index = Arrays.binarySearch(arr9, 60);
        System.out.println("查询元素60在数组中下标是:"+index);
    }
}
