package 作业1;

public class _9 {
    //打印出1-100之间所有不是7的倍数和不包含7的数字，并求和
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {


            if (i % 7 != 0 && i % 10 != 7 && i / 10 % 10 != 7) {
                sum += i;
                System.out.print(i + "\t");


            }
            if (i % 10 == 0) {
                System.out.println();

            }


        }
        System.out.println("总和:" + sum);


    }
}
