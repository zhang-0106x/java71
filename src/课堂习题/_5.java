package 课堂习题;

public class _5 {
    public static void main(String[] args) {
//	使用for循环输出1-100数字累加和。
        int i;
        int sum = 0;
        for (i = 0; i <= 100; i++) {
            sum = sum + i;


            System.out.println("第" + i + "个和是" + sum);


        }
    }
}
