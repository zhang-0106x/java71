package 吃货联盟;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        String[] names = new String[4]; //保存订餐人姓名
        String[] disMegs = new String[4];//保存所选信息，包括菜品名及份数
        int[] times = new int[4];         //保存送餐时间
        String[] addresses = new String[4];//保存送餐地址
        int[] states = new int[4];          //保存订单状态:0表示已预订，1表示已完成
        double[] sumPrices = new double[4];  //保存订单的总金额
        String[] dishNames = {"红烧带鱼", "鱼香肉丝", "时令鲜蔬"};//菜品名称
        double[] prices = new double[]{38.0, 20.0, 10.0};   //菜品价格
        int[] praiseNums = new int[3];               //点赞数
        boolean isEsc = false;  //判断是否退出系统
        int nums;    //声明变量作为返回菜单的判断条件
        System.out.println("欢迎使用吃“货联盟订餐系统”");
        System.out.println("************************************************");
        do {       //显示主菜单
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("************************************************");
            Scanner input = new Scanner(System.in);
            System.out.print("请选择:\t");
            int choose = input.nextInt();//记录用户的功能编号
            //根据用户输入的编号，执行相应的功能
            switch (choose) {
                case 1:            //我要订餐
                    System.out.println("*****我要订餐*****");
                    boolean isAdd = false;        //记录是否可以订餐
                    for (int j = 0; j < names.length; j++) {
                        if (names[j] == null) {    //找到第一个空位置，可以添加订单信息
                            isAdd = true;        //置标志位，可以订餐
                            System.out.println("请输入订餐人姓名:");
                            String name = input.next();
                            System.out.println("序号" + "\t" + "   菜名" + "\t" + "     单价" + "\t" + "    点赞数");
                            for (int i = 0; i < dishNames.length; i++) {
                                String price = prices[i] + "元";
                                String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "赞" : "0";
                                System.out.println((i + 1) + "\t   " + dishNames[i] + "\t " + price + "\t      " + priaiseNum);
                            }
                            //用户点菜
                            System.out.println("请选择您要点的菜品编号：");
                            int chooseDish = input.nextInt();
                            System.out.println("请选择您需要的份数");
                            int number = input.nextInt();
                            String dishMeg = dishNames[chooseDish - 1] + " " + number + "份";
                            double sumPrice = prices[chooseDish - 1] * number;
                            //餐费满50元，免送餐费5元
                            double deliCharge = (sumPrice >= 50) ? 0 : 5;

                            System.out.println("请输入送餐时间（送餐时间是10点到20点间整点送餐）:");
                            int time = input.nextInt();
                            while (time < 10 || time > 20) {
                                System.out.println("您的输入有误，请输入10~20间的整数！");
                                time = input.nextInt();
                            }
                            System.out.println("请输入送餐地址:");
                            String address = input.next();
                            //无须添加状态，默认是0.即已预订状态
                            System.out.println("订餐成功！");
                            System.out.println("您订的是:" + dishMeg);
                            System.out.println("送餐时间:" + time + "点");
                            System.out.println("餐费:" + sumPrice + "元，送餐费" + deliCharge + "元，" +
                                    "总计:" + (sumPrice + deliCharge) + "元。");
                            //添加数据
                            names[j] = name;
                            disMegs[j] = dishMeg;
                            times[j] = time;
                            addresses[j] = address;
                            sumPrices[j] = sumPrice + deliCharge;
                            break;


                        }


                    }
                    if (!isAdd) {

                        System.out.println("对不起您的餐袋已满!");

                    }
                    break;
                case 2:
                    System.out.println("*****查看餐袋*****");
                    System.out.println("序号" + "\t" + "订餐人" + "\t" + "餐品信息" + "\t\t" + "送餐时间" + "\t" + "送餐地址" + "\t\t" + "总金额" + "\t" + "订单状态");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String state = (states[i] == 0) ? "已预订" : "已完成";
                            String date = times[i] + "点";
                            String sumPrice = sumPrices[i] + "元";
                            System.out.println((i + 1) + "\t" + date + "\t" + disMegs[i] + "\t" + date +
                                    "\t" + addresses[i] + "\t" + sumPrice + "\t" + state);


                        }


                    }
                    break;
                case 3:  //签收订单
                    System.out.println("*****签收订单*****");
                    boolean isSignFind = false; //找到要签收的订单
                    System.out.println("请选择要签收的订单序号:");
                    int signOrderId = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        //状态为已预订，序号为用户输入的订单序号减1:可签收
                        //状态为已完成，序号为用户输入的订单序号减1:不可签收
                        if (names[i] != null && states[i] == 0 && signOrderId == i + 1) {
                            states[i] = 1;   //将状态值置为已完成
                            System.out.println("订单签收成功！");
                            isSignFind = true;//标记已找到此订单
                        } else if (names[i] != null && states[i] == 1 && signOrderId == i + 1) {
                            System.out.println("您选择的订单已完成签收，不能再次签收!");
                            isSignFind = true;       //标记已找到此订单

                        }
                    }
                    //未找到的订单序号，不可签收
                    if (isSignFind) {

                        System.out.println("您选择的订单不存在！");


                    }


                    break;
                case 4://删除订单
                    System.out.println("*****删除订单*****");
                    boolean isDelFind = false;   //标记是否找到要删除的订单
                    System.out.println("请输入要删除的订单序号:");
                    int delId = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        //状态值为已完成，序号值为用户输入的序号减1:可删除
                        //状态值为已预订，序号值为用户输入的序号减1:不可删除
                        if (names[i] != null && states[i] == 1 && delId == i + 1) {

                            isDelFind = true;   //标记已找到此订单
                            //执行删除操作:删除位置后的元素一次前移
                            for (int j = delId - 1; j < names.length - 1; j++) {
                                names[j] = names[j + 1];
                                disMegs[j] = disMegs[j + 1];
                                times[j] = times[j + 1];
                                addresses[j] = addresses[j + 1];
                                states[j] = states[j + 1];
                                sumPrices[j] = sumPrices[j + 1];
                            }
                            //最后一位清空
                            int endIndex = names.length - 1;
                            names[endIndex] = null;
                            disMegs[endIndex] = null;
                            times[endIndex] = 0;
                            addresses[endIndex] = null;
                            states[endIndex] = 0;
                            System.out.println("删除订单成功！");
                            break;


                        } else if (names[i] != null && states[i] == 0 && delId == i + 1) {
                            System.out.println("您选择的订单未签收，不能删除！");
                            isDelFind = true;      //标记已找到此订单
                            break;
                        }
                    }
                    //未找到改序号的订单:不能删除
                    if (isDelFind) {
                        System.out.println("您要删除的订单不存在！");
                    }

                    break;
                case 5:      //我要点赞
                    System.out.println("*****我要点赞*****");
                    //显示菜品信息
                    System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
                    for (int i = 0; i < dishNames.length; i++) {

                        String price = prices[i] + "元";
                        String priaiseNum = (praiseNums[i]) > 0 ? praiseNums[i] + "赞" : "";
                        System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + price + "\t" + priaiseNum);
                    }
                    System.out.println("请选择您要点赞的菜品序号:");
                    int priaiseNum = input.nextInt();
                    praiseNums[priaiseNum - 1]++;//点赞数加1
                    System.out.println("点赞成功!");

                    break;
                case 6:

                    isEsc = true;
                    break;

                default:
                    isEsc = true;
                    break;
            }

            if (!isEsc) {
                System.out.println("输入0返回");
                nums = input.nextInt();
            } else {
                break;
            }


        } while (nums == 0);


    }

}


