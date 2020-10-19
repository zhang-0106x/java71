package 课堂习题;

public class _9 {
    public static void main(String[] args) {
        //1、	本金10000元存入银行，年利率是千分之三。每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少？
        double a = 10000;
        double b1234 = 0.3 / 100;
        for (int i = 1; i <= 5; i++) {
            a = a + (a * b1234);


        }
        System.out.println("获得的本金是" + (int) a);
    }
}
