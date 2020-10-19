package 数组;

import java.util.Arrays;

//倒置数组元素
public class _7 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 1, 5, 2};
        int i = 0;
        int j = arr.length - 1;
        int temp;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
