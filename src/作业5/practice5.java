package 作业5;

import java.util.Arrays;

public class practice5 {
    //公司年销售额求和
    //某公司按照季度和月份统计的数据如下：单位(万元)
    //第一季度：22,66,44
    //第二季度：77,33,88
    //第三季度：25,45,65
    //第四季度：11,66,99
    //提示：
    //1、按照季度列出二维数组；
    //2、分别对每个一维数组中的元素进行加法运算；
    // 3、输出运算结果
    public static void main(String[]args){
        int [][]saleRoom=new int[][]{{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
         int sums=0;
         for(int i=0;i<saleRoom.length;i++){
             int sum=0;
             for(int j=0;j<saleRoom[i].length;j++){
                 sum+=saleRoom[i][j];
                 System.out.print(saleRoom[i][j]+"\t");
             }
             sums+=sum;


             System.out.println("第"+(i+1)+"季度的总销售额是:"+sum);
         }    System.out.println("全年的销售额是:"+sums);

    }
}
