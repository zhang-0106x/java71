package 数组;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class _9 {
    public static void main(String[] args) {
        String[] oldFruits = new String[]{"Apple", "Peach", "Banana", "Grape"};
        String[] newFruits = new String[oldFruits.length + 1];
        // System.arraycopy(oldFruits,0,newFruits,0,oldFruits.length);
        newFruits = Arrays.copyOf(oldFruits, oldFruits.length + 1);
        for (int i = 0; i < newFruits.length; i++) {
            if (newFruits[i] == null) {
                newFruits[i] = "Orange";
                break;
            }
        }
        System.out.println(Arrays.toString(newFruits));

//合并数组
        int[] a=new int[]{1,2,3,4};
        int []b=new int[]{5,6,7,8};
        int[]c=new int[a.length+b.length];

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        System.out.println(Arrays.toString(c));
    }

}