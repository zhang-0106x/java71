package 课堂习题;



import java.util.Scanner;

    public class _1 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = input.next();
        boolean isNegetive = false;
        int score;
        int sum = 0;
        int avg;
        for (int i = 1; i < 5; i++) {
            System.out.println("请输入第" + i + "门课成绩");
            score = input.nextInt();
            if (score < 0) {
                isNegetive = true;
                break;


            }
            sum = sum + score;


        }
        if (isNegetive) {
            System.out.println("输入错误，请重新输入");

        } else {
            avg = sum / 4;

            System.out.println("请输入平均分" + avg);
        }







        }

    }


