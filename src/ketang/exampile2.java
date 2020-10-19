package ketang;
//二分法
public class exampile2 {
    public static int binarySearch(int[]arr,int num){
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] < num) {
                low = mid + 1;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[]arr={5,13,19,21,37,56,64,75,80,88,90};
        int index=binarySearch(arr,21);
        System.out.println("二分查找算法测试");
        System.out.println("key=21的下标为:"+index);

    }
}
