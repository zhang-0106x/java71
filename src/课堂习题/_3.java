package 课堂习题;

import java.util.Scanner;
/*输入小明成绩，显示所获奖励,成绩==100分，想干啥就啥,成绩>=90,看电视、吃零食,90>成绩>=60，看书，写作业，
成绩<60，做家务、洗碗、拖地。
 */
public class _3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = input.nextInt();

        if (score == 100) {
            System.out.println("想干啥就干啥");
        } else if (score >= 90) {
            System.out.println("看电视、吃零食");
        } else if (score <90 && score >= 60) {
            System.out.println("看书，写作业");
        }


        else if (score < 60) {
            System.out.println("做家务、洗碗、拖地");
        }


    }
}
