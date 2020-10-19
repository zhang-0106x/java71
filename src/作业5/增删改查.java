package 作业5;

import java.util.Arrays;
import java.util.Scanner;

public class 增删改查 {
    public static void main(String[] args) {
        String[] names = {"Angelia", "Alice", "tome", "sam", "Jack", "Ruby", "Robin", "Anne"};
        //System.out.println("原有人员名单:" + Arrays.toString(names));
        String[] newNames = new String[names.length];
        newNames = Arrays.copyOf(names, newNames.length +2);
        //String[] newName = new String[newNames.length];
        int j = -1;
        int k = -1;
        int a = -1;
        String name, name1, name2, name3;
        boolean flay = true;
//a替代循环体内b的值，（因为b在循环体内无法在循环体外使用，用变量a来替代）【以上与此意相同】
        while (flay) {
            System.out.println("\n1.增加人员名单");
            System.out.println("2.修改人员名单");
            System.out.println("3.删除人员名单");
            System.out.println("4.显示全部人员名单");
            System.out.println("5.退出系统");
            Scanner input = new Scanner(System.in);
            System.out.println("********************************************************");
            System.out.println("-------请选择--------");
            int num = input.nextInt();

            switch (num) {
                case 1:
                    System.out.println("=======增加名单=======");
                    System.out.println("请输入需要增加的人员姓名:");
                    name = input.next();
                    for (int i = 0; i < newNames.length; i++) {
                        //找空值
                        if (newNames[i] == null) {
                            //打标记
                            j = i;
                            break;
                        }
                    }
                    if (j != -1) {
                        //把需要增加的元素赋值给j下标所对应的空值null
                        newNames[j] = name;
                        System.out.println("增加成功！");
                    } else {
                        System.out.println("人员已满，无法增加人数！");
                    }
                    // System.out.println("增加后的人员名单:" + Arrays.toString(newNames));
                    break;
                case 2:
                    System.out.println("=======修改名单=======");
                    System.out.println("请输入需要修改的人员姓名:");
                    name1 = input.next();
                    System.out.println("请输入修改后的人员姓名:");
                    name2 = input.next();
                    for (int n = 0; n < newNames.length; n++) {
                        //在数组中找需要修改的名字相同的下标
                        if (name1.equals(newNames[n])) {
                            //打标记
                            k = n;
                            break;
                        }
                    }
                    if (k != -1) {
                        //把所需要修改后的姓名赋值给K下标所指向的姓名，覆盖掉之前的姓名
                        newNames[k] = name2;
                        System.out.println("修改成功！");
                    } else {
                        System.out.println("抱歉，没有找到您需要修改的人员姓名！");
                    }
                    // System.out.println("修改后的人员名单:" + Arrays.toString(newNames));
                    break;
                case 3:
                    System.out.println("=======删除名单=======");
                    System.out.println("请输入需要删除额人员名单:");
                    name3 = input.next();
                    for (int b = 0; b < newNames.length; b++) {
                        //equals左边不能是空值
                        if (name3.equals(newNames[b])) {
                            a = b;
                            break;
                        }
                    }
                    if (a != -1) {
                        for (int c = a; c <newNames.length - 1; c++) {
                            newNames[c] = newNames[c + 1];
                        }
                        newNames[newNames.length - 1] = null;
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("抱歉，没有找到您需要删除的人员名单！");
                    }
                    // System.out.println("删除后的人员名单:" + Arrays.toString(newName));

                    break;
                case 4:
                    System.out.println("=======查询界面=======");
                    System.out.println("全部人员名单:");
                    for (int i = 0; i < newNames.length; i++) {
                        if (newNames[i] == null) {
                            break;
                        }
                        System.out.println(newNames[i]);

                    }
                    break;

                case 5:
                    flay = false;
                    System.out.println("=======退出系统=======");
                    break;
                default:
                    System.out.println("=======退出系统=======");
            }
        }
    }
}
