package 作业1;

public class _10 {
    //有一个有钱的神经病，他往银行里存钱，
    //第一天存1元,以后每天比前一天多存50%，完成下列计算任务

    //

    public static void main(String[] args) {
        //（1)他存到第几天，当天存的钱会超过10元
        double money=1;
        int day=1;
        while(money<10) {
            money*=1.5;
            day++;

        }System.out.println("第"+day+"天money:"+money+"超过了10元");
        //（2)一个月（30天）后，他总共存了多少钱

   /*     double j = 1;
        int i;
        for (i =2; i <= 30; i++) {
            j = j + (j * 0.5);
            j++;


        }
        System.out.println("一个月（30天）后，他总共存了" + (j + 1) + "元");*/
    }
}







