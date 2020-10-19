package 作业4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _3 {
    //int[] arr11 = {1, 2, 3, 4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3}; 数组去重
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 3, 2, 4, 5, 6, 7, 4, 32, 2, 1, 1, 4, 6, 3};
        Arrays.sort(arr);
        System.out.println("去重前的数组:" + Arrays.toString(arr));
        // 先确定新数组的长度
        int[] newArr = new int[arr.length];
        int index = 0; // 新数组存储元素索引(或者说无重复的个数)
        outer:
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //当数据重复时,跳出外圈循环
                if (arr[i] == arr[j]) {
                    continue outer;
                }
            }
            // 后面没有与当前元素重复的值,保存这个数
            newArr[index] = arr[i];
            index++;
        }
        // 新数组中存储着无重复的值和后面一些无效的0
        int[] count = new int[index];
        for (int i = 0; i < index; i++) { // 遍历有效值个数
            count[i] = newArr[i];
        }
        System.out.println("去重后的数组:" + Arrays.toString(count));





    }


}
