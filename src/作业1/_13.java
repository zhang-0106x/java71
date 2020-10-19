package 作业1;

public class _13 {
    //编写程序解决“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡
    //一钱三只，现有百钱欲买百鸡，共有多少种买法？
    public static void main(String[] args) {
        int method = 0;

        for (int i = 0; i < 20; i++) { //公鸡

            for (int j = 0; j < (100 - i * 5) / 3; j++) { //母鸡

                int number = (100 - i * 5 - j * 3) * 3;//小鸡

                int count = i + j + number;//总共买的鸡

                if (count == 100) {

                    method++;

                    System.out.println("公鸡:" + i + "  母鸡:" + j + "  小鸡:" + number);

                }

            }

        }

        System.out.println("一共有" + method + "种方法。");

    }
}
