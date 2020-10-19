package 课堂习题;

public class _18 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.print(" 2 3 5 7  ");

        for (int i = 10; i <= 100; i++) {


            if ((i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)) {

                System.out.print(i + "  ");
                sum++;

            }
        }System.out.println("1~100所有质数个数"+(sum+4));

    }
}
