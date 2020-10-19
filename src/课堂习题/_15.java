package 课堂习题;

public class _15 {
    public static void main(String[] args) {
    // 编写JAVA程序，实现输出1-100中的所有不能被7整除的数，并求和。
      int sum=0;
        for(int i=1;i<=100;i++){
            if(i%7!=0){
                sum+=i;
                System.out.print(i+"\t");
                  if(i%10==0||i%71==0){
                      System.out.println("");

                  }
            }

        }System.out.println("1-100不能被7整除数之和:"+sum);


}}
