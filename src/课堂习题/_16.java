package 课堂习题;

import java.util.Scanner;

public class _16 {public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    for (int i =3; i>=1; i--) {
        System.out.println("请输入用户名");
        int name = input.nextInt();
        System.out.println("请输入密码");
        int passWord = input.nextInt();
        if (name == 123 && passWord==456) {
            System.out.println("欢迎登录成功");
            break;
        }else  if (i!=1) {
            System.out.println("用户名和密码错误");
            System.out.println("你还有" + (i-1) + "次机会，请重新输入");
        }else {
            System.out.println("您已经没有权限进入！");
        }


    }
}
}
