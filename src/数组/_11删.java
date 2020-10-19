package 数组;

import java.util.Arrays;
import java.util.Scanner;
//删除数组中的元素
public class _11删 {
    public static void main(String[] args) {
        String[] names=new String[]{"Tome", "Jack", "Sam","Alice",  "Ruby", "RObin"};
        Scanner input=new Scanner(System.in);
        String[]name1=new String[names.length];
        System.out.println("请输入要删除的人员名字:");
        String name=input .next();
        int j=-1;
        for(int i=0;i<names.length;i++){
            if(name.equalsIgnoreCase(names[i])){
                j=i;
                break;
            }
        }
        System.out.println("j="+j);
        if(j!=-1){
            for(int k=j;k<names.length-1;k++){
                names[k]=names[k+1];
            }
           //name1 = Arrays.copyOf(names, name1.length-1);
            names[names.length-1]=null;
            System.out.println(Arrays.toString(names));

        }else {
            System.out.println("很抱歉，没有你要删除的名字");
        }
        System.out.println("删除后的人员名单是:\n"+Arrays.toString(names));
       // System.out.println("删除后的人员名单是:\n"+Arrays.toString(name1));
    }
}
