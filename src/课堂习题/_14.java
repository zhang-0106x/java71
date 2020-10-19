package 课堂习题;

public class _14 {
    public static void main(String[] args) {
        // 多重循环打印矩形
        for (int a = 1; a <= 5; a++) {
            for (int b = 1; b <= 5; b++) {

                System.out.print("*\t");


            }
            System.out.println(" ");
        }


        //平行四边形
        for (int a = 1; a <= 5; a++) {
            for (int c = 1; c <= 5 - a; c++) {

                System.out.print(" ");

            }
            for (int b = 0; b <= 5; b++) {
                System.out.print("*");

            }

            System.out.println("");


        }


        for (int a = 1; a <= 5; a++) {
            for (int c = 1; c <= 5 - a; c++) {


                System.out.print(" ");
            }
            for (int b = 1; b <= 2 * a - 1; b++) {
                System.out.print("*");


            }
            System.out.println(" ");


        }

        // 打印菱形
        for (int a = 1; a <= 4; a++) {
            for (int c = 1; c <= 4 - a; c++) {


                System.out.print("\t");
            }
            for (int b = 1; b <= 2 * a - 1; b++) {
                System.out.print(4 - a + "\t");


            }
            System.out.println();


        }
        for (int a = 3; a >= 1; a--) {
            for (int c = 1; c <= 4 - a; c++) {


                System.out.print("\t");
            }
            for (int b = 1; b <= 2 * a - 1; b++) {
                System.out.print(4 - a + "\t");


            }
            System.out.println();


        }

        //打印空心菱形

        for (int a = 1; a <= 4; a++) {
            for (int c = 1; c <= 4 - a; c++) {

                System.out.print(" \t");
            }
            for (int b = 1; b <= 2 * a - 1; b++) {
                if (b == 1 || b == 2 * a - 1) {
                    System.out.print((4 - a) + "\t");
                } else {
                    System.out.print(" \t");

                }


            }
            System.out.println(" ");
        }

        for (int a = 3; a >= 1; a--) {
            for (int c = 1; c <= 4 - a; c++) {


                System.out.print(" \t");
            }
            for (int b = 1; b <= 2 * a - 1; b++) {

                if (b == 1 || b == 2 * a - 1) {
                    System.out.print((4 - a) + "\t");
                } else {
                    System.out.print(" \t");

                }


            }
            System.out.println(" ");


        }

        //九九乘法口诀表
       /* 声明变量a并赋值1，判断a<=9,满足条件进入内循环体，声明b=1,判断b<=a,满足条件进行输出1*1=1，
        再回到执行b++，此时b=2,在判断b<=a,不满足条件回到a++,在判断a<=9,满足条件进去内循环，
        b重新赋值为1，（判断条件出循环外许从头开始执行），输出2*1.再回到b++,此时b=2,判断b<=a,满足条件，进去输出2*2。
        重复循环直到9*9结束。示例：运行顺序：1*1=1;2*1=2;2*2=4;3*1=3;3*2=6;3*3=9;.......  */


        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= a; b++) {

                System.out.print(b + "*" + a + "=" + (a * b) + "\t");

            }
            System.out.println("");
        }


    }
}

