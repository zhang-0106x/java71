package 作业1;

public class _12 {
    public static void main(String[] args) {
        //猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个第二天早上又将剩下的桃子吃掉一半，
        // 又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。
        // 求第一天共摘了多少。

        int k =1;
        System.out.println("第10天摘了" +k+ "个桃");
        for (int i =9; i > 0; i--) {
            k = k * 2 +2;

            System.out.println("第" + i + "天摘了" +k+ "个桃");
        }


    }
}
