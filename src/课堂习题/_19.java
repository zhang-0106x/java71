package 课堂习题;

public class _19 {
    public static void main(String[] args) {
        //3、使用循环输出 100、95、90、85.......5
//提示：可尝试使用for、while、do-while三种循环实现


        for (int i = 100; i >= 1; i--) {


            if (i % 5 != 0) {
                continue;


            }
            System.out.print(i + "\t");


        }





    }
}
