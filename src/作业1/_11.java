package 作业1;

public class _11 {
    //井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米       计算蜗牛需要多少天才能从井底到爬出来
    public static void main(String[] args) {
        double sum = 0;
        int day = 1;
        int i;
        while (true) {

            sum += 5;
            System.out.println("第:" + day + "天爬:" + sum + "米");

            if (sum >= 56.7) {
                break;
            }


            sum -= 3.5;
            day++;


        }
        System.out.println("蜗牛需要" + day + "天才能从井底到爬出来");


    }


}



